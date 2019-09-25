package com.manchesterdigital;

public class Dog {

    public static final int NUMBER_OF_TEETH = 1;
    private int sizeOfDog; //member variable

    public Dog(int sizeOfDog) {
        this.sizeOfDog = sizeOfDog; //this refers to current instance/object you are in.
    } //best practice to put constructors after member variables.

    public String bark(){ //eg of non-static method.
        if(sizeOfDog > 60){
            return "WOOF!";
        }
        else if(sizeOfDog > 15){
            return "RUFF!";
        }

        return "YIP!";
    } //member method.

    public static void relieve(){
        System.out.println("Gone for a dump...");
    } //only accessible at class level, not instances of the class.
}
