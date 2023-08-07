/**
 * write a porgram to display sum of numbers 
 * sample i/p - 123
 * sample o/p - 6
 * 
 * @author krishna
 */



package com.techzenure.DAY3;

import java.util.Scanner;

public class SumOfAllNum {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the given number:");
		int n  = sc.nextInt();
		int sum=0,temp=n; // we are using sum and temp variables for storing the values
		while(temp>0) { //temp is gretaer than o then the temp will enter into the while block
			int rem = temp%10;  // we are calculate the temp value for getting remainder and it will be stored in rem variable
		
			sum = sum + rem; // initially sum is 0 here sum = 0 + rem value
			temp = temp/10; // here for calculate the next term 
			
			
			
		}
		System.out.print("sum of digits of a num is "+n+":"+sum);
		sc.close();

	}

}


	


