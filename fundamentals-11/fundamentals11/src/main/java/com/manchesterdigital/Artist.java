package com.manchesterdigital;

public class Artist {
    private final String name;
    private final  Long numberOfFollowers;

    public Artist(String name, Long numberOfFollowers) {
        this.name = name;
        this.numberOfFollowers = numberOfFollowers;
    }

    //private parameters so only make getters, no setters.

    public String getName() {
        return name;
    }

    public Long getNumberOfFollowers() {
        return numberOfFollowers;
    }


    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", numberOfFollowers=" + numberOfFollowers +
                '}';
    }
}
