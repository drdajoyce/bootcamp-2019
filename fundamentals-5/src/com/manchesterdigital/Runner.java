package com.manchesterdigital;

public class Runner {

    public static void main(String[] args) {

        String name = "Johanna";
        String secName = "Johanna";
        String thiName = "Duncan";

        Boolean result = Utility.isEven(2);//won't put out to console, needs sout.
        System.out.println("Result: " + result);

        Boolean nameCheck1 = Utility.sameName(name, secName);
        Boolean nameCheck2 =  Utility.sameName(name, thiName);

        System.out.println(name + " equals " + secName +"? " +nameCheck1);
        System.out.println(name + " equals " + thiName +"? " +nameCheck2);

        Dog poodle = new Dog(20);
        System.out.println(poodle.bark());

        Dog rottweiler = new Dog(100);
        System.out.println(rottweiler.bark());

        Dog.relieve();
        System.out.println(Dog.NUMBER_OF_TEETH);


        Long id;


        try {
            id = Utility.convertStringToLong("123456");
            System.out.println(id);
        }
        catch (NumberFormatException e){ //a plain Exception just swallows all possible methods, bad practice.
            //e.printStackTrace(); gives the full stack trace of the error.
            System.err.println("Input provided was not a valid number " + e); //eg characters like letters.

            id = Long.MAX_VALUE;
        }

        System.out.println("My ID is: " + id);

        //don't do
//        try{
//            Long num = Utility.convertStringToLong("23");
//        }
//        catch(Throwable e){
//            //throwable is the worst one you can use - absorbs the error messages & doesn't reveal it.
//            //don't leave empty catches.
//        }

        //don't do this either.

        try{
            Long num2 = Utility.convertStringToLong("23");
        }
        catch(NumberFormatException e){
            System.err.println(e);
            throw e; //don't re-throw the throw. Don't do the err print at the same time either, shows it twice.
        }

        //instead do this
        //FileInputStream iStream = new FileInputStream();
            try{
                Long num3 = Utility.convertStringToLong("23");
            }
            catch(NumberFormatException e){
                System.err.println(e);
                throw new IllegalArgumentException("Invalid input provided", e);
            }
            finally {
                //to stop things lingering in the background that might not have been turned off.
                //iStream.close();
            }
        }




    }
}
