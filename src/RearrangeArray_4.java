package PCT-Practice;

import java.util.Arrays;

public class RearrangeArray_4 {


    static int[] arrange( int[] arr , int n ) {

        Arrays.sort(arr);
        int[] temp = new int[n];

        boolean flag = true;
        int s = 0, l = n - 1;
        for (int i = 0; i < n; i++) {

            if (flag) {
                temp[i] = arr[l--];
            } else {
                temp[i] = arr[s++];
            }
            flag = !flag;
        }
        return temp;
    }

    static void printArray( int[] arr ) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main( String[] arg ) {

        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 };
        System.out.println("Given array is:");
        int n = arr.length;
        printArray(arr);


        System.out.println();
        printArray(arrange(arr , n));


    }


}
