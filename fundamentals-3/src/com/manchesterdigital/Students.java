package com.manchesterdigital;

public class Students {
    public static final  String CLASS_NAME = "Bootcamp"; //creates a constant.

    //eg of an instance variable;
    private String studentName;

    public Students(String studentName) {
        this.studentName = studentName;
    }
    /*
    Creates a brand new student of a given name. Have access to studentName every time you create one. Constructor
    must have same name as class.
     */

    public static void main(String[] args) {
        Students student = new Students("Emalin");
        student.printDetails();
    }

    public void printDetails(){
        System.out.println("Student's name is " + studentName + " Class is: " + CLASS_NAME);
    }
}
