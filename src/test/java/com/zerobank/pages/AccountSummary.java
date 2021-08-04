package com.zerobank.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountSummary extends AccountSummaryBasePage {

    @FindBy(xpath = "//h2")
    public List<WebElement> accounts;

    @FindBy(xpath = "(//table)[3]/thead/tr/th")
    public List<WebElement> creditAccountsColumns;

    @FindBy (id = "aa_accountId")
    public WebElement dropdown;

    @FindBy (xpath = "//option")
    public List<WebElement> dropdownOptions;

    @FindBy (xpath = "//table/thead/tr/th")
    public List<WebElement> transactionTable;

    @FindBy (xpath = "(//table)[2]/tbody/tr/td/a")
    public WebElement brokerageLink;

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
            case "dropdown":
                List<WebElement> actualDropdownOptions = dropdownOptions;
                for (int i = 0; i < actualDropdownOptions.size(); i++) {
                    String actualDropdownNames = actualDropdownOptions.get(i).getText();
                    String expectedDropdownName = expectedNames.get(i);
                    Assert.assertTrue(expectedDropdownName.equals(actualDropdownNames));
                }
                break;
            case "transaction table":
                List<WebElement> actualTableElements = transactionTable;
                for (int i = 0; i < actualTableElements.size(); i++) {
                    String actualTransactionNames = actualTableElements.get(i).getText();
                    String expectedTableNames = expectedNames.get(i);
                    Assert.assertTrue(expectedTableNames.equals(actualTransactionNames));
                }
                break;



        }
    }
//    public String selectDefault(Select select) {
//
//    }

}
