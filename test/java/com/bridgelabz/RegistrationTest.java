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
}
