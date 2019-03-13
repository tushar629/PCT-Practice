package PCT-Practice;


public class ArrayRotation {


    public static void main( String[] arg ) {

        rotated r = new rotated();
        int[] arr = { 1 , 3 , 5 , 7 , 9 };
        int[] newArr = { 1 , 3 , 5 , 7 , 9 };

        r.leftRotate(arr , arr.length , 1);
        System.out.println(" left rotated array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        r.rightRotate(newArr , arr.length , 1);
        System.out.println(" right rotated array is: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}

class rotated {
    public void leftRotate( int[] arr , int n , int d ) {
        for (int i = 0; i < d; i++) {
            leftRotateByOne(arr , n);
        }
    }

    public void leftRotateByOne( int[] arr , int n ) {
        int i;
        int temp = arr[0];
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

    public void rightRotate( int[] arr , int n , int d ) {
        for (int i = 0; i < d; i++) {
            rightRotateByOne(arr , n);
        }
    }

    public void rightRotateByOne( int[] arr , int n ) {
        int i, temp = arr[n - 1];
        for (i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}