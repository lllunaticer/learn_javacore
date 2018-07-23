import org.apache.commons.text.StringEscapeUtils;

public class UnEscape2 {
    public static void main(String[] args){
        String str1 = "{\"resourceId\":\"dfead70e4ec5c11e43514000ced0cdcaf\",\"properties\":{\"process_id\":\"process4\",\"name\":\"\",\"documentation\":\"\",\"processformtemplate\":\"\"}}";
        String tmp = org.apache.commons.text.StringEscapeUtils.unescapeJava(str1);
        System.out.println("tmp:" + tmp);
    }
}
