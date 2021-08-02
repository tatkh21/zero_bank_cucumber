package com.zerobank.utilities;

import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void selectDefaultValue() {

    }
}
