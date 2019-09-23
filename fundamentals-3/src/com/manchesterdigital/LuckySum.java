package com.manchesterdigital;

public class LuckySum {

    public static void main(String[] args) {
        luckySum(3, 1, 13);

    }

    private static void luckySum(int a, int b, int c){
        int total = 0;
//        switch(a, b, c){
//            case a == 13: System.out.println(total);
//                break;
//            case b == 13: total = a;
//                System.out.println(total);
//                break;
//                case c == 13; total = a + b;
//                    System.out.println(total);
//                    break;
//            default: total = a;
//        }

        if(a==13){
            total = 0;
        } else if(b==13){
            total = a;
        }
        else if(c==13){
            total = a + b;

        }
        else {total = a + b + c;}
            System.out.println(total);

//        switch(b){
//            case 13:
//                System.out.println(total);
//                break;
//            default: total = a + b;
//        }
//
//        switch(c){
//            case 13:
//                System.out.println(total);;
//            break;
//            default: total = a + b + c;
//                System.out.println(total);
//        }
    }
}
