package ExceptionsAndErrorHardling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberAsString = scanner.nextLine();

        double sqrt = -1;

        try {
            sqrt = sqrt(Integer.parseInt(numberAsString));

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        }
        if (sqrt != 1) {
            System.out.printf("%.2f%n", sqrt);
        }
        System.out.println("Goodbye");
    }

    public static double sqrt(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid");
        }
        return Math.sqrt(number);
    }
}
