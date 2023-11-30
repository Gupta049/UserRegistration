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

    @Test
    public void sampleEmailValidate_When_Validate_Should_Return_True(){
        /**
         * A. Valid Emails
         * • 1. abc@yahoo.com,
         * • 2. abc-100@yahoo.com,
         * • 3. abc.100@yahoo.com
         * • 2. abc111@abc.com,
         * • 4. abc-100@abc.net,
         * • 5. abc.100@abc.com.au
         * • 6. abc@1.com,
         * • 7. abc@gmail.com.com
         * • 8. abc+100@gmail.com
         *
         **** B. Invalid Emails (TLD - Top Level Domains)
         * 1. abc – must contains “@” symbol
         * 2. abc@.com.my – tld can not start with dot “.”
         * 3. abc123@gmail.a – “.a” is not a valid tld, last tld must contains at least two characters
         * 4. abc123@.com – tld can not start with dot “.”
         * 5. abc123@.com.com – tld can not start with dot “.”
         * 6. .abc@abc.com – email’s 1st character can not start with “.”
         * 7. abc()*@gmail.com – email’s is only allow character, digit, underscore and dash
         * 8. abc@%*.com – email’s tld is only allow character and digit
         * 9. abc..2002@gmail.com – double dots “.” are not allow
         * 10. abc.@gmail.com – email’s last character can not end with dot “.”
         * 11. abc@abc@gmail.com – double “@” is not allow
         * 12. abc@gmail.com.1a -email’s tld which has two characters can not contains digit
         * 13. abc@gmail.com.aa.au - cannont have multiple email’s tld
         */
        boolean result = registrationObj.sampleEmailValidateMethod("abc@yahoo.com");
        Assert.assertTrue(result);
    }
}
