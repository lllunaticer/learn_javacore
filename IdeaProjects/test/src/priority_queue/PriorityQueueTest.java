package priority_queue;
import java.util.*;
import java.time.*;

public class PriorityQueueTest {
    public static void main(String[] args){
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1815, 12, 10));
        pq.add(LocalDate.of(1910, 6, 22));
        pq.add(LocalDate.of(1903, 12, 3));

        System.out.println("Iterating the elements");
        for(LocalDate date:pq)
            System.out.println(date);
        System.out.println("Removing the elements");
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
