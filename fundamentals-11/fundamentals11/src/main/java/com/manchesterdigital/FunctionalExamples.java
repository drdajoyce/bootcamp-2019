package com.manchesterdigital;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalExamples {

    public static void main(String[] args) {
        /*1st calculate total price of all items.
        2nd multiply sales by tax
        3rd add sales to total
        4th return total
         */

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//imperative style delivery
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers = " + numbers.get(i));
        }

        //moved on, 2000s
        for (Integer i : numbers) {
            System.out.println("i = " + i);
        }

        //functional programming - lambda expression:

        /** lambda expression syntax
         *  (A list of parameters separated by commas) -> { expression body containing 1 or more statements}
         *  parenthesise optional for single expressions.
         */

        //lambda function eg
        NumbericTest isEven = n -> (n % 2 == 0);

        System.out.println(
                "is 4 and even number? " + isEven.computeTest(4)
        );

        System.out.println(
                "is 5 and even number? " + isEven.computeTest(5)
        );

        NumbericTest isNegative = n -> (n < 0);

        System.out.println("-1 is negative? " + isNegative.computeTest(-1));


        //creates anonymous class.
//        NumbericTest isOdd = new NumbericTest() {
//            @Override
//            public boolean computeTest(int n) {
//                return false;
//            }
//        };

        NumbericTest isOdd = n -> false;

        Greeting frenchGreeting = () -> System.out.println("Bonjour");

        Greeting greetInSpanish = () -> System.out.println("Hola");

        frenchGreeting.message();
        greetInSpanish.message();

        //takes in a string, returns some integer - outdated now.
        Function<String, Integer> getWordLength = new Function<String, Integer>(){
            @Override
            public Integer apply(String word) {
                return word.length();
            } //apply is an abstract method.
        };

        Integer helloLength = getWordLength.apply("Hello");
        System.out.println("helloLength = " + helloLength);


        //method reference, 2 colons are a pointer to find length within this class.
        //provides the what not the how.
        Function<String, Integer> getWordLengthModernised = String::length;
        Integer len = getWordLengthModernised.apply("Amy");

        System.out.println("len = " + len);

        Function<Artist, String> extractArtistName = Artist::getName;
        Function<String, String> convertToUppercase = String::toUpperCase;

        Artist skepta = new Artist("Skepta", 2_000_00L);

        String artistName = extractArtistName.apply(skepta);

        String uppercaseName = convertToUppercase.apply(artistName);
        System.out.println("uppercaseName = " + uppercaseName);


        //how to chain together calling both functions.
        String allFunctions = extractArtistName.andThen(convertToUppercase).apply(skepta);
        System.out.println("allFunctions = " + allFunctions);

        Function<Integer, Double> half = a -> a/2.0d;


        //does the lambda nested in the brackets first, then does half.
        half = half.compose(a -> a * 3);

        System.out.println("half.apply(5) = " + half.apply(5));

        //if used this instead of top one, will calculate half of 10, and then run the lambda you've created.
        half = half.andThen(a -> a * 3);

        System.out.println("half.apply(10) = " + half.apply(10));

        //Challenge 1

        MultiplyBy2 x2 = n -> 2 * n;

        System.out.println(x2.timesTwo(3));

        Function<Integer, Integer> timesBy2 = a -> a * 2;
        System.out.println("timesBy2.apply(2) = " + timesBy2.apply(2));

        //Challenge 2

        Multiplication multiplication = (n, m) -> n * m;

        Function<Numbers, Integer> multiply = a -> a.getA() * a.getB();
        Numbers numbersInputs = new Numbers(1,2);
        multiply.apply(numbersInputs);

        //Divide a number by another number:
        Divider divider = (a, b) -> a / b;
        Double doubleResult = divider.divideIt(4.0, 2.0);
        System.out.println("doubleResult = " + doubleResult);

        //this will fail:
        Double doubleResult2 = divider.divideIt(4.0, 0.0);

        Divider safeDivider = (a, b) -> {
            if (b == 0){
                return 0d;
            }
            return a / b;
        };

        Divider safeDivider2 = (a, b) -> ( b == 0) ? b : a /b;
        Double zeroResult = safeDivider2.divideIt(2d, 0d);
        System.out.println("zeroResult = " + zeroResult);

        Function<DivideNumbers, Double> dividerFunc = a -> (a.getB() == 0) ? a.getB() : a.getA() / a.getB();

        System.out.println("dividerFunc = " + dividerFunc.apply(new DivideNumbers(2d, 0d)));


    }


    }
