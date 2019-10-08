package com.manchesterdigital;

public class Members {
    private final String name;

    public Members(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Members{" +
                "name='" + name + '\'' +
                '}';
    }
}
