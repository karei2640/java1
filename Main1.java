import java.util.Scanner;

public class Main1 {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("整数 a を入力してください: ");
        int a = scan.nextInt();

        System.out.print("整数 b を入力してください: ");
        int b = scan.nextInt();

        int maximum = max(a, b);
        System.out.println("a と b のうち、最大の数は " + maximum + " です。");

        int minimum = min(a, b);
        System.out.println("a と b のうち、最小の数は " + minimum + " です。");
    }
}
