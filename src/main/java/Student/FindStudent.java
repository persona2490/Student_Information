/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * use student Id to search the student's information
 * @author Kevin
 */
public class FindStudent {

    Scanner scan = new Scanner(System.in);
    boolean flag = false;

    public void Find(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("\nThere are no student information in system, please add first! ");
            return;
        }
        System.out.println("Enter Student ID you want to Check: ");
        String id = scan.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getSID())) {
                System.out.println(students);
                System.out.println("ID:\tName: \tGender: \tAge: \tCourse: \tGrade: \t\t ");
                System.out.println(students.get(i).getSID()+"\t"+students.get(i).getSName()+"\t"+students.get(i).getGender()+"\t"+students.get(i).getAge()+"\t"+students.get(i).getCourse()+"\t"+students.get(i).getGrade()+"\t");
                
                flag = true;

            }

        }
        if(!flag)
        {
            System.out.println("Do not find this ID");
        }
        
    }
}