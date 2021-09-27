package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double VAT = 1.2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");

        int userAmount = scanner.nextInt();
        System.out.println("You're VAT is: ");
        System.out.print(VAT * userAmount);
    }
}
