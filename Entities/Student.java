package Entities;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private ArrayList<Course> courseList;
    private double gpa;

    public Student() {
    }

    public Student(int studentId, String studentName, ArrayList<Course> courseList, double gpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseList = courseList;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Course> viewCourses() {
        return courseList;
    }

    public static void addCourse(int studentId, int courseId) {
        //Where to store students, professors and admin data?
    }

    public static void dropCourse(int studentId, int courseId) {
        //Where to store students, professors and admin data?
    }






}
