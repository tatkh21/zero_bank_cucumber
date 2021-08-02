package com.zerobank.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummary extends AccountSummaryBasePage{

    @FindBy (xpath = "//h2")
    public List<WebElement> accounts;

    @FindBy (xpath = "(//table)[3]/thead/tr/th")
    public List <WebElement> creditAccountsColumns;

    public void assertNames(String name, List<String> expectedNames) {
        switch (name) {
            case "accounts":
                List<WebElement> actualAccountLinks = accounts;
                for (int i = 0; i < actualAccountLinks.size(); i++) {
                    String actualAccountName = actualAccountLinks.get(i).getText();
                    String expectedAccountName = expectedNames.get(i);
                    Assert.assertTrue(expectedAccountName.equals(actualAccountName));
                }
                    break;
                    case "columns":
                        List<WebElement> actualColumns = creditAccountsColumns;
                        for (int i = 0; i < actualColumns.size(); i++) {
                            String actualColumnsNames = actualColumns.get(i).getText();
                            String expectedColumnName = expectedNames.get(i);
                            Assert.assertTrue(expectedColumnName.equals(actualColumnsNames));
                        }
                        break;


        }
    }

}
