package com.techzenure.DAY5;

import java.util.Scanner;

public class StudentSetters {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       Student student;
	       System.out.print("Enter Student's Id:");
	       int id = sc.nextInt();
	       System.out.print("Enter Student's Name:");
	       String name = sc.next();
	       System.out.print("Enter Student's address:");
	       String address = sc.next();
	       System.out.print("Whether the student is from NIT(Yes/No):");
	       String isNIT = sc.next();
	       while(true)
	       {
	            if(isNIT.equals("YES") || isNIT.equals("yes"))
	            {
	              student= new Student(id,name,address);
	              break;
	            }
		        else if(isNIT.equals("NO") || isNIT.equals("no"))
		        {
		           System.out.print("Enter the college name:");
		           String college = sc.next();
		           student= new Student(id,name,address,college);
		           break;
		        }
		        else 
		        {
		          System.out.println("Wrong Input");
		          System.out.print("Whether the student is from NIT(Yes/No):");
		          isNIT = sc.next();
		        }
		
	       }
	  
	       int studentId = student.getStudentId();
	       String studentName = student.getStudentName();
	       String studentAddress = student.getStudentAddress();
	       String collegeName = student.getCollegeName();
	       System.out.println(" ");
	       System.out.println("Student id:"+studentId);
	       System.out.println("Student name:"+studentName);
	       System.out.println("Address:"+studentAddress);
	       System.out.println("College Name:"+collegeName);
	       
	       sc.close();
	  
	}
}

	

	

