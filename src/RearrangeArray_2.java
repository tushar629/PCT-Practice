package PCT-Practice;


import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArray_2 {

    public static void main( String[] arr ) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter numbers");

        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Array entered is ");

        int evenPosition = n / 2;
        int oddPosition = n - evenPosition;

        int[] temp;
        temp = arr1.clone();
        Arrays.sort(temp);

        int j = oddPosition - 1;

        for (int i = 0; i < n; i += 2) {
            arr1[1] = temp[j];
            j--;
        }

        j = oddPosition;
        for (int i = 1; i < n; i += 2) {
            arr1[1] = temp[j];
            j++;
        }
        MergeSort.printArray(arr1);
    }

}
