package net.henrypost.customer.util;

public class EmailValidator {

    public static boolean isEmailValid(String email){
        return email.contains("@");
    }
}
