package com.zerobank.utilities;

import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.OnlineBankingPage;

public class Pages {
    private LoginPage loginPage;
    private OnlineBankingPage onlineBankingPage;
    private AccountSummary accountSummary;

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        } return loginPage;
    }
    public OnlineBankingPage onlineBankingPage() {
        if (onlineBankingPage == null) {
          onlineBankingPage = new OnlineBankingPage();
        }
        return onlineBankingPage;
    }
    public AccountSummary accountSummary() {
        if (accountSummary == null) {
            accountSummary = new AccountSummary();
        }
        return accountSummary;
    }
}
