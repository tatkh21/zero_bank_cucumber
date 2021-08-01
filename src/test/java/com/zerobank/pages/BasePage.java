package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "account_activity_link")
    public WebElement checkingAccountActivityLink;

    @FindBy (xpath = "//i[@class='icon icon-bookmark']")
    public WebElement moreServicesButton;

    @FindBy(id = "transfer_funds_link")
    public WebElement transferFunds;

    @FindBy(id = "money_map_link")
    public WebElement myMoneyMap;

    @FindBy(xpath = "//strong[.='Home']")
    public WebElement home;

    @FindBy(xpath = "//strong[.='Online Banking' ]")
    public WebElement onlineBanking;

    @FindBy (id = "signin_button")
    public WebElement signinButton;



    //TODO finish switch and locators
    public void navigateMainPage (String str) {
        switch (str) {
            case "More Services":
                moreServicesButton.click();
                break;
            case "Checking Account Activity":
                checkingAccountActivityLink.click();
                break;
            case "My Money Map":
                myMoneyMap.click();
                break;
            case "Transfer Funds":
                transferFunds.click();
                break;
            case "Home":
                home.click();


        }
    }
}
