/**
 * we have to display the even numbers in between the range
 * @author krishna
 */





package com.techzenure.DAY3;

import java.util.Scanner;

public class EvenNumbersBetweenXAndY {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        
        
        
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the last number: ");
        int lastNumber = scanner.nextInt();
        
        if (firstNumber > lastNumber) {
            System.out.println("ERROR: Invalid Input:: second number should be greater than first number");
        } else {
            System.out.println("Even Numbers between " + firstNumber + " and " + lastNumber + " are:");
            for (int num = firstNumber; num <= lastNumber; num++) {
                if (num % 2 == 0) {
                    System.out.print(num + "   ");
                }
            }
            System.out.println(); // Print a new line after the even numbers
        }
        
        scanner.close();

	}

}
