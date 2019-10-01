package com.manchesterdigital;

import java.util.Objects;

public class SpotifyAccount {
    private final String username;
    private final String password;

    public SpotifyAccount(String username, String password) {

        this.username = username;
        this.password = password;
    }

    //creating an equals and hashcode stops comparison errors.
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SpotifyAccount that = (SpotifyAccount) o;
//        return Objects.equals(username, that.username) &&
//                Objects.equals(password, that.password);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(username, password);
//    }

    //alternative

    public String getUserName(){
    return username; //would give a null by default
    }

}
