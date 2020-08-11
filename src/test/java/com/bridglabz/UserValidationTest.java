package com.bridglabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validateFirstName("Himanshu");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validateFirstName("Hi");
        Assert.assertEquals(false,result);

    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validateLastName("Gharat");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validateFirstName("Gh");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validateEmailId("himanshugharat3@gmail.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validateEmailId("himanshugharat3@gmail");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validatePhoneNumber("91 8879112333");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validatePhoneNumber("918879112333");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validatePassword("password1");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse() {
        UserValidation userValidation=new UserValidation();
        boolean result=userValidation.validatePassword("pass");
        Assert.assertEquals(false,result);
    }
}
