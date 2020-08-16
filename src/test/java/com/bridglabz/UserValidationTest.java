package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("Himanshu");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("Hi");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenContainsNumber_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        boolean result = userValidation.validateFirstName("hello1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenContainsSpaces_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        boolean result = userValidation.validateFirstName("hello 1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenContainsSymbol_shouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        boolean result = userValidation.validateFirstName("hello$");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("Gharat");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("Gh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenContainsSymbols_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("hello@");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenContainsNumber_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("Gharat1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenConatinsSpace_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateFirstName("Gharat 1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateEmailId("himanshugharat3@gmail.com");
        Assert.assertTrue (result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validateEmailId("himanshugharat3@gmail");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePhoneNumber("91 8879112333");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePhoneNumber("918879112333");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPhoneNumber_WhenNotProperCode_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePhoneNumber("911 8879112333");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPhoneNumber_WhenNumbersLessThanTen_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePhoneNumber("911 88791123");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassword("Pass@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassword("pass");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasNoUppercase_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassword("password");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasNoSymbol_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassword("Password");
        Assert.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasNoNumbers_ShouldReturnFalse() {
        UserValidation userValidation = new UserValidation();
        boolean result = userValidation.validatePassword("Password");
        Assert.assertFalse(result);
    }
}
