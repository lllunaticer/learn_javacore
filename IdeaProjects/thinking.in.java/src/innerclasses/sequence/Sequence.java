package innerclasses.sequence;

public class Sequence {
    private Object[] items;
    private int next=0;
    public Sequence(int size){ items = new Object[size];}
    public void add(Object s){
        if(next<items.length) items[next++] = s;
    }

    class SequenceSlector implements Selector{
        int i = 0;
        @Override
        public boolean end() { return i==items.length; }

        @Override
        public Object current() { return items[i]; }

        @Override
        public void next() { if(i<items.length) i++; }
    }

    public SequenceSlector selector(){ return new SequenceSlector();}

    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i=0;i<10;i++) sequence.add(Integer.toString(i));
        SequenceSlector slector = sequence.selector();
        while(!slector.end()){
            System.out.println(slector.current());
            slector.next();
        }
    }
}
