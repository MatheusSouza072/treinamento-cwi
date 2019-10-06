package com.matheus.treinamentocwi.pageObjects;

import com.matheus.treinamentocwi.utils.Browser;
import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Data
public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement fieldEmail;

    @FindBy(id = "passwd")
    public WebElement fieldPassword;

    @FindBy(id = "SubmitLogin")
    public WebElement buttonSignIn;

    @FindBy(id = "cgv")
    public WebElement checkboxAcceptTerms;

    @FindBy(css = "#center_column > form > p > button > span")
    public WebElement buttonProceedToShipping;

    @FindBy(css = "#form > p > button")
    public WebElement buttonProceedToPayment;

    @FindBy(css = "#HOOK_PAYMENT > div:nth-child(2) > div > p > a")
    public WebElement buttonPayByCheck;



    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentWebDriver(), this);
    }

    public void fillLoginField() {
        fieldEmail.sendKeys("matheusautomacao@gmail.com");
    }

    public void fillPasswordField() {
        fieldPassword.sendKeys("testeteste123");
    }

    public void clickButtonSignIn() {
        buttonSignIn.click();
    }

    public void clickButtonProceedToShipping() {
        buttonProceedToShipping.click();
    }

    public void clickButtonProceedToPayment() {
        buttonProceedToPayment.click();
    }

    public void clickCheckboxAcceptTerms() {
        checkboxAcceptTerms.click();
    }
    public void clickButtonPayByCheck() {
        buttonPayByCheck.click();
    }









}
