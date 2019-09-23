package com.manchesterdigital;

public class LuckySum {

    public static void main(String[] args) {
        luckySum(13, 2, 1);

    }

    private static Integer luckySum(int a, int b, int c){
        int total = 0;
        switch(a){
            case 13:
                return total;
            default: total = a + b + c;
            return total;
        }
    }
}
