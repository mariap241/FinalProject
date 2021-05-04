package edu.ru.finalprojectmp;

import java.util.Scanner;
import java.io.*;

public class Assignment {

    private String className;
    private String assignmentName;
    private int daysUntilDueDate;
    private Student student;
    private String studentName;

    public String getClassName() {
        return className;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getDaysUntilDueDate() {
        return daysUntilDueDate;
    }

    public void setDaysUntilDueDate(int daysUntilDueDate) {
        this.daysUntilDueDate = daysUntilDueDate;
    }

    public Assignment(String className, String assignmentName, int daysUntilDueDate, Student student) {
        this.className = className;
        this.assignmentName = assignmentName;
        this.daysUntilDueDate = daysUntilDueDate;
        this.studentName = student.getName();
    }

    public Assignment(Student name) {
        String testClassName;
        String testAssignmentName;
        int testDaysUntilDueDate;
        

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What class is this for?");
        testClassName = keyboard.nextLine();

        System.out.println("Assignment name: ");
        testAssignmentName = keyboard.nextLine();

        System.out.println("Days until due: ");
        testDaysUntilDueDate = keyboard.nextInt();

        this.assignmentName = testAssignmentName;
        this.className = testClassName;
        this.daysUntilDueDate = testDaysUntilDueDate;
        this.studentName = name.getName();
    }

    public void display() {
        System.out.println("---------------");
        System.out.println("Assignment: " + assignmentName);
        System.out.println("Class: " + className);
        System.out.println("Days until Due: " + daysUntilDueDate);
        System.out.println("Student: " + studentName);
        System.out.println("---------------");
    }
    public void saveInfo() throws FileNotFoundException, IOException{
        
        Scanner keyboard = new Scanner(System.in);

        
        System.out.println("Where would you like to save this information?");
        String filename = keyboard.nextLine();
        
        FileWriter file = new FileWriter(filename, true);
        
      
        PrintWriter outputFile = new PrintWriter(file);
        outputFile.println(studentName + "'s Assignment: " + assignmentName);
        outputFile.println("Class: " + className);
        outputFile.println(daysUntilDueDate + " days 'till due!");
        
        outputFile.close();
        System.exit(0);
    }
    
    public void searchAssignment(Student studentName){
        
    }
}
