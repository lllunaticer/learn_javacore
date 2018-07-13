package generic_programming.generator;
import java.util.*;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Latte.class, Americano.class, Cappuccino.class, Mocha.class, Breve.class,};
    private Random rand = new Random(47);
    private int size=0;

    public CoffeeGenerator() {}
    public CoffeeGenerator(int rs) {this.size = rs;}

    public Coffee next(){
        try{
            return (Coffee)
                    types[rand.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;
        public boolean hasNext(){return count>0;}
        public Coffee next(){
            count--;
            return CoffeeGenerator.this.next();
        }
        public void remove(){ throw new UnsupportedOperationException();}
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args){
        CoffeeGenerator gen =new CoffeeGenerator();
        for(int i = 0; i<5;i++)
            System.out.println(gen.next());
        for(Coffee c:new CoffeeGenerator(5))
            System.out.println(c);
    }
}
