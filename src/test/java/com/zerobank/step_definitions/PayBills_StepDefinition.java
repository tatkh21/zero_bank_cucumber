package com.zerobank.step_definitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PayBills_StepDefinition {
    Pages pages = new Pages();
    @Given("user enters {string} amount and date")
    public void user_enters_amount_and_date(String amount) {
        pages.payBills().amount.sendKeys(amount);
        WebElement dateField = pages.payBills().date;
        dateField.sendKeys(BrowserUtils.dateGenerator());
        pages.payBills().payButton.click();
    }
    @Then("{string} messsage appear")
    public void messsage_appear(String expectedMessage) {
        String actualMessage = "";
        switch (expectedMessage) {
            case "The payment was successfully submitted." :
                actualMessage = pages.payBills().paymentSuccessfull.getText();
                break;
            case "Please fill out this field.":
                WebElement actualTag = pages.payBills().amount;
                String alertMessage = actualTag.getAttribute("validationMessage");
        }  Assert.assertTrue(expectedMessage.equals(actualMessage));

    }



}
