package PCT-Practice;


public class QuickSort {
    static int partition( int[] arr , int begin , int end ) {
        int pivot = arr[end];
        int i = begin - 1;
        for (int j = 0; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i] = arr[end];
        arr[end] = temp;
        return i + 1;

    }

    static void quick_Sort( int[] arr , int begin , int end ) {
        if (begin < end) {
            int pivot = partition(arr , begin , end);
            quick_Sort(arr , begin , pivot - 1);
            quick_Sort(arr , pivot + 1 , end);
        }
    }

    public static void main( String[] arg ) {

        int[] arr = { 9 , 8 , 6 , 5 , 4 , 3 , 2 };
        int n = arr.length;
        System.out.println("Given array is:");
        MergeSort.printArray(arr);
        quick_Sort(arr , 0 , n - 1);
        System.out.println("Sorted array is:");
        MergeSort.printArray(arr);
    }
}

