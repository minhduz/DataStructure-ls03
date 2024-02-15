public class Ex3NotSorting {
    public static void main(String[] args) {
        int[] arr = {9,10,5,10,4,-10,6,4,2,7};
        // Selection Sort
        int k = 3;
        int bound = Integer.MAX_VALUE;

        for (int x = 0; x < k; x++) {
            int max = Integer.MIN_VALUE;
            for (int j : arr) {
                if (j > max && j <= bound) {
                    max = j;
                }
            }
            bound = max - 1 ;
        }

        System.out.println("Phần tử lớn thứ " + k + " là: " + (bound+1));

    }
}
