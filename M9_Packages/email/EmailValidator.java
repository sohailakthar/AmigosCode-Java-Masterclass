package com.sohail.M9_Packages.email;

public class EmailValidator {
    final String VALID_EMAIL_REGEX = "^(.+)@(\\S+)$";
    public boolean isEmailValidPublic(String email) {
        return email.matches(VALID_EMAIL_REGEX);
    }

    private boolean isEmailValidPrivate(String email) {
        return email.matches(VALID_EMAIL_REGEX);
    }

    boolean isEmailValidDefault(String email) {
        return email.matches(VALID_EMAIL_REGEX);
    }
}
