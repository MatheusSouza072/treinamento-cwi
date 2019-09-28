package com.matheus.treinamentocwi.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getCurrentWebDriver() {
        if (driver == null) {
            try {
                ChromeOptions capability = new ChromeOptions();
                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
                wait = new WebDriverWait(driver, 30);
                maximizeBrowser();
                setPageLoadTimeout();
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
            }
        }
        return driver;
    }

    private static void setPageLoadTimeout() {
        driver.manage()
                .timeouts()
                .pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    private static void maximizeBrowser() {
        driver.manage()
                .window()
                .maximize();


    }

}

