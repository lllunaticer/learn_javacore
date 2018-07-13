package generic_programming.generator;

public class Coffee {
    private static long couter =0;
    private final long id =  couter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " +id;
    }
}
