package com.manchesterdigital.SOLID;

public class Book {

    private String name;
    private String author;
    private String isbn;
    private Printer printer;

    //constructor, getters, setters...


    public Book(Printer printer) {
        this.printer = printer;
    } //replaces responsibility of printToConsole.

    public boolean isInIsbn(String sequence){
        return isbn.contains(sequence);
    }

    //NOT SRP
//    public void printToConsole(){
//        System.out.println(String.format("Book %s, Author %s, ISBN %s", name, author, isbn));
//    }

}
