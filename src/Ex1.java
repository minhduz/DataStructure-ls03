import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] brr = new int[arr.length];
//        for (int i = 0, j = arr.length -1; i < j; i++,j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }

        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }




        System.out.println(Arrays.toString(arr));
    }
}
