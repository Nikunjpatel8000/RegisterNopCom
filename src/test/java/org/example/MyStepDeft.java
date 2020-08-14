package org.example;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepDeft extends Util {
//    //Crate Object Of LogInPage
//    LogInPage logInPage = new LogInPage();
//    //Crate Object Of LogInSuccessfully
//    LogInSuccessfully logInSuccessfully = new LogInSuccessfully();

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccess registerSuccess = new RegisterSuccess();

    //Login All Steps

//    @Given("^user is on login page$")
//    public void user_is_on_login_page() {
//        logInPage.verifyUserIsOnLoginPage();
//    }
//
//    @When("^user enter valid username and password$")
//    public void user_enter_valid_username_and_password() {
//        logInPage.userEntersLoginDetails();
//    }
//
//    @When("^user click on Login button$")
//    public void user_click_on_Login_button() {
//        logInPage.clickOnLoginButton();
//    }
//
//    @Then("^user should be login successfully$")
//    public void user_should_be_login_successfully() {
//        logInSuccessfully.verifyUserLoginSuccessfully();
//    }
//
//    @When("^user enter invalid and empty user name \"([^\"]*)\" and password \"([^\"]*)\"$")
//    public void user_enter_invalid_and_empty_user_name_and_password(String username, String password) {
//
//        logInPage.userEnterUserNameAndPassword(username, password);
//    }
//
//    @Then("^user should be login not successfully and user should see error message \"([^\"]*)\"$")
//    public void user_should_be_login_not_successfully_and_user_should_see_error_message(String errorMessage) {
//
//        logInPage.userLoginNotSuccess(errorMessage);
//    }

    //Registration All Steps

    @Given("^user is on Homepage$")
    public void user_is_on_Homepage() {
        homePage.verifyUserIsOnHomePage();
    }

    @When("^user click on Register button$")
    public void user_click_on_Register_button() {
        homePage.clickOnRegisterButton();
    }

    @When("^user enter all required details$")
    public void user_enter_all_required_details() {
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.userEntersRegistationDetails();
    }

    @When("^click on Register button$")
    public void click_on_Register_button() {
        registerPage.clickOnRegisterSubmitButton();
    }

    @Then("^user be able to see Your registration completed message$")
    public void user_be_able_to_see_Your_registration_completed_message() {
        registerSuccess.verifyUserRegistrationSuccessfully();

    }


}
