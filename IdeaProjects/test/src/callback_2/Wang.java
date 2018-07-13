package callback_2;

public class Wang implements CallBack {
    private Li li;

    public Wang(Li li){
        this.li =li;
    }

    public void askQuestion(final String question){
        new Thread(new Runnable(){
            public void run(){
                li.executeMessage(Wang.this, question);
            }
        }).start();

        play();
    }
    public void play(){
        System.out.println("playing");
    }

    public void solve(String result){
        System.out.println("the answer is "+result);
    }
}
