import org.json.*;
public class parse_nest_json {
    public static void main(String[] args){
        String jsonstr = "{\"sign\":\"ERITJKEIJKJHKKKKKKKHJEREEEEEEEEEEE\"," +
                "\"alipay_fund_trans_toaccount_transfer_response\":{" +
                "\"pay_date\":\"2013-01-01 08:08:08\"," +
                "\"code\":\"10000\"," +
                "\"order_id\":\"20160627110070001502260006780837\"," +
                "\"msg\":\"Success\"," +
                "\"out_biz_no\":\"3142321423432\"}}";

        JSONObject joResult = new JSONObject(jsonstr);
        JSONObject joAftttr = (JSONObject) joResult.get("alipay_fund_trans_toaccount_transfer_response");
        System.out.println("msg:" + joAftttr.getString("msg"));
    }
}
