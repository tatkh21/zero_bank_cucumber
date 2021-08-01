package com.zerobank.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummary extends AccountSummaryBasePage{

    @FindBy (xpath = "//h2")
    public List<WebElement> accounts;

    @FindBy (xpath = "(//table)[3]/thead/tr/th")
    public List <WebElement> creditAccountsHeader;

//TODO finish method
    public void getAccounts(List<String> expectedAccountNames)  {
        for (WebElement eachAccount : accounts) {
            String actualAccounts = eachAccount.getText();
           Assert.assertTrue(expectedAccountNames.equals(actualAccounts));


        }
    }
}
