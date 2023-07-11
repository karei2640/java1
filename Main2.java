import java.util.Scanner;

public class Main2 {
    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int computeDifference(int a, int b, int c) {
        int maximum = max(a, b, c);
        int minimum = min(a, b, c);
        return maximum - minimum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("整数 a を入力してください: ");
        int a = scan.nextInt();

        System.out.print("整数 b を入力してください: ");
        int b = scan.nextInt();

        System.out.print("整数 c を入力してください: ");
        int c = scan.nextInt();

        int difference = computeDifference(a, b, c);
        System.out.println("a, b, c の最大値と最小値の差は " + difference + " です。");
    }
}
