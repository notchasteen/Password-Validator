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

        //Passes a third rule
        //password should have at least 1 special characters
        //!,@,#,$,%,^,&,*,(,)
        if (password.indexOf('!') !=-1 || password.indexOf('@') != -1
                || password.indexOf('#') != -1 ||password.indexOf('$') != -1
                || password.indexOf('%') != -1 || password.indexOf('^') != -1
                || password.indexOf('&') != -1 || password.indexOf('*') != -1
                || password.indexOf('(') != -1 || password.indexOf(')') != -1) {
            passedRules++;
        }

        //Passes fourth rule
        //password should have at least 1 digit
        if (password.matches(".*[0-9].*")){
            passedRules++;
        }

        //Passes 5th rule
        //Password should have at least 1 upper case letter
        if (password.matches(".*[A-Z].*")){
            passedRules++;
        }

        return passedRules;
    }
}
