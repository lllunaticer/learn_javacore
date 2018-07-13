package multithread;
//演示java多线程的使用方法
public class PrimeThread extends Thread{
    private long minPrime;
    private PrimeThread(long minPrime){
        this.minPrime = minPrime;
    }

    public void run(){
        //compute primes larger than minPrime here,
        //for simplicity here i substitute this process by times the minPrime by 2
        System.out.println(2*minPrime+"我是常规多线程");
    }

    public static void main(String[] args){
        //方法1：declare a class to be a subclass of Thread.
        // This subclass should override the run method of class Thread.
        // An instance of the subclass can then be allocated and started.
        PrimeThread p = new PrimeThread(143);
        p.start();
    }
}
