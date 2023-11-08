package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstNameMatchFun(String fName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(fName);
        if(matcher.matches()){
            return true;
        }

        return false;
    }

    public boolean lastNameMatchFun(String lName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(lName);
        if(matcher.matches()){
            return true;
        }

        return false;
    }

    public boolean emailMatchFun(String emailId) {
        //Pattern pattern = Pattern.compile("^[a-z]+[-$%&+.]?[0-9a-z]+@[a-z0-9]?[a-z]{3,}([.][a-z]{2,4})$");
        Pattern pattern = Pattern.compile("^[a-z0-9._%+-]+@[a-z]+\\.[a-z]{2,4}$");
        Matcher matcher = pattern.matcher(emailId);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

}
