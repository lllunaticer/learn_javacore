package generic_programming.tuple;

public class FourTuple<A, B, C, D> extends ThreeTuple{
    public final D fourth;

    public FourTuple(A a, B b, C c, D d){
        super(a, b, c);
        this.fourth=d;
    }

    @Override
    public String toString() {
        return "("+first+","+second+","+third+","+fourth+")";
    }
}
