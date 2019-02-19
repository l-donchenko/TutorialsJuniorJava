import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 */
public class HackerRankDiagonalDifference {
    static private int diagonalDifference(int[][] arr) {
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            int arrValue = arr[i][i];
            sumFirstDiagonal = sumFirstDiagonal + arrValue;
        }

        for (int j = 0, i = arr.length-1; j < arr.length; j++, i--) {
                int arrValue=arr[j][i];
                sumSecondDiagonal = sumSecondDiagonal + arrValue;
        }
        int diagonalDifference = sumFirstDiagonal - sumSecondDiagonal;
        return Math.abs(diagonalDifference);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[][] data = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the elements for the Matrix");
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = in.nextInt();

            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(data));
        int result = diagonalDifference(data);
        System.out.println("diagonal difference: "+result);
        scanner.close();
    }
}
