package com.manchesterdigital;

public class StaticEg {

    private String name;

    static String schoolName = "BOOTCAMP"; //will only ever be one of these.
    private static final String SCHOOL_ALIAS = "BOOTCAMP"; //alternative, prevents it from being change on top of this.

    public void setName(String name) {
        this.name = name;
    }

    public static int getMarks(){
        return 10;
    }

    private void sayHello(){
        String message = "Hello";
        System.out.println(message);
    }

    public static void main(String[] args) {
        StaticEg amy = new StaticEg();
        //amy.name = "Amy"; // not safe.
        amy.setName("Amy"); //safer, people can only see you're setting now.
        amy.sayHello(); //accessible because we're still in this class.
    }
}
