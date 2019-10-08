package com.manchesterdigital.challenge1;

import java.util.List;

public class HMV {

    public static void main(String[] args) {
        Album abbeyRoad = new Album("Abbey Road");
        Album automaticForThePeople = new Album("Automatic for the People");
        Album changes = new Album("Changes");
        Album upsideDownMountain = new Album("Upside Down Mountain");

        List<Album> albums = List.of(abbeyRoad, automaticForThePeople, changes, upsideDownMountain);

        //.foreach(System.out::println) is what prints each album beginning with A.
        //alternative is (album) -> System.out.println(album)
        albums.stream().filter(album -> album.getName().startsWith("A")).forEach(System.out::println);

    }

}
