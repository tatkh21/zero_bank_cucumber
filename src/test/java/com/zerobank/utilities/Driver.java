package com.zerobank.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver() {

    }
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public static WebDriver getDriver () {
        String browserType = ConfigurationReader.getProperty("browser");
        if (driverPool.get() == null) {
            synchronized (Driver.class) {
                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                        break;
                    case "chromeSSL":
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions capability = new ChromeOptions();
                        capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
                        driverPool.set(new ChromeDriver(capability));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                }
            }
        }
        return  driverPool.get();
    }
    public static void close() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
