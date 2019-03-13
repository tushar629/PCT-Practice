package PCT-Practice;


public class BubbleSort {

    static void bubble( int[] arr ) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void main( String[] arg ) {

        int[] arr = { 9 , 8 , 6 , 5 , 4 , 3 , 2 };
        System.out.println("Given array is:");
        MergeSort.printArray(arr);
        bubble(arr);
        System.out.println("Sorted array is:");
        MergeSort.printArray(arr);

    }
}
