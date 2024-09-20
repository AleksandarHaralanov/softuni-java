package io.github.aleksandarharalanov.softuni.java.basics.nestedloops.lab.code;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.nextLine());

            int combinations = 0;
            for (int x1 = 0; x1 <= n; x1++) {
                for (int x2 = 0; x2 <= n; x2++) {
                    for (int x3 = 0; x3 <= n; x3++) {
                        if (x1 + x2 + x3 == n) {
                            combinations++;
                        }
                    }
                }
            }

            System.out.println(combinations);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Please enter a valid number (integer).", e);
        }
    }
}
