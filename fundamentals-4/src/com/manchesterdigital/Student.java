package com.manchesterdigital;

public class Student {

    private String name; //member variable - only belongs to the class.
    private int age;

//    public Student() {
//    } //what constructor stuff below does


    public Student(String name) {
        this.name = name;
    } //one way of changing name

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    } //ensures there's an empty parameter constructor to default to.

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    } //redundant if public Student constructor included above


    public int getAge() {
        return age;
    }

    @Override //uses this instead of the default toString Java provides. Matches the signature of the actual class now.
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student englishStudent = new Student("Amy");
        System.out.println(englishStudent.getName());

        Student frenchStudent = new Student("Duncan", 23);
        System.out.println(frenchStudent.getName() + " " + frenchStudent.getAge());

        System.out.println(englishStudent.toString()); //originally outputs memory reference of that object
        // (where it's stored). Will now output what the overridden version does.
    }
}
