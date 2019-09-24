package com.manchesterdigital;

public class MethodOverloadingEg {

    public int multiply(int a, int b){
        return a * b;
    }

    public int multiply( int first, int second, int third){
        return first * second * third;
    }

    public int multiply( int first, int second, int third, int fourth){
        return multiply(first, second, third)* fourth;
    }



    public static void main(String[] args) {
        MethodOverloadingEg me = new MethodOverloadingEg();

        int result = me.multiply(3, 3);
        System.out.println("Result: " + result);

        result = me.multiply(3,3,9);
        System.out.println("Result: " + result);

        result = me.multiply(3,3,3,4);
        System.out.println("Result: " + result);
    }
}
