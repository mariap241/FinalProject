package edu.ru.finalprojectmp;

import java.util.Scanner;

public class Assignment {

    String className;
    String assignmentName;
    int daysUntilDueDate;

    public String getClassName() {
        return className;
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

    public Assignment(String className, String assignmentName, int daysUntilDueDate) {
        this.className = className;
        this.assignmentName = assignmentName;
        this.daysUntilDueDate = daysUntilDueDate;
    }
    
    public Assignment(){
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
    }
}
