package com.manchesterdigital.challenge1;

public class Album {
    private final String name;

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Album: " + name;
    }
}
