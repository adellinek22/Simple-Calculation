package openway.task.simplecalculation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(ANSI_GREEN +
                "This program will take a 4 real numbers as an input (a b c d),\n" +
                "then it will calculate the value of (a + b) / (c + d)\n\n" +
                ANSI_YELLOW +
                "Make sure all of your inputs in the form of a b c d (ex: 1 2 3.0 4)");

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String input;

        while (true) {
            try {
                System.out.print(ANSI_RESET + "\nEnter values (or 'exit' to quit): ");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("exit")) {
                    System.out.println(ANSI_YELLOW + "Exiting the program...");
                    break;
                }

                String[] inputValues = input.split("\\s+");

                double[] nums = Arrays.stream(inputValues)
                        .mapToDouble(Double::parseDouble)
                        .toArray();

                System.out.println(ANSI_GREEN + calculator.calculate(nums));
            } catch (Exception e) {
                System.out.println(ANSI_RED + "Error: " + e.getMessage());
            }

        }
    }
}
