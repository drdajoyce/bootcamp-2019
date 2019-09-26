package com.manchesterdigital;

/**
 * goal to find a user in a particular database
 */

public class UserService {

    private static User user;

    static  {
        user = new User("April");
        user.setId(1L);
    } //initialises something that is static. setId finishes setting the user completely.
    //static is very useful for setting up dummy data. So this static block is in place of an actual databease.

    public User retrieveUser(Long id){

        if(!id.equals(user.getId())){
            throw new UserNotFoundException("User not found matching ID: " + id);
        }

        return user;
    } //now assumes there is a user & throws an error message if there isn't.

    public static void main(String[] args) {

        //UserService userService = new UserService();
        UserService userService1 = new UserService();

//        User retrievedUser = userService.retrieveUser(Long.MAX_VALUE); //should give null because April is 1.
//        System.out.println(retrievedUser); //gives NullPointerException.
//        System.out.println(retrievedUser.toString());

        User retrievedUser1 = userService1.retrieveUser(1L);
        System.out.println(retrievedUser1);
        System.out.println(retrievedUser1.toString());
    }
}
