import org.apache.commons.lang3.StringEscapeUtils;

public class UnEscape {
    public static void main(String[] args){
        String str1 = "{\"resourceId\":\"dfead70e4ec5c11e43514000ced0cdcaf\",\"properties\":{\"process_id\":\"process4\",\"name\":\"\",\"documentation\":\"\",\"processformtemplate\":\"\"}}";
        String tmp = StringEscapeUtils.unescapeJava(str1);
        System.out.println("tmp:" + tmp);
    }
}
