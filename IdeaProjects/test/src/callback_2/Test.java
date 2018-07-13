package callback_2;

public class Test {
    public static void main(String[] agrs){
        Li li = new Li();

        Wang wang = new Wang(li);

        wang.askQuestion("1+1=?");
    }
}
