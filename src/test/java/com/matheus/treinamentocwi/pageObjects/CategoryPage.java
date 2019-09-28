package com.matheus.treinamentocwi.pageObjects;

import com.matheus.treinamentocwi.utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends BasePage {

    @FindBy(className = "cat-name")
    public WebElement catName;

    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentWebDriver(),this);
    }
}
