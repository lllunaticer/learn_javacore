package quick_sort;

public class QuickSortTest {
    public static void main(String[] args){
        Integer[] a = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        QuickSort array = new QuickSort();
        System.out.println("before the sort:");
        for(int b:a)
            System.out.print(b+" ");
        System.out.println();
        array.quickSort(a, 0, a.length-1);
        System.out.println("after the sort:");
        for(int b:a)
            System.out.print(b+" ");
    }
}
