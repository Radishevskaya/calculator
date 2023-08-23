import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char calcOperation = 'c';
            double operand1;
            char operation = '0';
            double operand2;
            double result = 0;
            do {
                if (calcOperation == 'c') {

                    System.out.println("Введите первое число");
                    operand1 = scanner.nextInt();
                    System.out.println("Введите операцию");
                    operation = scanner.next().charAt(0);
                } else {
                    operand1 = result;
                    operation = calcOperation;
                }

                System.out.println("Введите второе число");
                operand2 = scanner.nextDouble();

                result = calculate(operand1, operation, operand2);
                System.out.println(result);

                calcOperation = scanner.next().charAt(0);
            } while (calcOperation != 's');
        }

        public static double calculate(double operand1, char operation, double operand2) {
            return switch (operation) {
                case '+' -> (operand1 + operand2);

                case '*' -> (operand1 * operand2);

                case '/' -> (operand1 / operand2);

                case '-' -> (operand1 - operand2);

                default -> {
                    System.out.println("Калькулятор это посчитать не может ");
                    yield 0;
                }
            };
        }


    }
}
