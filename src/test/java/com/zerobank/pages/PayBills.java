package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBills extends AccountSummaryBasePage{
    @FindBy (xpath = "//input[@type='submit']")
    public WebElement payButton;

    @FindBy (css = "#alert_content>span")
    public WebElement paymentSuccessfull;

    @FindBy (id = "sp_amount")
    public WebElement amount;

    @FindBy (id = "sp_date")
    public WebElement date;




}
