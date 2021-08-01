package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AccountSummaryBasePage {
    AccountSummaryBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
public void navigateLinks(String str) {
    WebElement link = Driver.getDriver().findElement(By.xpath("//a[.='" + str + "']"));
    link.click();

}

}
