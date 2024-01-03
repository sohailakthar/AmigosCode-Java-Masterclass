package com.sohail.M9_Packages;
import com.sohail.M9_Packages.email.EmailValidator;
public class Main {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidator();
        String email = "sohailakther@gmail.com";

        System.out.println(validator.isEmailValidPublic(email));
        // System.out.println(validator.isEmailValidPrivate(email));    <- Cannot access
        // System.out.println(validator.isEmailValidDefault(email));    <- Cannot access
    }
}
