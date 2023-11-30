package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationInter {
    boolean firstNameMatchFun(String s);
}
public class UserRegistration implements UserRegistrationInter{


    /*public static void main(String[] args) {

        String fName = "Sushil";
//        UserRegistrationInter user = (name) -> { boolean res = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(fName).matches(); return res;};
//        System.out.println(user.firstNameMatchFun(fName));
        boolean user = firstNameMatchFun(fName);

//
//        UserRegistrationInter user = new UserRegistrationInter() {
//            @Override
//            public boolean firstNameMatchFun(String s) {
//                return false;
//            }
//        }
    }*/

//    public boolean firstNameMatchFun(String fName) {
//        Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-z]{2,}$");
//        Matcher matcher = pattern.matcher(fName);
//        if(matcher.matches()){
//            return true;
//        }
//
//        return false;
//    }
    public boolean firstNameMatchFun(String fName) {
        boolean res = Pattern.compile("^[A-Z]{1}[a-z]{2,}$").matcher(fName).matches();
        return res;
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

    public boolean mobileValidateFun(String mobileNumber) {
        Pattern pattern =Pattern.compile("^[9][0-9]{1}\\s\\d{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean minimumEightCharFun(String pass) {
        Pattern pattern = Pattern.compile("^[a-z]{8}");
        Matcher matcher = pattern.matcher(pass);
        if (matcher.matches()){
            return true;
        }

        return false;
    }

    public boolean minimumEightCharHavingAtleasteUpperCaseFun(String passw) {
        // ^[a-z]{8}+|(?=(?:[^A-Z]*[A-Z]){1})(?=[a-zA-Z]*$ <-- this pass UC5 and UC6 both
        // ^(?=(?:[^A-Z]*[A-Z]){1})(?=[a-zA-Z]*$ <-- this is for UC6 only
        Pattern pattern = Pattern.compile("^(?=(?:[^A-Z]*[A-Z]){1})(?=[a-zA-Z]*$)[a-zA-Z]{8}$");
        Matcher matcher = pattern.matcher(passw);
        if (matcher.matches()){
            return true;
        }

        return false;
    }

    public boolean minEightCharHavingAtleasteOneUpperCaseAndOneNumberFun(String password) {
        //Pattern pattern = Pattern.compile("^(?=(?:[^A-Z]*[A-Z]){1})(?=(?:[^0-9]*[0-9]){1})(?=[a-zA-Z0-9#$@%&]*$)[a-zA-Z0-9#$@%&]{8}$");
        Pattern pattern = Pattern.compile("^(?=(?:[^A-Z]*[A-Z]){1})(?=(?:[^0-9]*[0-9]){1})(?=[a-zA-Z0-9#$@%&]*$)[a-zA-Z0-9]{8}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            return true;
        }

        return false;
    }

    public boolean minEightCharHavingAtleasteOneUppCaseOneNumOneSpecialCharFun(String passwordUpdate) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^%_#&$+=@]*[%_#&$+=@][^%_#&$+*^=@]*$).{8}$");
        Matcher matcher = pattern.matcher(passwordUpdate);
        if (matcher.matches()){
            return true;
        }

        return false;
    }

    public boolean sampleEmailValidateMethod(String s) {
        Pattern pattern = Pattern.compile("^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$");
        Matcher matcher = pattern.matcher(s);
        return (matcher.matches());
    }
}
