import java.util.Scanner;

/**
 * Write a function that takes a value n, and returns the sum of numbers 1 to n
 */
public class Sum {
    private static int sum = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = calculateSum(n);
        System.out.println("result = " + result);
    }
    public static int calculateSum(int n) {
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
