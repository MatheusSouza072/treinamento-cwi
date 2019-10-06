package com.matheus.treinamentocwi.pageObjects;

import com.matheus.treinamentocwi.utils.Browser;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Data
public class CategoryPage extends BasePage {

    @FindBy(className = "cat-name")
    public WebElement catName;

    @FindBy(css = "#center_column > ul > li > div > div.right-block > h5 > a")
    public WebElement firstProduct;



    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentWebDriver(),this);
    }

    public String textCatName() {
        return catName.getText().trim();
    }
    public String FirstProductTShirts = "Faded Short Sleeve T-shirts";


    public WebElement firstProduct() {
        return driver.findElement(By.linkText(this.getFirstProductTShirts()));

    }

    public void clickFirstProductCategory() {
        firstProduct().click();
    }


}
