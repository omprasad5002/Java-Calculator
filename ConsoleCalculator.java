import java.util.Scanner;

public class ConsoleCalculator {

    // Addition Method
    static double sum(double x, double y) {
        return x + y;
    }

    // Subtraction Method
    static double difference(double x, double y) {
        return x - y;
    }

    // Multiplication Method
    static double product(double x, double y) {
        return x * y;
    }

    // Division Method (with check)
    static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("⚠️ Cannot divide by zero.");
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;

        System.out.println("📘 Welcome to My Java Calculator!");

        while (again) {
            System.out.print("\nChoose operation (+, -, *, /) or type 'q' to quit: ");
            String op = sc.next();

            if (op.equalsIgnoreCase("q")) {
                System.out.println("👋 Thank you for using the calculator!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (op) {
                case "+":
                    result = sum(num1, num2);
                    break;
                case "-":
                    result = difference(num1, num2);
                    break;
                case "*":
                    result = product(num1, num2);
                    break;
                case "/":
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("❌ Invalid operation. Try again.");
                    valid = false;
            }

            if (valid) {
                System.out.println("✅ Answer: " + result);
            }

            System.out.print("\nDo you want to calculate again? (yes/no): ");
            String cont = sc.next();
            again = cont.equalsIgnoreCase("yes");
        }

        sc.close();
    }
}

