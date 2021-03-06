package generic_programming.tuple;

public class FiveTuple<A, B, C, D, E> extends FourTuple{
    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E e){
        super(a,b,c,d);
        this.fifth = e;
    }

    @Override
    public String toString() {
        return "("+first+","+second+","+third+","+fourth+","+fifth+")";
    }
}
