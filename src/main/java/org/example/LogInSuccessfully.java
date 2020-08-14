package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class LogInSuccessfully extends Util {//RegisterSuccessPage is sub class of Util class

    LoadProp loadProp = new LoadProp();
    //Create a variable for store xpath value.
    private By _loginSuccessMassage = By.ByCssSelector.id("welcome"); //By.id("welcome");
    //Create a variable for store string value.
    String expectLoginSuccessMassage = loadProp.getProperty("LoginSuccessMsg");

    public void verifyUserLoginSuccessfully() {
        //assert equals for expect and actual result
        Assert.assertEquals(getTextFromElement(_loginSuccessMassage), expectLoginSuccessMassage, "Your Login Not Successfully");
        System.out.println(getTextFromElement(_loginSuccessMassage));
    }
}
