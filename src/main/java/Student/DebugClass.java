/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author wangsiyi
 */
public class DebugClass {

    public static void main(String[] args) {
        
        // Updated 
        
        Login lg = new Login();
        AddStudent add = new AddStudent();
        DeleteStudent delete = new DeleteStudent();
        ChangeStudent change = new ChangeStudent();
        FindStudent find = new FindStudent();
        Display_All_Student display = new Display_All_Student();

        ArrayList<Student> student = new ArrayList<>();

        String choice = "";


        lg.AddUser();
        IOFile.ReadStudent(student);
        // if log in successfully
        if (!lg.AddUser()) {
 

            while (true) {
                information();

                Scanner scan = new Scanner(System.in);

                try {
                    choice = scan.nextLine();

                } catch (Exception e) {
                }

                switch (choice) {
                    case "1":
                        add.Add(student);
                        break;
                    case "2":
                        delete.delete(student);
                        break;
                    case "3":
                        change.Modify(student);
                        break;
                    case "4":
                        find.Find(student);
                        break;
                    case "5":
                        display.DisplayAll(student);
                        break;
                    case "6":
                        System.out.println("Thanks for you using ");
                        IOFile.writeToFile(student);
                        System.exit(0);

                        break;
                    default:
                        System.out.println("Wrong Command!  ");

                }

            }

        }
    }

    public static void information() {

        System.out.println("*************************************************");
        System.out.println("Please choose one of the following options: ");
        System.out.println("1.Add student information");
        System.out.println("2.Delete student information");
        System.out.println("3.Modify the student information");
        System.out.println("4.Look for the student");
        System.out.println("5.Display all student information");
        System.out.println("6.Exit");

        System.out.println("*************************************************");
        System.out.println("Your choice: ");
    }
}
