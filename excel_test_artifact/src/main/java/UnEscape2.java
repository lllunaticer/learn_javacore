import org.apache.commons.text.StringEscapeUtils;

public class UnEscape2 {
    public static void main(String[] args){
        //String str1 = "{\"resourceId\":\"dfead70e4ec5c11e43514000ced0cdcaf\",\"properties\":{\"process_id\":\"process4\",\"name\":\"\",\"documentation\":\"\",\"processformtemplate\":\"\"}}";
        String str1 ="{\"sign\":\"ERITJKEIJKJHKKKKKKKHJEREEEEEEEEEEE\"," +
                "\"alipay_fund_trans_toaccount_transfer_response\":{" +
                "\"pay_date\":\"2013-01-01 08:08:08\"," +
                "\"code\":\"10000\"," +
                "\"order_id\":\"20160627110070001502260006780837\"," +
                "\"msg\":\"Success\"," +
                "\"out_biz_no\":\"3142321423432\"}}";
        String tmp = StringEscapeUtils.unescapeJava(str1);
        System.out.println("tmp:" + tmp);
    }
}
