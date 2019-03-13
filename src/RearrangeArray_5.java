package PCT-Practice;

public class RearrangeArray_5 {

    public static void main( String[] args ) {

        int[] arr = { 10 , 11 , 12 };
        int[] index = { 1 , 0 , 2 };

        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[index[i]] = arr[i];
        }

        arr = temp.clone();

        RearrangeArray_4.printArray(arr);
    }
}
