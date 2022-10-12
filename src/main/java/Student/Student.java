/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;


/**
 * Encapsulationall kind of student information variasble
 * @author wangsiyi
 */
public class Student {

    private String SName;
    private String SID;
    private int Age;
    private String Gender;
    private String Course;
    private int Grade;

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        this.Grade = grade;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int ages) {
        this.Age = ages;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

}
