package net.henrypost.customer.util;

public class EmailValidator {

    public static boolean isEmailInvalid(String email) {
        return !isEmailValid(email);
    }

    public static boolean isEmailValid(String email) {
        return email.contains("@");
    }
}
