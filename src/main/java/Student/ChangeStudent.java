/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * This class is responsible for modifying the properties of the user's based on
 * their selection
 *
 * @author wangsiyi
 */
public class ChangeStudent {

    static Scanner scan = new Scanner(System.in);
    private String command = "";
    private boolean flag = false;
    private boolean isexist = false;

    public void Modify(ArrayList<Student> students) {

        if (students.isEmpty()) {
            System.out.println("There are no student information in system, please add first! ");
            return;
        }

        System.out.println("Enter the ID of student you want to modify");
        System.out.println("Enter the ID of the student ");
        String id = scan.next();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSID().equals(id)) {

                isexist = true;

                while (!flag) {
                    information();

                    command = scan.next();

                    switch (command.toUpperCase()) {

                        case "NAME":
                            System.out.println("Please enter your  Name: ");
                            String name = scan.next();
                            students.get(i).setSName(name);
                            break;
                        case "AGE":
                            System.out.println("Please enter your Age: ");
                            int age = scan.nextInt();
                            students.get(i).setAge(age);
                            break;
                        case "GENDER":
                            while (true) {
                                System.out.println("Please enter your Gender M/F ");

                                String gender = scan.next();
                                if (gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M")) {//catch the exception
                                    students.get(i).setGender(gender);
                                    break;
                                } else {
                                    System.out.println("\"Wrong input, Please re-enter! \"");
                                }
                            }
                            break;

                        case "COURSE":
                            System.out.println("Please enter your Course: ");
                            String course = scan.next();
                            students.get(i).setCourse(course);
                            break;

                        case "GRADE":
                            while (true) {
                                System.out.println("Please enter your grade");
                                int grade = scan.nextInt();
                                if (grade < 0 || grade > 100) {//catch the exception
                                    System.out.println("Wrong input, Please re-enter! ");

                                } else {
                                    students.get(i).setGrade(grade);
                                    break;
                                }
                            }
                            break;

                        case "FINISH":
                            flag = true;
                            break;
                    }
                }
            }
        }
        if (!isexist) {
            System.out.println("This ID does not exist");
        }
    }

    public void information() {
        System.out.println("Choose the attribute you want to modify: ");
        System.out.println("1.Type 'Name'");
        System.out.println("2.Type 'Age'");
        System.out.println("3.Type 'Gender'");
        System.out.println("4.Type 'Course'");
        System.out.println("5.Type 'Grade'");
        System.out.println("6.Type 'Finish' when you are done");

    }
}
