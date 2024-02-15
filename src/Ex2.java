import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a key: ");
        int n = scanner.nextInt();
        boolean flag = true;
        int[] arr = {1, 4, 5, 14, 3, 14, 35, 67};

        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]){
                System.out.print(i+" ");
                flag = false;
            }
        }
        if (flag){
            System.out.println(-1);
        }

    }

}
