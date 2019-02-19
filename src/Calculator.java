import java.util.Scanner;

public class Calculator {

    public static double calculatingMethod(int firstNumber, char operation, int secondNumber) {
        double result = 0;
        char operator = operation;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter operator. Possible operations: +, -, *, /: ");
        char operation = scanner.next(".").charAt(0);
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Result: " + calculatingMethod(firstNumber, operation, secondNumber));
    }
}
