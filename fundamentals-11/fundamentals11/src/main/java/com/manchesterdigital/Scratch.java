package com.manchesterdigital;

import java.util.*;

public class Scratch {

    public static void main(String[] args) {
        Artist adele = new Artist("Adele", 90_000_000L);
        Artist prince = new Artist("Prince", 20_000_000L);

        List<Artist> artists = Arrays.asList( adele, prince);

        for(Artist artist : artists){
            System.out.println("artist = " + artist.toString());
        }

        Map<Long, Artist> artistMap = new HashMap<>();
        artistMap.put(1L, adele);
        artistMap.put(2L, prince);


        //would only need .keySet if iterating over keys
        for (Map.Entry<Long, Artist> entry : artistMap.entrySet()){
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        //iterate over keys:
        for (Long key : artistMap.keySet()){
            System.out.println("key = " + key);

            if (artistMap.containsKey(key)){
                System.out.println("Key " + key + " exists");
            }
        }

        //for values:
        for (Artist artist : artistMap.values()){
            System.out.println("artist = " + artist);
        }

        //sets:
        Set<Artist> artistSet = new HashSet<>(artistMap.values());

        //iterate over uniques values from artists:
        for (Artist artist : artistSet){
            System.out.println("unique artist = " + artist);
        }
        //everything so far is mutable.


        //Immutability
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        for (Integer i : numbers){
            System.out.println("i = " + i);
        }

        Set<Long> distances = Set.of(1L, 2L, 3L, 4L);

        for (Long distance : distances){
            System.out.println("distance = " + distance);
        }

        //creates a new map with some entries ready filled. Preferred route when you know you need an immutable map.
        Map<Long, String> namesMap = Map.of(1L, "John", 2L, "April");

        for (Map.Entry<Long, String> nameEntry : namesMap.entrySet()){
            System.out.println("nameEntry = " + nameEntry.getValue());
        }

        List<Artist> allArtists = List.of(adele, prince);

        for (Artist artist : allArtists){
            System.out.println("artist = " + artist);
        }

        allArtists.forEach(artist -> System.out.println("artist = " + artist));


        //preferred - uses method reference, much more compact & concerned with the what & not the how.
        allArtists.forEach(System.out::println);


    }


}
