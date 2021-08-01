package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBankingPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {
    Pages pages = new Pages();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        pages.onlineBankingPage().signinButton.click();
    }

    @When("user enters credentials and logs in")
    public void user_enters_credentials_and_logs_in() {
        pages.loginPage().validLogin();

    }
    @And("user clicks to advanced connection button")
    public void userClicksToAdvancedConnectionButton() {
        pages.loginPage().resolveUnsecureConnections();
    }


    @Then("user is on the {string} page")
    public void userIsOnThePage(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("user login with {string} username and {string} password {string} appear")
    public void userLoginWithUsernameAndPasswordAppear(String userName, String password, String expectedMessage) {
        pages.loginPage().invalidOrEmptyLogin(userName,password);
        String actualMessage = pages.loginPage().errorMessage.getText();
        Assert.assertTrue(expectedMessage.equals(actualMessage));
    }
}
