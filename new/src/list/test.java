package list;

public class test {
    public static void main(String[] args){
        String s = "1 3 5 25";
        String[] s1 = s.split(" ");
        for(String s2:s1){
            int i = Integer.parseInt(s2);
            System.out.println(i);
        }
    }
}
