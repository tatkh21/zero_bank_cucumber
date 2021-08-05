package com.zerobank.step_definitions;

import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Pages;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void teardown(){
        Driver.close();
    }
}
