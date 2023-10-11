public class Main {
    public static void main(String[] args) {
        double value_1 = 10.0d;
        double value_2 = 5.0d;
        double result = 0.0d;
        char equation = 'd';

        switch (equation) {
            case 'a':
                result = value_1 + value_2;
                break;
            case 'm':
                result = value_1 * value_2;
                break;
            case 's':
                result = value_1 - value_2;
                break;
            case 'd':
                result = value_2 != 0 ? value_1 / value_2 : 0.0d;
                break;
            default:
                System.out.println("Something went wrong.");
                result = 0.0d;
                break;
        }
        System.out.println(result);
    }
}