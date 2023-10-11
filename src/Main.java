public class Main {
    public static void main(String[] args) {
        double value_1 = 10.0d;
        double value_2 = 5.0d;
        double result = 0.0d;
        char equation = 'd';

        if(equation == 'a')
            result = value_1 + value_2;
        else if (equation == 'm')
            result = value_1 * value_2;
        else if (equation == 's')
            result = value_1 - value_2;
        else if (equation == 'd')
            if (value_2 != 0)
                result = value_1 / value_2;
        else {
            System.out.println("Something went wrong.");
            result = 0.0d;
        }
        System.out.println(result);
    }
}