package com.zerobank.step_definitions;

import com.zerobank.utilities.Pages;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummary_StepDefinition {
    Pages pages = new Pages();

    @Given("user can see following accounts types")
    public void user_can_see_following_accounts_types(List<String> expectedAccountNames) {
       List<WebElement> actualAccountLinks = pages.accountSummary().accounts;
        for (int i = 0; i < actualAccountLinks.size(); i++) {
            String actualAccountName = actualAccountLinks.get(i).getText();
            String expectedAccountName = expectedAccountNames.get(i);
            Assert.assertTrue(expectedAccountName.equals(actualAccountName));
        }


    }

}
