package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
   /* public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Sushil");
        RegistrationInterface registrationInterface = ("Sushil") ->{
            Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-z]{2,}$");
            Matcher matcher = pattern.matcher("Sushil");
//            if (matcher.matches()) {
//                return true;
//            }
//
//            return false;
            boolean result = name.stream()
                                .anyMatch(n -> matcher.matches());
            System.out.println(result);
        };
        boolean fNameCheckResult = registrationInterface.fName("Sushil");
        System.out.println(fNameCheckResult);
    }

    */
    UserRegistration registrationObj = new UserRegistration();
    @Test
    public void given_Name_When_validate_Should_Return_True(){
        boolean result = registrationObj.firstNameMatchFun("Sushil"); // Positive Test Case For First Name Validation
        Assert.assertTrue(result);
    }
    @Test
    public void given_Name_When_validate_Should_Return_False(){
        boolean result = registrationObj.firstNameMatchFun("sushil"); // Negative Test Case For First Name Validation
        Assert.assertEquals(false, result);
    }
    @Test
    public void given_Last_Name_When_validate_Should_Return_True(){
        boolean result = registrationObj.lastNameMatchFun("Gupta"); // Positive Test Case For Last Name Validation
        Assert.assertTrue(result);
    }
    @Test
    public void given_Last_Name_When_validate_Should_Return_False(){
        boolean result = registrationObj.lastNameMatchFun("kumar"); // Negative Test Case For Last Name Validation
        Assert.assertEquals(false, result);
    }
    @Test
    public void given_Email_When_validate_Should_Return_True(){
        boolean result = registrationObj.emailMatchFun("sushil.gupta049@gmail.com"); // Positive Test Case For Email Validation
        Assert.assertTrue(result);
    }
    @Test
    public void given_Email_When_validate_Should_Return_False(){
        boolean result = registrationObj.emailMatchFun("Sushil.Gupta049@gmail.com"); // Negative Test Case For Email Validation
        Assert.assertEquals(false, result);
    }
    @Test
    public void give_Mobile_Number_When_Validate_Should_Return_True(){          // Positive Test Case For validating Mobile Number
        boolean result = registrationObj.mobileValidateFun("91 6205803215"); // right mobile format
        Assert.assertTrue(result);
    }
    @Test
    public void give_Mobile_Number_When_Validate_Should_Return_False(){ // Negative Test case for Validate Mobile Number
        boolean result = registrationObj.mobileValidateFun("91-6205803215"); // wrong mobile format
        Assert.assertEquals(false, result);
    }
    @Test // +ve Test Case (Rule 1 : minimum 8 character)
    public void give_Password_Minimum_Eight_Character_When_Validate_Should_Return_True(){
        boolean result = registrationObj.minimumEightCharFun("sushilgu");
        Assert.assertTrue(result);
    }
    @Test // -ve Test Case (Rule 1 : minimum 8 character)
    public void give_Password_Minimum_Eight_Character_When_Validate_Should_Return_False(){
        boolean result = registrationObj.minimumEightCharFun("sushil");
        Assert.assertEquals(false, result);
    }
    @Test //Positive Test Case For UC6 (Rule 2)
    public void give_Password_Minimum_Eight_AndOneUpperCaseShould_Character_When_Validate_Should_Return_True(){
        boolean result = registrationObj.minimumEightCharHavingAtleasteUpperCaseFun("sushiGul");
        Assert.assertTrue(result);
    }
    @Test //Negative Test Case For UC6 (Rule 2)
    public void give_Password_Minimum_Eight_AndOneUpperCaseShould_Character_When_Validate_Should_Return_False(){
        boolean result = registrationObj.minimumEightCharHavingAtleasteUpperCaseFun("sushilgu"); // (when we pass -> sUshilgu it gives expected false and actual true)
        Assert.assertEquals(false, result);
    }
    @Test
    public void give_Pass_Min8_OneUpperCaseOne_Number_When_Validate_Should_Return_True(){
        boolean result = registrationObj.minEightCharHavingAtleasteOneUpperCaseAndOneNumberFun("Sushi0iG");
        Assert.assertTrue(result);
    }
    @Test
    public void give_Pass_Min8_OneUppCaseOne_Num_One_SpclChar_When_Validate_Should_Return_True(){
        boolean result = registrationObj.minEightCharHavingAtleasteOneUppCaseOneNumOneSpecialCharFun("SuSh#9Uy");
        Assert.assertTrue(result);
    }
}
