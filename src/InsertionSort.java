package PCT-Practice;


public class InsertionSort {

    static void insertion( int[] arr ) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main( String[] arg ) {

        int[] arr = { 9 , 8 , 6 , 5 , 4 , 3 , 2 };
        System.out.println("Given array is:");
        MergeSort.printArray(arr);
        insertion(arr);
        System.out.println("Sorted array is:");
        MergeSort.printArray(arr);
    }
}