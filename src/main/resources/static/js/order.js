// CommentsComponent.js
Vue.component('order', {
    props: {
        orders: {
            type: Array,
            required: true
        },
    },
    template: `
  <div>
    <h2>订单列表</h2>
    <el-table :data="orders" style="width: 100%">
      <el-table-column prop="tradeNo" label="订单号"></el-table-column>
      <el-table-column prop="subject" label="订单主题"></el-table-column>
      <el-table-column prop="totalAmount" label="订单金额"></el-table-column>
      <el-table-column label="支付状态">
        <template slot-scope="scope">
          <el-button v-if="scope.row.alipayTradeNo">
            已支付
          </el-button>
          <el-button v-else @click="pay(scope.row)">待支付</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
  `,
    data() {
        return {
        };
    },
    methods: {
        pay(order){
            this.$emit('pay',order)
        }
    },
    mounted() {

    }
});
