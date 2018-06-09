package com.example.chasteenredondo.password_validator;

public class Validator {
    public int validate(String password) {
        int passedRules = 0;

        //passes the first rule
        //Password should not be "password"
        //also ignores case specifications
        if (!password.equalsIgnoreCase("Password")) {
            passedRules++;
        }

        //Passes the second rule
        //Password should at least be 8 characters long
        if (password.length() >= 8) {
            passedRules++;
        }
        return passedRules;
    }
}
