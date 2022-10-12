/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Display_All_Student {

    public  void DisplayAll(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("There are no student information in system, please add first! ");
            return;
        }
        System.out.println("ID:\tName: \tGender: \tAge: \tCourse: \tGrade: \t\t ");

        for (int i = 0; i < students.size(); i++) {
            Student stu = students.get(i);
            String id = stu.getSID();
            String name = stu.getSName();
            String gender = stu.getGender();
            int age = stu.getAge();
            String course = stu.getCourse();
            int grade = stu.getGrade();

            System.out.println(id + "\t" + name + "\t" + gender + "\t" + age + "\t" + course + "\t" + grade + "\t");
        }
        System.out.println("All student information have been displayed! ");
    }

}


