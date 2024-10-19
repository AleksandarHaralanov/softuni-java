package io.github.aleksandarharalanov.softuni.java.basics.firststepsincoding.exercise.code;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double price = (pens * 5.8) + (markers * 7.2) + (liters * 1.2);
        double finalPrice = price - (price * ((double) discount / 100));

        System.out.println(finalPrice);
    }
}
