package PCT-Practice;



public class RearrangeArray_3 {

    static void swap( int[] arr , int a , int b ) {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }

    static void printArray( int[] arr ) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main( String[] arg ) {

        int[] arr = { 5 , 2 , 3 , 4 };
        System.out.println("Given array is:");
        int n = arr.length;
        printArray(arr);

        System.out.println();


    }
}
