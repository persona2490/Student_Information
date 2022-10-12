/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *This class is responsible for adding various information about the student
 * @author wangsiyi
 */
public class AddStudent {

    Scanner scan = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    public void Add(ArrayList<Student> students) {

        Student stu = new Student();
        String stuID;
        boolean flag = false;
        while (!flag) {
            System.out.println("Enter student Id (8 digit), Press 'X' return :");
            stuID = scan.next();

            if (stuID.equalsIgnoreCase("x")) {
                return;
            }

            //If digit is not equal to 8
            if (stuID.length() != 8) {
                System.out.println("\"Wrong input, Please Re-enter! \"");

            } //If ID have existed
            else {

                for (int i = 0; i < students.size(); i++) {
                    int counter = 0;

                    if (stuID.equals(students.get(counter).getSID())) {
                        System.out.println("This Id has exist！Please re-enter! ");
                    } else {

                        stu.setSID(stuID);
                        flag = true;

                    }
                    counter++;

                }
            }

        }

//        stu.setSID(ID());
        stu.setSName(name());

        stu.setGender(gender());

        stu.setAge(age());

        stu.setCourse(Course());

        stu.setGrade(Grade());

        addStu(stu);
        students.add(stu);

        System.out.println("\nNew student added!\n");
    }

    public void addStu(Student stu) {
        students.add(stu);
    }

    public String name() {

        String name;

        System.out.println("Enter student name: ");
        name = scan.next();

        return name;
    }

//    public String ID() {
//
//        String stuID;
//
//        System.out.println("Enter student Id (8 digit) :");
//        stuID = scan.next();
//
//        //If digit is not equal to 8
//        if (stuID.length() != 8) {
//            System.out.println("\"Wrong input, Please re-enter! \"");
//            ID();
//        }
//
//        //If ID have existed
//        for (int i = 0; i < students.size(); i++) {
//            if (stuID.equals(students.get(i).getSID())) {
//                System.out.println("This Id has exist！Please re-enter! ");
//                ID();
//                break;
//            }
//        }
//
//        return stuID;
//    }
    public String gender() {

        String stuGender;

        System.out.println("Enter gender : M/F");
        stuGender = scan.next();

        if (!stuGender.equalsIgnoreCase("M") && !stuGender.equalsIgnoreCase("F")) {
            System.out.println("\"Wrong input, Please re-enter! \"");
            gender();
        }

        return stuGender;
    }

    public int age() {

        int stuAge;

        System.out.println("Enter age ：");
        stuAge = scan.nextInt();

        if (stuAge < 0 || stuAge >= 80) {
            System.out.println("\"Wrong input, Please re-enter! \"");
            age();
        }

        return stuAge;
    }

    public String Course() {
        String stuCourse;

        System.out.println("Enter the Course: ");
        stuCourse = scan.next();
        return stuCourse;

    }

    private int Grade() {
        int stuGrade;

        System.out.println("Enter this course's  grade");
        stuGrade = scan.nextInt();

        if (stuGrade < 0 || stuGrade > 100) {
            System.out.println("Wrong input, Please re-enter! ");
            Grade();
        }
        return stuGrade;

    }

}
