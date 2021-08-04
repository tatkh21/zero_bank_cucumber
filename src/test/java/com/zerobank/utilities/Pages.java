package com.zerobank.utilities;

import com.zerobank.pages.*;

public class Pages {
    private LoginPage loginPage;
    private OnlineBankingPage onlineBankingPage;
    private AccountSummary accountSummary;
    private PayBills payBills;
    private AccountActivity accountActivity;

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
    public PayBills payBills() {
        if(payBills == null) {
            payBills = new PayBills();
        } return payBills;
    }
    public AccountActivity accountActivity() {
        if(accountActivity == null) {
            accountActivity = new AccountActivity();
        } return accountActivity;
    }
}
