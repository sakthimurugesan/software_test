import java.util.Scanner;

/**
 * InnerCalculator
 */
class InnerCalculator {

    InnerCalculator() {

    }



    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int a = in.nextInt();
            try {
                int b = in.nextInt();
                char c = in.next().charAt(0);
                switch (c) {
                    case '+':
                        System.out.println(InnerCalculator.add(a, b));
                        break;
                    case '-':
                        System.out.println(InnerCalculator.sub(a, b));
                        break;
                    case '*':
                        System.out.println(InnerCalculator.mul(a, b));
                        break;
                    case '/':
                       try {
                        System.out.println(InnerCalculator.div(a, b));
                       } catch (Exception e) {
                        System.err.println("Zero divisional error");
                       }
                        break;

                    default:
                    System.out.println("invalid operator");
                        break;
                }

            } catch (Exception e) {
                System.out.println("invalid operand 2");
            }
        } catch (Exception e) {
            System.out.println("invalid operand 1");
        }
    }
}
