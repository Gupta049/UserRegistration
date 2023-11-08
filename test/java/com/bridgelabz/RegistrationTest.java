package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
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
        boolean result = registrationObj.mobileValidateFun("916205803215"); // wrong mobile format
        Assert.assertEquals(false, result);
    }
    @Test
    public void give_Password_Minimum_Eight_Character_When_Validate_Should_Return_True(){
        boolean result = registrationObj.minimumEightCharFun("sushilgu");
        Assert.assertTrue(result);
    }
    @Test
    public void give_Password_Minimum_Eight_Character_When_Validate_Should_Return_False(){
        boolean result = registrationObj.minimumEightCharFun("sushil");
        Assert.assertEquals(false, result);
    }
}
