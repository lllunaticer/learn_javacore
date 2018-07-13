package callback_2;

public class Li {

    public void executeMessage(CallBack callBack, String question){
        System.out.println("问题是："+question);
        for(int i=0;i<10000;i++){}
        String result = "answer is 2";
        callBack.solve(result);
    }
}
