package PCT-Practice;


public class PushZero {


    static int[] push( int[] arr , int n ) {

        int[] b = arr.clone();

        int count = 0, temp;

        for (int i = 0; i < n; i++) {

            if ((b[i] != 0)) {

                temp = b[count];
                b[count] = b[i];
                b[i] = temp;
                count = count + 1;

            }
        }
        return b;
    }

    static void printArray( int[] arr ) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main( String[] arg ) {

        int[] arr = { 1 , 0 , 8 , 4 , 0 , 0 , 2 , 7 , 0 , 6 , 0 , 9 };
        System.out.println("Given array is:");
        int n = arr.length;
        printArray(arr);

        System.out.println();
        printArray(push(arr , n));
    }
}
