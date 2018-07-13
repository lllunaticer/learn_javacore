package quick_sort;

public class QuickSort {

    public void quickSort(Integer[] arr, int low, int high){

        if(arr == null||arr.length ==0)
            return;

        if(low>=high)
            return;

        int middle = low+(high-low)/2;
        int pivot = arr[middle];

        int i = low, j = high;
        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        if(low<j){
            quickSort(arr,low,j);
        }
        if(high>i){
            quickSort(arr, i, high);
        }
    }

    private void swap(Integer[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
