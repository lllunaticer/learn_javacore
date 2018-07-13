package multithread;

public class PrimeRun implements Runnable{
    private long minPrime;
    PrimeRun(long minPrime){
        this.minPrime = minPrime;
    }

    public void run(){
        System.out.println(2*minPrime+"我是常规多线程");
    }

    public static void main(String[] args){
        //多线程实现方法2：create a thread is to declare
        // a class that implements the Runnable interface.
        // That class then implements the run method. An
        // instance of the class can then be allocated, passed
        // as an argument when creating Thread, and started.
        PrimeRun p = new PrimeRun(143);
        new Thread(p).start();
        new Thread(
                new Runnable(){
                    public void run(){
                        System.out.print(286+"我是匿名函数");
                    }
        }
        ){}.start();
    }
}
