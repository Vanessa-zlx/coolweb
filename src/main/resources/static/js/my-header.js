Vue.component('my-header', {
    props: {
        user: {
            type: Object,
            required: true
        }
    },
    data: function () {
        return {
            wd:""
        }
    },
    methods: {
        reg(){
            console.log(location.href)
            if (location.href !== "/reg.html") {
                this.$emit('reg');
                location.href="/reg.html"
            }
        },
        login() {
            console.log(location.href)
            if (location.href !== "/reg.html") {
                this.$emit('login');
                location.href="/login.html"
            }
        },
        logout(){
            console.log("Logout")
            this.$emit('logout');/*无法使用axios，无法统一跳转*/
        }
    },
    created: function () {
    },
    template: `
        <div class="center" style="width: 1550px; ">
            <el-row :gutter="parseInt(20)" style="background-color: #f9f9f9;border-radius: 25px">
                <el-col :span="parseInt(4)">
                    <a href="/">
                        <img src="imgs/icon.png" height="65" alt="" style="border-radius: 50%;">
                    </a>
                </el-col>

                <el-col :span="parseInt(10)">
                    <el-menu mode="horizontal" default-active="0"  active-text-color="orange" background-color="rgba(255, 255, 255, 0)">
                        <el-menu-item index="0"><a href="index.html">
                            <svg t="1718888348054" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="1528" width="32" height="32"><path d="M924.376537 452.433346 588.304362 97.607038c-20.88568-22.030759-48.796356-34.152844-78.719876-34.152844s-57.833173 12.123109-78.719876 34.152844L94.793458 452.433346c-34.675754 36.619012-30.211069 68.283176-24.475438 81.496106 4.087085 9.385764 17.876136 35.175127 57.621349 35.175127l49.251727 0 0 272.955672c0 61.980633 43.87937 120.329553 106.222253 120.329553l56.532551 0 86.546122 0 0-64.145949L426.492022 673.509441c0-30.968315-4.632507-48.221258 26.562982-48.221258l56.531528 0 56.530504 0c31.195489 0 26.562982 17.252943 26.562982 48.221258l0 224.734414 0 64.145949 86.532819 0 56.546877 0c62.34186 0 106.222253-58.348919 106.222253-120.329553L841.981968 569.104579l49.251727 0c39.744189 0 53.534264-25.789363 57.621349-35.175127C954.588629 520.716522 959.053314 489.052359 924.376537 452.433346zM891.231649 512.920976l-42.411949 0L820.562123 512.920976l-33.978882 0 0 329.139276c0 30.968315-19.677155 64.144926-50.825572 64.144926l-87.683015 0L648.074653 673.509441c0-61.96426-19.584034-104.404862-81.959663-104.404862l-56.530504 0-56.531528 0c-62.388932 0-81.95864 42.441625-81.95864 104.404862l0 232.695736-87.681992 0c-31.16479 0-50.825572-33.17661-50.825572-64.144926L232.586754 512.920976 198.606849 512.920976l-28.256554 0-42.411949 0c-0.983397 0-1.87572-3.866051-2.677992-3.921309 1.906419-3.403516 5.205559-12.016685 10.701736-17.806551l336.100828-354.573551c10.034541-10.619872 24.218588-17.118889 37.959543-16.983813 13.727653-0.135076 27.049053 6.363941 37.083593 16.983813l336.100828 354.573551c5.479805 5.79089 8.795317 14.403035 10.701736 17.806551C893.106346 509.054925 892.215046 512.920976 891.231649 512.920976z" fill="#272636" p-id="1529"></path></svg>首页</a></el-menu-item>
                        <el-menu-item index="1"><a href="gkindex.html">
                            <svg t="1718887954847" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="3577" width="32" height="32"><path d="M256 85.333333h512c64.8 0 117.333333 52.533333 117.333333 117.333334v618.666666c0 64.8-52.533333 117.333333-117.333333 117.333334H256c-64.8 0-117.333333-52.533333-117.333333-117.333334V202.666667c0-64.8 52.533333-117.333333 117.333333-117.333334z m0 64a53.333333 53.333333 0 0 0-53.333333 53.333334v618.666666a53.333333 53.333333 0 0 0 53.333333 53.333334h512a53.333333 53.333333 0 0 0 53.333333-53.333334V202.666667a53.333333 53.333333 0 0 0-53.333333-53.333334H256z m170.666667 618.666667a32 32 0 0 1 0-64h170.666666a32 32 0 0 1 0 64H426.666667z" fill="#000000" p-id="3578"></path></svg>
                            手办</a></el-menu-item>
                        <el-menu-item index="2"><a href="https://www.osnode.cn/">
                            <svg t="1718888010056" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="7367" width="32" height="32"><path d="M890.175 510.476c-3.608 209.441-169.818 375.647-379.258 379.254-209.452 3.608-375.736-175.244-379.25-379.254-3.607-209.452 175.24-375.74 379.25-379.254 209.456-3.608 375.744 175.24 379.258 379.254 0.683 39.616 62.184 39.681 61.5 0C947.747 282.367 779.11 99.223 553.72 71.928 327.607 44.547 119.133 213.131 77.33 431.658 34.671 654.637 177.98 870.915 391.534 934.87c218.948 65.57 446.011-61.138 530.682-266.08 20.6-49.863 28.536-104.69 29.459-158.315 0.683-39.68-60.818-39.614-61.5 0.001z" p-id="7368"></path><path d="M506.967 675.328L650.08 532.22c11.847-11.847 11.847-31.641 0-43.488l-143.112-143.11c-28.067-28.067-71.554 15.42-43.487 43.487L606.59 532.22v-43.487L463.48 631.84c-28.067 28.068 15.42 71.555 43.487 43.488z" p-id="7369"></path></svg>友站</a></el-menu-item>
                    </el-menu>
                </el-col>

                <el-col :span="parseInt(6)">
                    <el-input style="margin-top: 15px" v-model="wd" @keydown.native.enter="search()" placeholder="请输入搜索的关键字">
                        <el-button slot="append" @click="search()" icon="el-icon-search"></el-button>
                    </el-input>
                </el-col>

                <el-col :span="parseInt(2)">
                    <el-popover v-if="!user.id"
                                placement="top-start"
                                title="欢迎来到Cool web!"
                                width="200"
                                trigger="hover">
                        <div slot="reference">
                            <i class="el-icon-user"
                               style="font-size: 30px;position: relative;top: 20px"></i>
                        </div>
                        <el-button style="background-color: orange" @click="reg()">注册</el-button>
                        <el-button style="background-color: orange" @click="login()">登录</el-button>
                    </el-popover>
                    <el-popover v-else
                                placement="top-start"
                                title="欢迎来到ACG导航!"
                                width="200"
                                trigger="hover">
                        <div slot="reference">
                            <i class="el-icon-user"
                               style="font-size: 30px;position: relative;top: 20px"></i>
                        </div>
                        <div style="text-align: center">
                            <a href="/personal.html">
                                <el-avatar :src="user.avatarUrl">
                                </el-avatar>
                            </a>
                            <hr>
                            <a href="/personal.html">个人中心</a>
                            <a href="javascript:void(0)" @click="logout()">退出登录</a><br>
                            <a v-if="user.admin == true" href="/admin.html">后台管理页面</a>
                        </div>
                    </el-popover>
                </el-col>

                </el-row>
            </div>
    `
})

