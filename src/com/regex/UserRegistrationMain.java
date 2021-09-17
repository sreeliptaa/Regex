package com.regex;

/**
 * This is Main function
 * Calling methods to get user input for registration and validate
 *
 * @author Sreelipta
 * @since 2021-09-17
 */

public class UserRegistrationMain {
    public static void main(String[] args) {
        //Welcome Message
        System.out.println("Welcome to the User Registration and Validation Program");

        //Object
        UserRegistration userRegistration = new UserRegistration();

        //Calling Methods
        userRegistration.userFirstName();
        userRegistration.userLastName();
        userRegistration.userEmail();
    }

}
