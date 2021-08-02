package com.zerobank.step_definitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountSummaryAndActivity_StepDefinition {
    Pages pages = new Pages();
    Select select;

    @Given("user clicks on {string}")
    public void userClicksOn(String name) {
        pages.accountSummary().navigateLinks(name);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(name));
    }

    @Then("dropdown default value is {string}")
    public void dropdownDefaultValueIs(String expectedValue) {
        select = new Select(pages.accountSummary().dropdown);
        String firstSelectedOption = select.getFirstSelectedOption().getText();
        Assert.assertTrue(expectedValue.equals(firstSelectedOption));

    }
    @Given("user can see following {string} types")
    public void user_can_see_following_types(String name, List<String> listOfNames ) {
        pages.accountSummary().assertNames(name, listOfNames);

    }

}


