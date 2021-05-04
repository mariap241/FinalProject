package edu.ru.finalprojectmp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.Serializable;
import java.io.NotSerializableException;

public class MainClass {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Student maria = new Student("Maria", "jr", 900491003);
        //student01.display();

        //Assignment assignment01 = new Assignment(student01);
        //assignment01.display();
        //Assignment assignment02 = new Assignment(student01);
        //assignment02.display();
        //assignment02.saveInfo();
        Assignment assignment03 = new Assignment("Cst250", "Final Project", 4, maria);
        //assignment03.display();
        saveAssignment(assignment03);
        //assignment03.getStudent().display();
    }

    public static void saveAssignment(Assignment assignment) throws ClassNotFoundException, FileNotFoundException, IOException {
        try {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Where would you like to save this information?");
            String fileName = keyboard.nextLine();

            FileOutputStream fos = new FileOutputStream(new File(fileName));
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Write objects to file
            oos.writeObject(assignment);

            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(new File(fileName));
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Read objects
            Assignment hw = (Assignment) ois.readObject();

            System.out.println("Assignment: " + hw.getAssignmentName());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
                }
        }

    

    

    public static void searchStudent(String studentName) throws FileNotFoundException {

        Scanner keyboard = new Scanner(System.in);

        //ask what file to search thru
        System.out.println("What file would you like to search?");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {

            for (int i = 0; i < file.length(); i++) {

                String line = inputFile.next(studentName);
                String[] splitLine = line.split(" ");

                if (splitLine.equals(studentName)) {
                    System.out.println(line);
                    String className = inputFile.nextLine();
                    System.out.println(className);
                }
            }
        }

    }
}
