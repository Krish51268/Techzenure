/**
 *@author krishna
 */



package com.techzenure.DAY5;

//import java.util.*;
class Student
{
    private static String collegeName = "NIT";
    private int studentId;
    private String studentName, studentAddress;
    
    Student(int studentId, String studentName, String studentAddress)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    
    Student(int studentId, String studentName, String studentAddress, String collegeName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = collegeName;
    }
    
    public int getStudentId()
    {
        return studentId;
    } 
    
    public String getStudentName()
    {
        return studentName;
    }
    
    public String getStudentAddress()
    {
        return studentAddress;
    }
    
    public String getCollegeName()
    {
        return collegeName;
    }
	
}
