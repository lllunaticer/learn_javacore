import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonToString {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String txt ="{\"0\":\"{\\\"FilePath\\\":\\\"/zhuanli/DOC/CN/FULL TEXT FOR INVENTION GRANT/20171020/1/CN102013000445825CN00001034900320BFULZH20171020CN00V/CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"InventionTitle\\\":\\\"储电池汇流排连接结构及其汇流排\\\",\\\"Abstract\\\":\\\"一种储电池汇流排连接结构及其汇流排，所述储电池汇流排包括导电片和多个散热片，所述散热片间隔固定在所述导电片的表面上。相较现有技术，本发明的储电池汇流排连接结构及其汇流排，汇流排在导电片的表面上设有散热片，通过散热片实现对储电池单体间连接结构的散热。\\\",\\\"FileName\\\":\\\"CN102013000445825CN00001034900320BFULZH20171020CN00V.XML\\\",\\\"id\\\":\\\"id:FULL_TEXT_FOR_INVENTION_GRANT158_1423117\\\"}\"}";
        Type type = new TypeToken<Map<Integer, String>>() {}.getType();
        Type type1 = new TypeToken<Map<String, String>>() {}.getType();
        Map<Integer, String> map = gson.fromJson(txt, type);

        System.out.println(map.get(0));
        Map<String,String> map2 = gson.fromJson(map.get(0), type1);
        for(String key:map2.keySet()) {
            System.out.println("key:"+key+" "+"value:"+map2.get(key));
        }
    }
}
