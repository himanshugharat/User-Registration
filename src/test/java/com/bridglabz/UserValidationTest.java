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
}
