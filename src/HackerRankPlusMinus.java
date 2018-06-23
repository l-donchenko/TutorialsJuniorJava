import java.util.*;

public class HackerRankPlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int amountPositive = 0;
        int amountNegative = 0;
        int amountZeros = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                amountNegative++;
            } else if (arr[i] == 0) {
                amountZeros++;
            } else {
                amountPositive++;
            }
        }
        double fractionPositive = (double) amountPositive / arr.length;
        double fractionNegative = (double) amountNegative / arr.length;
        double fractionZeros = (double) amountZeros / arr.length;

        System.out.println(fractionPositive);
        System.out.println(fractionNegative);
        System.out.println(fractionZeros);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        System.out.println("Enter array elements separated with spaces: ");

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
