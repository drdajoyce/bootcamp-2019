package com.manchesterdigital;

public class BakingExample {
    public static void main(String[] args) {
        switchOvenOn(6);
    }

//    private void decorate(){
//        System.out.println("Decorating cake..."); //no static so can't be called in the class at all yet.
//    }
//
//    protected void decorate(){
//        System.out.println("Decorating cake..."); //now can be called by sibling class.
//    }


    public void decorate(){
        System.out.println("Decorating cake..."); //now can be called by sibling packages.
    }

    protected static int switchOvenOn(int setting){
        System.out.println("Setting over on to level" + setting);

        int minutesToCook = 0;
        switch(setting){
            case 1:
                System.out.println("Set to level 1");
                minutesToCook += 20;
                break;
            case 2:
                System.out.println("Set to level 2");
                minutesToCook += 30;
                produceMixture(); //don't do this - moving one method in another if user thinks it only has single
                //purpose.
                break;
            case 3:
                System.out.println("Set to level 3");
                minutesToCook += 40;
                break;
            case 4:
                System.out.println("Set to level 4");
                minutesToCook += 50;
                break;
            case 5:
                System.out.println("Set to level 5");
                minutesToCook += 60;
                break;
            default:
                System.out.println("Oven is off");
        }

        return minutesToCook;
    }

    private static void produceMixture(){
        System.out.println("Mixing...");
    }
}
