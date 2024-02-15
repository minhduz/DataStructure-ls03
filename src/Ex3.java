import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Find the k_th the largest number in an array ( k is inputted by user )
        e.g arr[] = {1,2,3,4,5,6,7,8,10,7,9,8}
            k = I -> Output 10
            k = II -> 9
            k = II -> 8
         */

        System.out.print("Nhập giá trị k: ");
        int k = scanner.nextInt();

        int[] arr = {2,4,3,1};
        // Sắp xếp lại mảng
        boolean swapped = false;


        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length -1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if (!swapped){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        

        // Kiểm tra nếu k hợp lệ
        if (k > 0 && k <= arr.length) {
            int uniqueCount = 1;
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] != arr[i + 1]){
                    uniqueCount++;
                }

                if (uniqueCount == k) {
                    System.out.println("Phần tử lớn thứ " + k + " là: " + arr[i]);
                    break;
                }
            }
        }
        else {
            System.out.println("Giá trị k không hợp lệ.");
        }
    }
}
