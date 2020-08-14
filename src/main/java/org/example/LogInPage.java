package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class LogInPage extends Util {//RegisterPage is sub class of Util class
    //Crate Object Of LoadProp
    LoadProp loadProp = new LoadProp();
    //Create a variable for store xpath value.
    private By _welcomOnloginPage = By.ByCssSelector.id("logInPanelHeading"); //By.id("logInPanelHeading");
    //Create a variable for store getProperty values.
    String expectWelcomeOnLoginPage = loadProp.getProperty("WelcomeLoginMsg");
    //Create a variable for store by id value.
    private By enterUserName = By.ByCssSelector.id("txtUsername"); // By.id("txtUsername");
    //Create a variable for store by id value.
    private By enterPassword = By.ByCssSelector.id("txtPassword"); // By.id("txtPassword");
    //Create a variable for store xpath value.
    private By buttonLogin = By.ByCssSelector.id("btnLogin"); //By.id("btnLogin");

    public void verifyUserIsOnLoginPage() {
        //assert equals for expect results and actual results
        Assert.assertEquals(getTextFromElement(_welcomOnloginPage), expectWelcomeOnLoginPage, "User Is not Login page");
    }

    public void userEntersLoginDetails() {
        //type text from load property value
        typeText(enterUserName, loadProp.getProperty("USERNAME"));
        //type text from load property value
        typeText(enterPassword, loadProp.getProperty("PASSWORD"));
    }

    public void clickOnLoginButton() {
        //wait for 60 second for clickable
        waitUntilElementClickable(buttonLogin, 60);
        //Click the variable
        clickOnElement(buttonLogin);
    }

    public void userEnterUserNameAndPassword(String username, String password) {
        //type text from feature file
        typeText(By.ByCssSelector.id("txtUsername"), username);
        //type text from feature file
        typeText(By.ByCssSelector.id("txtPassword"), password);
    }

    public void userLoginNotSuccess(String errorMessage) {
        //assert equals for expect results and actual results
        Assert.assertEquals(getTextFromElement(By.id("spanMessage")), errorMessage, "User Not Login With Invalid Attempt !!!");
        //sout print get text value
        System.out.println(getTextFromElement(By.ByCssSelector.id("spanMessage")));

    }
}
