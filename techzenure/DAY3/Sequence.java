/**
 * print the following sequence 1 4 7 10 13 ...upto first terms
 * @author krishna
 *
 */



package com.techzenure.DAY3;

public class Sequence {

	public static void main(String[] args) {
		System.out.println("Display the first 15 elements of the following sequences \r\n"
				+ " 1	4	7	10	..\n");
	
		
		for(int i = 1; i<=45;i=i+3) {      // write a logic to iterate upto first 15 following sequences
			
			System.out.print(i + "     ");
		}

	}

}
