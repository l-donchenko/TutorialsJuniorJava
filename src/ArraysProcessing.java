import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Write 3 functions that take an array as a parameter and return the minimum,
 * average, and maximum values of that array.
 */
public class ArraysProcessing {
    private static Scanner scanner = new Scanner(System.in);
    private static int size = scanner.nextInt();
    private static int[] arr;

    public static void main(String[] args) {
        System.out.println("Array is: " + Arrays.toString(generateArray()));
        System.out.println("Minimum Value = " + calculateMinimum(arr));
        System.out.println("Average Value = " + calculateAverage(arr));
        System.out.println("Maximum Value = " + calculateMaximum(arr));
    }

    public static int fillArray(){
        Random rand = new Random();
        int Low = 1;
        int High = 100;
        int randomNumber = rand.nextInt(High-Low) + Low;
        return randomNumber;
    }

    public static int[] generateArray() {
        arr = new int[size];
        for(int i=0; i< arr.length;i++)
        {
            arr[i] = fillArray();
        }
        return arr;
    }

    public static int calculateMinimum(int[] arr){
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static float calculateAverage(int[] arr){
        int sum = 0;
        float average;
        int arrSize = arr.length;
        for (int i = 0; i < arrSize; i++){
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
        average = sum / arrSize;
        return average;
    }
    public static int calculateMaximum(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
