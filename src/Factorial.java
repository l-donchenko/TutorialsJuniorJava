import java.util.Scanner;
/**
 * Write a function that computes the factorial value
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial(n) = " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return (n * factorial(n-1));
    }
}
