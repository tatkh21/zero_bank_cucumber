package com.zerobank.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String dateGenerator() {
        Faker faker = new Faker();
        String dob = faker.number().numberBetween(1,12) + "-" + faker.number().numberBetween(1,30)
                + "-" + faker.number().numberBetween(2021,2021);
        return dob;
    }
    public static void selectDefaultValue() {

    }
}
