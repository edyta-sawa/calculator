import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] leftValues = {10.0d, 15.0d, 30.0d, 12.0d};
        double[] rightValues = {5.0d, 9.0d, 16.0d, 5.0d};
        char[] codes = {'a', 'm', 's', 'd'};
        double[] results = new double[codes.length];
        char equation = 'd';

        if (args.length == 0) {
            for (int i = 1; i < codes.length; i++) {
                results[i] = execute(codes[i], leftValues[i], rightValues[i]);
            }
            for (double currentResult : results)
                System.out.println(currentResult);
        } else if (args.length == 1 && args[0].equals("interactive")) {
            executeInteractively();
        } else if (args.length == 3) {
            handleCommandLine(args);
        }
        else
            System.out.println("Provide operation code and 2 numeric values.");
    }

    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
    char code = codeFromString(parts[0]);
    double leftValue = valueFromWord(parts[1]);
    double rightValue = valueFromWord(parts[2]);
    double result = execute(code, leftValue, rightValue);
    displayResult(code, leftValue, rightValue, result);
    }

    private static void displayResult(char code, double leftValue, double rightValue, double result) {
        char symbol = symbolFromCode(code);
        StringBuilder builder = new StringBuilder(20);
        builder.append(leftValue);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightValue);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output);
    }

    private static char symbolFromCode(char code) {
        char[] codes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';
        for (int index = 0; index < codes.length; index++) {
            if (code == codes[index]) {
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }

    private static void handleCommandLine(String[] args) {

        char code = args[0].charAt(0);
        double leftValue = Double.parseDouble(args[1]);
        double rightValue = Double.parseDouble(args[2]);
        double result = execute(code, leftValue, rightValue);
        System.out.println(result);
    }

    static double execute(char code, double leftValue, double rightValue) {
        double result;
        switch (code) {
            case 'a':
                result = leftValue + rightValue;
                break;
            case 'm':
                result = leftValue * rightValue;
                break;
            case 's':
                result = leftValue - rightValue;
                break;
            case 'd':
                result = rightValue != 0 ? leftValue / rightValue : 0.0d;
                break;
            default:
                System.out.println("Something went wrong.");
                result = 0.0d;
                break;
        }
        return result;
    }

    static char codeFromString(String operationName) {
        char code = operationName.charAt(0);
        return code;
    }
    static double valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three",
                "four", "five", "six", "seven",
                "eight", "nine"
        };
        double value = 0d;
        for (int index = 0; index < numberWords.length; index++) {
            if(word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        return value;
    }
}