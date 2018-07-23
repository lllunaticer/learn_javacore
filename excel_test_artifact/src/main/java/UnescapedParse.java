import org.json.*;
import org.apache.commons.text.StringEscapeUtils;

public class UnescapedParse {
    public static void main(String[] args){
//        String str1 = "{\"0\":\"{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"}\",\n" +
//                "\n" +
//                "\"1\":\"{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"}\",\n" +
//                "\n" +
//                "\"2\":\"{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:full_text_for_invention_publication15_1423117\\\"}\",\n" +
//                "\n" +
//                "\"3\":\"{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:full_text_for_utility_model15_1423117\\\"}\"}";
        //去除转义符号， 将字符串还原为标准得Json数据
        String str1 ="{\"0\":{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"},\"1\":{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"}}";
        String tmp = StringEscapeUtils.unescapeJava(str1);
        //System.out.println("tmp:" + tmp);
        JSONObject jsResult = new JSONObject(tmp);
        for(int i=0;i<=1;i++) {
            String s = i+"";
            JSONObject jsAttrib = (JSONObject) jsResult.get(s);
            //System.out.println(jsAttrib);
            System.out.println("FilePath:" + jsAttrib.getString("FilePath"));
        }

    }
}
