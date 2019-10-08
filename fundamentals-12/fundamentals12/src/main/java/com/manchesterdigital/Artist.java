package com.manchesterdigital;

import lombok.*;

import java.util.List;


//when lombok imported, doing these annotations create constructors, getters & setters automatically.
@RequiredArgsConstructor
@Getter
@Setter
@AllArgsConstructor //or can use @Data to consolidate getter, setter & AllArgsConstructor
@Builder
@ToString
    public class Artist {
        private final String name;
        private String song;
        private String album;
        private final List<Members> membersList;
        private final String location;

//        public Artist(String name, List<Members> membersList, String location) {
//            this.name = name;
//            this.membersList = membersList;
//            this.location = location;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public String getSong() {
//            return song;
//        }
//
//        public void setSong(String song) {
//            this.song = song;
//        }
//
//        public String getAlbum() {
//            return album;
//        }
//
//        public void setAlbum(String album) {
//            this.album = album;
//        }
//
//        public List<Members> getMembersList() {
//            return membersList;
//        }
//
//        public String getLocation() {
//            return location;
//        }

        public boolean isFrom(String locationRequired) {
            return location.equalsIgnoreCase(locationRequired);
        }
    }

