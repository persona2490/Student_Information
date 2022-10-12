/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *Delete student based on student ID
 *
 * @author wangsiyi
 */
public class DeleteStudent {

    Scanner sc = new Scanner(System.in);

    public void delete(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("There are no student information in system, please add first! ");
            return;
        }

        System.out.println("Enter Student ID you want to DELETE: ");
        String id = sc.nextLine();
        
        boolean isDel = false;

        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getSID())) {
                isDel = true;
                students.remove(i);
                
                break;
            } 

        }
        if(isDel)
        {
            System.out.println("DELETE Successfully, return");
        }
        else{
            System.out.println("Do no find this student's information");
        }

    }
}
