package com.matheus.treinamentocwi.pageObjects;

import com.github.javafaker.Faker;
import com.matheus.treinamentocwi.utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Browser {
    Faker faker = new Faker();


    public static boolean waitElement(String type, String locator) {
        switch (type) {
            case "id":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
                return true;
            case "xpath":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
                return true;
            case "className":
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
                return true;
        }
        return false;
    }

}
