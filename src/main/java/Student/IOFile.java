/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class IOFile {

    public static void ReadStudent(ArrayList<Student> student) {
        BufferedReader br = null;
        
      
        try {//read the content of txt file and input them in the systems
            br = new BufferedReader(new FileReader("StudentID.txt"));
            String line = null;
            
            while ((line = br.readLine()) != null) {
                
                String[] strArray = line.split(",");
                
                Student stu = new Student();
                stu.setSID(strArray[0]);
                stu.setSName(strArray[1]);
                stu.setGender(strArray[2]);
                stu.setAge(Integer.parseInt(strArray[3]));
                stu.setCourse(strArray[4]);
                stu.setGrade(Integer.parseInt(strArray[5]));
                
                student.add(stu);
                

               
             
            }
            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not found.");
        } catch (IOException ex) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
      
    }

    public static void writeToFile(ArrayList<Student> student) {
        PrintWriter pw = null;
        try {
            //save the infortion in studentID.txt
            pw = new PrintWriter(new FileOutputStream("StudentID.txt", false));

            for (Student s : student) {

                pw.write(s.getSID()+ ",");
                pw.write(s.getSName()+ ",");
                pw.write(s.getGender()+ ",");
                pw.write(s.getAge()+ ",");
                pw.write(s.getCourse()+ ",");
                pw.write(s.getGrade()+ "\n");

//                pw.println(s.getSID());
//                pw.println(s.getSName());
//                pw.println(s.getGender());
//                pw.println(s.getAge());
//                pw.println(s.getCourse());
//                pw.println(s.getGrade());

            }
            pw.close();

        } catch (FileNotFoundException e) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("File not found.");
        }
    }

}
