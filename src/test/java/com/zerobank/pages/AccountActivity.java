package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivity extends AccountSummaryBasePage{

    @FindBy (id = "aa_accountId")
    public WebElement aaDropdown;
}
