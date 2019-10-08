package com.manchesterdigital;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arena {

    public static void main(String[] args) {

        Artist arianaGrande = new Artist("Ariana Grande",
                List.of(new Members("Ariana Grande")), "London");
        Artist beatles = new Artist("Beatles",
                List.of(new Members("John Lennon"),
                        new Members("Paul McCartney"),
                        new Members("Ringo Starr"),
                        new Members("George Harrison")), "Liverpool");
        Artist coldplay = new Artist("Coldplay",
                List.of(new Members("Chris Martin"),
                        new Members("Guy Berryman"),
                        new Members("Will Champion"),
                        new Members("Phil Harvey")), "London");


        List<Artist> artists = List.of(arianaGrande, beatles, coldplay);
        long countFromLiverpool = 0;

        for (Artist artist : artists){
            if (artist.isFrom("Liverpool")){
                countFromLiverpool++;
            }
        }

        System.out.println("countFromLiverpool = " + countFromLiverpool);


        //filters the stream to get anyone from Liverpool. count is the terminator:
        Long numberOfArtistsFromLiverpool = artists.stream()
                .filter(artist -> artist.isFrom("Liverpool"))
                .filter(artist -> artist.getMembersList().size() > 2)
                .count();

        System.out.println("numberOfArtistsFromLiverpool = " + numberOfArtistsFromLiverpool);

        //findFirst - finds 1st occurrence of case. findAny - finds any occurrence at random.
        String s1 = Stream.of("a", "b", "c").filter(s -> s.equalsIgnoreCase("a"))
                .findFirst().orElse(null);

        System.out.println("s1 = " + s1);

        //gathering matched criteria to use maybe elsewhere:
        List<Artist> london = artists.stream().filter(artist -> artist.isFrom("London"))
                .collect(Collectors.toList());
        //.collect is terminator.

        //.map converts one thing to another or can extract things. eg here, it extracts artists' names.
        london.stream().map(Artist::getName).forEach(System.out::println);


        //prints all artist members.
        List<Members> artistMembers = artists.stream().map(Artist::getMembersList).flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("artistMembers = " + artistMembers.toString());

        //sorting (old school)
//        Collections.sort(artists, new Comparator<Artist>() {
//            @Override
//            public int compare(Artist o1, Artist o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        //better to do this:
        Set<Artist> uniqueArtists = new HashSet<>(artists);

        uniqueArtists.stream().sorted(Comparator.comparing(Artist::getName));



    }//end of main

}//end of class
