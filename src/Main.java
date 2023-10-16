public class Main {
    public static void main(String[] args) {
        double[] leftValues = {10.0d, 15.0d, 30.0d, 12.0d};
        double[] rightValues = {5.0d, 9.0d, 16.0d, 5.0d};
        char[] codes = {'a', 'm', 's', 'd'};
        double[] results = new double[codes.length];
        char equation = 'd';

        for (int i = 1; i < codes.length; i++) {
            switch (codes[i]) {
                case 'a':
                    results[i] = leftValues[i] + rightValues[i];
                    break;
                case 'm':
                    results[i] = leftValues[i] * rightValues[i];
                    break;
                case 's':
                    results[i] = leftValues[i] - rightValues[i];
                    break;
                case 'd':
                    results[i] = rightValues[i] != 0 ? leftValues[i] / rightValues[i] : 0.0d;
                    break;
                default:
                    System.out.println("Something went wrong.");
                    results[i] = 0.0d;
                    break;
            }
        }

        for(double currentResult : results)
            System.out.println(currentResult);
    }
}