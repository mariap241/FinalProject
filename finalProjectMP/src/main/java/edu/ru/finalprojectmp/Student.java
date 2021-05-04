
package edu.ru.finalprojectmp;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Student {
    private String name;
    private String grade;
    private long IDNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public long getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(long IDNumber) {
        this.IDNumber = IDNumber;
    }
    
    public Student(String name, String grade, long IDNumber){
        this.name = name;
        this.grade = grade;
        this.IDNumber = IDNumber;
        
}
            
    public void addStudent(){
        String testStudent;
        String testGrade;
        long testIDNumber;
                
        //keyboard scanner
        Scanner keyboard = new Scanner(System.in);
        
        //ask for students name
        System.out.println("Enter the student's name: ");
        testStudent = keyboard.nextLine();
        
        //ask for students grade
        System.out.println("Enter student's current grade(fr/so/jr/sr): ");
        testGrade = keyboard.nextLine();
        
        //ask for students ID number
        System.out.println("Enter student's ID number: ");
        testIDNumber = keyboard.nextLong();
        
        this.IDNumber = testIDNumber;
        this.name = testStudent;
        this.grade = testGrade;
    }
    
    public void display(){
        System.out.println("---------------");
        System.out.println("Student: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("ID Number: " + IDNumber);
        System.out.println("---------------");
    }
    
//    public void saveInfo() throws IOException{
//        Scanner keyboard = new Scanner(System.in);
//            
//        System.out.println("Where would you like to save this information?");
//        String fileName = keyboard.nextLine();
//        
//        FileOutputStream file = new FileOutputStream(new File(fileName));
//        ObjectOutputStream output = new ObjectOutputStream(file);
//        
//        output.writeObject();
//    }
    
//    public void saveInfo() throws FileNotFoundException, IOException{
//       
//        keyboard scanner
//        Scanner keyboard = new Scanner(System.in);
//
//        ask where to save information
//        System.out.println("Where would you like to save this information?");
//        String filename = keyboard.nextLine();
//        
//        create new file and check if text already exists
//        FileWriter file = new FileWriter(filename, true);
//       
//        PrintWriter outputFile = new PrintWriter(file);
//        
//        append information to save
//        outputFile.println("Student: " + name);
//        outputFile.println("Grade: " + grade);
//        outputFile.println("ID: " + IDNumber);
//        
//        outputFile.close();
//    }
    
    
    
}
