import java.util.Scanner;

public class Calculator {

    public Double getCalc() {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Choose an operation: ");
            System.out.println("1. Add ");
            System.out.println("2. Subtract ");
            System.out.println("3. Multiply ");
            System.out.println("4. Division ");
            System.out.println("5. Exit ");
            System.out.println("=====================================");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Thank you choosing calculator app..");
                System.exit(0);
                break;
            }

            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Performing addition: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Performing subtraction: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Performing multiplication: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Performing division: " + result);
                    } else {
                        System.out.println("invalid divide operation");
                    }
                    break;
                default:
                    System.out.println("Cannot perform operation..");

            }

        }
        System.out.println("Result is " + result);
        return result;
    }


//    public double add(double a, double b) {
//    return a+b;
//    }
//
//    public double sub(double a, double b) {
//        return a-b;
//    }
//
//    public double mul(double a, double b) {
//        return a*b;
//    }
}