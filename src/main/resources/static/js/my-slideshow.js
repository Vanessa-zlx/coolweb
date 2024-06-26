Vue.component('my-slideshow', {
    props: {
        bannerArr: {
            type: Array,
            required: true
        }
    },
    data: function () {
        return {

        }
    },
    methods: {
    },
    created: function () {
    },
    template: `
            <el-carousel height="600px">
                <el-carousel-item v-for="b in bannerArr" :key="b.id">
                    <img :src="b.bannerUrl" width="100%" alt="" style="width:1200px; height: 600px; object-fit: cover;">
                </el-carousel-item>
            </el-carousel>
    `
})