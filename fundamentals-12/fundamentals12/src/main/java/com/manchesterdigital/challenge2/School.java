package com.manchesterdigital.challenge2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public static void main(String[] args) {

        Student duncan = new Student("Duncan", "English", 75);
        Student stefan = new Student("Stefan", "German", 66);
        Student anthony = new Student("Anthony", "English", 55);
        Student anne = new Student("Anne", "French", 55);
        Student stephanie = new Student("Stephanie", "English", 48);

        List<Student> students = List.of(duncan, stefan, anthony, anne, stephanie);

        List<Student> passingStudents = students.stream()
                .filter(student -> (student.getName().startsWith("A") || student.getName().startsWith("S")))
                .filter(student -> (student.getScore() > 50)).collect(Collectors.toList());

        List<Student> englishStudents = passingStudents.stream()
                .filter(student -> student.getLanguage().equalsIgnoreCase("English"))
                .collect(Collectors.toList());

        List<Student> frenchStudents = passingStudents.stream()
                .filter(student -> student.getLanguage().equalsIgnoreCase("French"))
                .collect(Collectors.toList());

        List<Student> germanStudents = passingStudents.stream()
                .filter(student -> student.getLanguage().equalsIgnoreCase("German"))
                .collect(Collectors.toList());

        System.out.println("GermanStudents = " + germanStudents);
        System.out.println("frenchStudents = " + frenchStudents);
        System.out.println("englishStudents = " + englishStudents);

        List<Student> engMethodStudents = extractStudents(students, "English", 50);
        List<Student> gerMethodStudents = extractStudents(students, "German", 50);
        List<Student> frMethodStudents = extractStudents(students, "French", 50);

        System.out.println("frMethodStudents = " + frMethodStudents);
        System.out.println("gerMethodStudents = " + gerMethodStudents);
        System.out.println("engMethodStudents = " + engMethodStudents);




    }

    //refactored as a method to avoid DRY
    private static List<Student> extractStudents(List<Student> students, String language, Integer minScore){
        return students.stream()
                .filter(student -> (student.getName().startsWith("A") || student.getName().startsWith("S")))
                .filter(student -> (student.getScore() > minScore))
                .filter(student -> student.getLanguage().equalsIgnoreCase(language))
                .collect(Collectors.toList());
    }


    //all the things that have to be true to be a relevant student.
private static Predicate<Student> studentFilter(String language, Integer minScore){
 return student -> student.getLanguage().equalsIgnoreCase(language) && student.getScore() > minScore
         && (student.getName().startsWith("A") || student.getName().startsWith("S"));

}

//implements the predicate to filter the students.
    private static List<Student> extractStudentsUsingPredicate(List<Student> students, String language, Integer minScore){
        return students.stream()
                .filter(studentFilter(language, minScore)).collect(Collectors.toList());
    }



}
