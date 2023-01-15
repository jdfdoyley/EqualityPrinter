/**
 * Author: Jason D'Oyley
 * Date: Jan 14, 2023
 * Section: 5 - Expressions, Statements & More
 * Topic: Coding Exercise 11: Equality Printer
 */

public class App {
    public static void main (String[] args) {
        printEqual(1, 1, 1);        // Prints: All numbers are equal
        printEqual(1, 1, 2);        // Prints: Neither all are equal or different
        printEqual(-1, -1, -1);     // Prints: Invalid Value
        printEqual(1, 2, 3);        // All numbers different
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0)
            System.out.println("Invalid Value");
        else if (a == b && b == c)
            System.out.println("All numbers are equal");
        else if (a != b && b != c && a != c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }
}
