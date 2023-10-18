public class Main {
    public static void main(String[] args) {
        double[] leftValues = {10.0d, 15.0d, 30.0d, 12.0d};
        double[] rightValues = {5.0d, 9.0d, 16.0d, 5.0d};
        char[] codes = {'a', 'm', 's', 'd'};
        double[] results = new double[codes.length];
        char equation = 'd';

        for (int i = 1; i < codes.length; i++) {
            results[i] = execute(codes[i], leftValues[i], rightValues[i]);
        }

        for(double currentResult : results)
            System.out.println(currentResult);
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
}