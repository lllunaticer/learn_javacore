package pair;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T f, T s){
        this.first = f;
        this.second = s;
    }

    public T getMin() {
        return first;
    }

    public T getMax() {
        return second;
    }

    public void setFirst(T newvalue) {
        this.first = newvalue;
    }

    public void setSecond(T newvalue) {
        this.second = newvalue;
    }
}
