Vue.component('my-footer', {
    data: function () {
        return {
        }
    },
    methods: {
    },
    created: function () {

    },
    template: `

            <div class="center" style="color: #666; width: 1600px" >
                <el-row style="background-color: #f9f9f9; border-radius: 25px; ">
                    <el-col :span="6" style="padding: 20px">
                        <img src="imgs/icon.png" style="margin-left: 0px;  height: 40px">
                        <p style="font-size: .875rem !important; text-indent: 2em; line-height: 25px;
                        letter-spacing: 5px; color: #6c7574;
                        ">酷安网成立于2010年4月，是一个新兴的Android手机精品资源下载分享站。</p>
                        <p style="font-size: .875rem !important; text-indent: 2em; line-height: 25px;
                        letter-spacing: 5px; color: #6c7574;
                        ">酷安网致力于打造中文领域的Android应用分发和分享平台，为用户发掘精品应用，提供分享、点评、下载等一站式服务。</p>
                        <p style="font-size: .875rem !important; text-indent: 2em; line-height: 25px;
                        letter-spacing: 5px; color: #6c7574;
                        ">酷安网的口号是“发现科技新生活”。</p>
                    </el-col>
                    <el-col :span="12" style="text-align: center;">
                        <el-row id="footer_center" style="padding: 20px 40px">
                            <el-col :span="8">
                                <p>关于我们</p><p>社区交流</p>
                                <p>我发投稿</p><p>在线反馈</p>
                            </el-col>
                            <el-col :span="8">
                                <p>联系我们</p><p>广告投放</p>
                                <p>用户协议</p><p>友情链接</p>
                            </el-col>
                            <el-col :span="8">
                                <p>Archiver</p><p>手机版</p>
                                <p>小黑屋</p><p>在线反馈</p>
                            </el-col>
                        </el-row>

                    </el-col>
                    <el-col :span="6" style="text-align: center;">
                        <div style="margin-top: 30px">
                            <span style="color: orange; margin-right: 30px">
                            <img src="imgs/qrcode.jpg" alt="" style="width: 82px; height: 82px;">   
                            </span>
                            <span style="color: orange; margin-right: 30px">
                            <img src="imgs/qrcode.jpg" alt="" style="width: 82px; height: 82px">
                            </span>
                            <span style="color: orange">
                            <img src="imgs/qrcode.jpg" alt="" style="width: 82px; height: 82px">
                            </span>
                           
                        </div>
                        <div>
                         <span style="color: #6c7574; margin-right: 55px; font-size: 12px">
                            扫码关注我
                            </span>
                            <span style="color: #6c7574; margin-right: 15px;font-size: 12px">
                            扫码关注我
                            </span>
                            <span style="color: #6c7574;font-size: 12px;margin-left: 40px">
                            扫码关注我
                            </span>
</div>
                            <p>打造最全二次元网站</p>
                    </el-col>
                </el-row>
            </div>
    `
})