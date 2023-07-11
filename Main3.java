import java.util.Arrays;

public class Main3 {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 2, 10, 8, 77 };

        int maximum = findMax(numbers);
        int minimum = findMin(numbers);

        System.out.println("与えられた配列の最大値: " + maximum);
        System.out.println("与えられた配列の最小値: " + minimum);
    }
}
