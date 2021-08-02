package com.zerobank.step_definitions;

import com.zerobank.utilities.Pages;
import io.cucumber.java.en.Given;

import java.util.List;

public class AccountSummary_StepDefinition {
    Pages pages = new Pages();

    @Given("user can see following {string} types")
    public void user_can_see_following_types(String name, List<String> listOfNames ) {
        pages.accountSummary().assertNames(name, listOfNames);
    }






}


