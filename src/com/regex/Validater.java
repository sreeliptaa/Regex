package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Validates the user input with condition given
 * If it doesn't matches, asks user again to enter input
 *
 * @author Sreelipta
 */

public class Validater {
    //object
    static UserRegistration userRegistration = new UserRegistration();

    /**
     * Ability to validate the user FirstName with the condition Condition: Min. of
     * 3 characters and First letter should be Capital If it doesn't matches, asks
     * user again to enter the name by calling method
     *
     * @param details
     */
    public static void CheckFirstname(Details details) {
        String check = "^[A-Z]{1}[a-z]{2,}$"; // Condition
        Pattern pattern = Pattern.compile(check); // Assigning condition to compile
        Matcher matcher = pattern.matcher(details.getFirstName()); // Checking for Matching
        boolean result = matcher.matches(); // Matches result: True or False
        if (result) {
            System.out.println("First Name '" + details.getFirstName() + "' is Valid and Saved to details");
        } else {
            System.out.println("\nInvalid First Name.\nUse min. of 3 characters and First letter should be Capital\n");
            userRegistration.userFirstName(); // calling the method to ask user
        }
    }

    /**
     * Ability to validate the user LastName with the condition
     * Condition: Min. of 3 characters and First letter should be Capital
     * If it doesn't matches, asks user again to enter the name by calling method
     *
     * @param details
     */
    public static void CheckLastname(Details details) {
        String check = "^[A-Z]{1}[a-z]{2,}$"; // Condition
        Pattern pattern = Pattern.compile(check); // Assigning condition to compile
        Matcher matcher = pattern.matcher(details.getLastName()); // Checking for Matching
        boolean result = matcher.matches(); // Match result: True or False
        if (result) {
            System.out.println("Last Name '" + details.getLastName() + "' is Valid and Saved to details");
        } else {
            System.out.println("\nInvalid Last Name.\nUse min. of 3 characters and First letter should be Capital");
            userRegistration.userLastName(); // calling the method to ask user
        }
    }

    /**
     * Ability to validate the user E-mail with the conditions
     * Condition: 1) Email has 3 mandatory parts (user name, @ , domain name)
     * Condition: 2) user name must have min. of 3 character and optional of '.' with 3 characters
     * Condition: 3) Domain name must have '@' and then characters of 2-3 and then '.' with 2-3 characters
     * Condition: 4) Domain name may contains extra 2-3 characters starting with '.' again
     * If it doesn't matches, asks user again to enter the E-mail by calling method
     *
     * @param details
     */
    public static void CheckEmail(Details details) {
        String check = "^[a-z]+(\\.[a-zA-Z0-9]+)*@[a-z]{2,}\\.[a-z]{2,3}(\\.[a-z]{2,3})*$"; //Condition
        Pattern pattern = Pattern.compile(check); //Assigning condition to compile
        Matcher matcher = pattern.matcher(details.getEmail()); //Checking for Matching
        boolean result = matcher.matches(); // Match result: True or False
        if (result) {
            System.out.println("E-mail: '" + details.getEmail() + "' is Valid and Saved to details");
        } else {
            System.out.println("\nInvalid E-mail.\nE-mail is of like abc.xyz@bl.co.in");
            userRegistration.userEmail(); //calling the method to ask user
        }
    }
}
