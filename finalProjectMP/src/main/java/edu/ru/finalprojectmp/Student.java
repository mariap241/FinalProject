
package edu.ru.finalprojectmp;

import java.util.Scanner;


public class Student {
    private String name;
    private String grade;
    private int IDNumber;

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

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
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
    }
}
