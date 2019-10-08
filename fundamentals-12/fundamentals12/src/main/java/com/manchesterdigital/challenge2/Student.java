package com.manchesterdigital.challenge2;

public class Student {
    private final String name;
    private String language;
    private Integer score;

    public Student(String name, String language, Integer score) {
        this.name = name;
        this.language = language;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", score=" + score +
                '}';
    }
}
