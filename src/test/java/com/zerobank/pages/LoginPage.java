package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @FindBy(css = "button[id='signin_button']")
    public WebElement signInButton;
    @FindBy(css = "input[id='user_login']")
    public WebElement loginInput;
    @FindBy(css = "input[id='user_password']")
    public WebElement passwordInput;
    @FindBy(name = "submit")
    public WebElement loginButton;
    @FindBy(css = "#primary-button")
    public WebElement backToSafetyButtonButton;
    @FindBy(css = "div[class='alert alert-error']")
    public WebElement wrongCredMessage;
    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;

    public void validLogin(){
        loginInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }
    public void invalidOrEmptyLogin(String userName , String password){
        loginInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    public void emptyLogin(){
        loginInput.sendKeys("");
        passwordInput.sendKeys("");
        loginButton.click();
    }

    @FindBy(xpath = "//button[@id='details-button']")
    private WebElement advanced;

    @FindBy(xpath = "//a[@id='proceed-link']")
    private WebElement proceedLink;

    public void resolveUnsecureConnections() {
        wait.until(ExpectedConditions.visibilityOf(advanced));
        advanced.click();
        wait.until(ExpectedConditions.visibilityOf(proceedLink));
        proceedLink.click();


    }
}