// CommentsComponent.js
Vue.component('comments', {
    props: {
        comments: {
            type: Array,
            required: true
        },
        user: {
            type: Object,
            required: true
        }
    },
    template: `
<div>
    <div class="comments-list">
        <el-divider></el-divider>
        <div> 
            <el-button icon="el-icon-s-comment" type="primary"
            @click="openCommentDialog(null)">我也说两句</el-button>
        </div>
        <el-divider></el-divider>
        <div class="comments-box" v-for="(comment, index) in paginatedComments" :key="comment.id">
            <div class="comments">
                <div class="comment">
                    <span class="comment-author">{{ comment.author }}</span>
                    <span class="comment-content" 
                        @click="openCommentDialog(comment)">{{ comment.content }}</span>
                        <i class="el-icon-time">{{comment.date}}</i>
                    <el-button @click="openCommentDialog(comment)" type="text" style="color: #cccccc">回复</el-button>
                    <el-button v-if="comment.replies.length > 0 && !comment.showReplies" @click="toggleReplies(index)" 
                        style="float: right;" type="text">
                        <i class="el-icon-arrow-down" >展开</i>
                    </el-button>
                    <el-button v-if="comment.replies.length > 0 && comment.showReplies" @click="toggleReplies(index)" 
                        style="float: right;" type="text">
                        <i class="el-icon-arrow-up" >隐藏</i>
                    </el-button>
                    <div class="comment" v-if="comment.replies.length > 0 && comment.showReplies" 
                    v-for="reply in comment.replies" :key="reply.id" >
                        <span class="comment-author">{{ reply.author }}</span>
                        <span class="comment-content"
                        @click="openCommentDialog(reply)">{{ reply.content }}</span>
                        <i class="el-icon-time">{{reply.date}}</i>
                        <el-button @click="openCommentDialog(reply)" type="text" style="color: #cccccc">回复</el-button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <el-dialog
        title="评论"
        :visible.sync="showCommentDialog"   
        width="30%"
        @close="closeCommentDialog"
    >
        <div class="comment-dialog">
            <el-input v-model="commentContent" placeholder="请输入内容"></el-input>
<!--            <textarea v-model="commentContent" placeholder="请输入评论内容"></textarea>-->
            <el-divider></el-divider>
            <el-button type="primary" @click="submitComment">提交评论</el-button>
        </div>
    </el-dialog>

    <el-pagination
            @current-change="handleCurrentChange"
            :current-page="currentPage"
            :page-size="pageSize"
            :total="comments.length"
            layout="prev, pager, next"
            v-if="comments.length > 0"
    ></el-pagination>

</div>

      
  `,
    data() {
        return {
            currentPage: 1,
            pageSize: 5,
            showCommentDialog: false,
            commentToReply: null,
            commentContent: ''
        };
    },
    computed: {
        paginatedComments() {
            const startIndex = (this.currentPage - 1) * this.pageSize;
            const endIndex = startIndex + this.pageSize;
            return this.comments.slice(startIndex, endIndex);
        }
    },
    methods: {
        handleCurrentChange(val) {
            this.currentPage = val;
            this.comments.forEach(comment => {
                comment.showReplies = true;
            });
        },
        toggleReplies(index) {
            this.comments[index].showReplies = !this.comments[index].showReplies;
        },
        openCommentDialog(comment) {
            // location.href = "/login.html";
            // 打开评论对话框，并设置评论对话框的内容
            if (this.user.id===null){
                this.$message({
                    showClose: true,
                    message: '请登录后再评论',
                    type: 'warning'
                });
                return
            }
            this.showCommentDialog = true;
            this.commentToReply = comment; // 将被回复的评论传递给评论对话框组件
        },
        closeCommentDialog() {
            // 关闭评论对话框
            this.showCommentDialog = false;
            this.commentToReply = null; // 清空评论对象
        },
        submitComment() {
            // 触发关闭评论对话框的事件
            // 将 commentToReply 和 commentContent 通过事件传递给父组件
            let targetId = null;
            if (this.commentToReply!=null){
                targetId= this.commentToReply.id;
            }
            this.$emit('submit-comment', {
                commentToReply: targetId,
                commentContent: this.commentContent
            });
            this.showCommentDialog = false;
            this.commentContent = '';// 清空评论内容
        }
    },
    mounted() {
        // 动态加载CSS
        const style = document.createElement('link');
        style.rel = 'stylesheet';
        style.href = '../css/comment.css';
        document.head.appendChild(style);
    }
});
