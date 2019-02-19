import java.util.Scanner;

public class HackerRankMiniMaxSum {
    /**
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
     *      * four of the five integers. Then print the respective minimum and maximum values as a single line of
     *      * two space-separated long integers.
     */
    static void miniMaxSum(int[] arr) {
        long generalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            generalSum += arr[i];
        }

        long sumAllExceptFirst = generalSum - arr[0];
        long sumAllExceptSecond = generalSum - arr[1];
        long sumAllExceptThird = generalSum - arr[2];
        long sumAllExceptFourth = generalSum - arr[3];
        long sumAllExceptFifth = generalSum - arr[4];

        long[] sum = new long[]{sumAllExceptFirst, sumAllExceptSecond, sumAllExceptThird, sumAllExceptFourth, sumAllExceptFifth};
        long minSum = sum[0];
        long maxSum = sum[0];

        for (int i = 0; i < sum.length; i++) {
            if(sum[i] < minSum){
                minSum = sum[i];
            }
            if (sum[i] > maxSum){
                maxSum = sum[i];
            }
        }
        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];


        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
