package PCT-Practice;


public class MergeSort {

    static void merge_Sort( int[] arr , int n ) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = arr[i];
        }
        merge_Sort(l , mid);
        merge_Sort(r , n - mid);
        merge(arr , l , r , mid , n - mid);
    }

    static void merge( int[] a , int[] l , int[] r , int left , int right ) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    static void printArray( int[] arr ) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main( String[] arg ) {

        int[] arr = { 9 , 8 , 6 , 5 , 4 , 3 , 2 };
        System.out.println("Given array is:");
        printArray(arr);
        merge_Sort(arr , arr.length);
        merge_Sort(arr , arr.length);
        System.out.println("Sorted array is:");
        printArray(arr);
    }
}