package com.manchesterdigital.SOLID;

public class Engine {
    public void on(){
        System.out.println("Engine is on");
    }

    public void powerOn(Integer revs){
        System.out.println("Revving... " + revs);
    }
}
