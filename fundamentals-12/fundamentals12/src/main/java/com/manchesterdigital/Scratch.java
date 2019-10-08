package com.manchesterdigital;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Scratch {

    public static void main(String[] args) {

        List<String> names = List.of("jose", "andrew", "emalin");

        System.out.println("names = " + StringUtils.capitalize(names.get(0)));

        System.out.println("names = " + StringUtils.defaultString(names.get(0), "default"));

        Artist.ArtistBuilder artistBuilder = Artist.builder().name("stormzy").album("Gangs and Prayers")
                .membersList(List.of()); //makes the builder, .build would finish doing the object.

        System.out.println("artistBuilder = " + artistBuilder.build().toString());


    }
}
