import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double div = num1 / num2;

        System.out.printf("sum: %.2f%n" +
                "difference: %.2f%n" +
                "product: %.2f%n" +
                "division: %.2f", sum, diff, product, div);


    }
}
