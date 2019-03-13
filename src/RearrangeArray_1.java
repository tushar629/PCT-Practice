package PCT-Practice;


import java.util.*;
import java.util.Scanner;

public class RearrangeArray_1 {

    public static void main( String[] arr ) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter numbers");

        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Array entered is ");

        Set<Integer> s = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < n; i++) {
            if (s.contains(i)) {
                arr1[i] = i;
            } else {
                arr1[i] = -1;
            }
        }
        MergeSort.printArray(arr1);

    }

}
