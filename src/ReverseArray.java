package PCT-Practice;


import java.lang.reflect.Array;
import java.util.*;

public class ReverseArray {

    public static void main( String[] arr ) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String[] arr1 = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextLine();
        }

        for (int i = 0; i < arr1.length / 2; i++) {
            String temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;

        }

//        List<String> l = Arrays.asList(arr1);
//        Collections.reverse(l);
//        String[] arr2 = l.toArray(arr1);
//        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

        }

    }

}
