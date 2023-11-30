package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {

    private String email;
    private boolean isEmail;

    UserRegistration registrationObj;

    public EmailTest(String email, boolean isEmail) {
        this.email = email;
        this.isEmail = isEmail;
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] {
                {"abc", false},
                {"abc@.com.my", false},
                {"abc@abc@gmail.com", false},
                {"abc()*@gmail.com", false},
                {"abc123@gmail.com", true},
                {"abc..2002@gmail.com", true},
                {"abc@gmail.org.in", false},
                {"abc@gmail.com.aa.au", false}
        } );
    }

    @Before
    public void initialize(){
        registrationObj = new UserRegistration();
    }

    @Test
    public void givenMultipleEmailWhenValidateReturnTrue(){
        boolean result = registrationObj.multipleEmailMatchFun(email, isEmail);
        Assert.assertEquals(isEmail, result);
    }
}
