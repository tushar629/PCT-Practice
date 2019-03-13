package PCT-Practice;

import java.util.Scanner;

public class ArrayHourGlass {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main( String[] args ) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();

        int maximum_sum = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i < 5 && i > 1 && j < 5 && j > 1) {
                    int sum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1]
                            + arr[i][j]
                            + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                    if (sum > maximum_sum) maximum_sum = sum;
                }
            }
        }
        System.out.println(maximum_sum);
    }
}
