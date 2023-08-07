/**
 * write a code for displaying odd numbers for the user i/p upto user choice 
 * @author krishna
 */




package com.techzenure.DAY3;

import java.util.Scanner;

public class OddUpTo {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in); // using a scanner class to take the data from the user
		System.out.print("enter how many odd numbers to be generated :");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i +"\t"); // \t used for tab space 
			}
			
		}
		sc.close();

	}

}
