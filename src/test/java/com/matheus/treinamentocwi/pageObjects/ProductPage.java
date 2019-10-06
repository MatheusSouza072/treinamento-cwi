package com.matheus.treinamentocwi.pageObjects;


import com.matheus.treinamentocwi.utils.Browser;
import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Data
public class ProductPage extends BasePage {


    @FindBy(css = "#center_column > div > div > div.pb-center-column.col-xs-12.col-sm-4 > h1")
    public WebElement productTShirts;

    @FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")
    public WebElement buttonProceedToCheckout;

    @FindBy(css = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span")
    public WebElement buttonProceedToLogin;


    public ProductPage() {
        PageFactory.initElements(Browser.getCurrentWebDriver(),this);
    }

    public String textProductTShirts() {
        return productTShirts.getText();
    }

    public String AddProductToCartText = "Add to cart";

    public WebElement addProductToCart() {
        return driver.findElement(By.cssSelector("#add_to_cart > button > span"));
    }
    public void clickButtonAddProductToCart() {
        addProductToCart().click();
    }

    public void clickButtonProceedToCheckout() {
        waitElement("cssSelector", "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");
        buttonProceedToCheckout.click();
    }

    public void clickButtonProceedToLogin() {
        waitElement("cssSelector", "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
        buttonProceedToLogin.click();
    }










}

