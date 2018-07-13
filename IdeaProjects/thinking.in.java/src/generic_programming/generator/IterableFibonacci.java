package generic_programming.generator;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
    private int count;
    public IterableFibonacci(int n) {count = n;}

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return count>0;
            }

            @Override
            public Integer next() {
                count--;
                return IterableFibonacci.this.next();
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public static  void main(String[] args) {
        for(int i: new IterableFibonacci(18))
            System.out.println(i+"");
    }
}
