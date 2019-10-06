package com.matheus.treinamentocwi.pageObjects;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@Data
public class HomePage extends BasePage {
    // public String max = faker.name().fullName();

    public String TITLESThirts = "T-SHIRTS";

    public WebElement titleCategoryMenu() {
        return driver.findElement(By.linkText(this.getTITLESThirts()));

    }

    public void clickTitleCategoryMenu() {
        titleCategoryMenu().click();
    }








}
