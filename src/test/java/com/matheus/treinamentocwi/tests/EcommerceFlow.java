package com.matheus.treinamentocwi.tests;

import com.matheus.treinamentocwi.pageObjects.CategoryPage;
import com.matheus.treinamentocwi.pageObjects.HomePage;
import static org.junit.Assert.*;

import com.matheus.treinamentocwi.pageObjects.LoginPage;
import com.matheus.treinamentocwi.pageObjects.ProductPage;
import org.junit.Test;

public class EcommerceFlow extends BaseTest {

    @Test
    public void testAcessCategoryTShirts() {
        HomePage homePage = new HomePage();
        CategoryPage categoryPage = new CategoryPage();
        ProductPage productPage = new ProductPage();
        LoginPage loginPage = new LoginPage();


        homePage.clickTitleCategoryMenu();

        assertEquals(categoryPage.textCatName(), "T-SHIRTS");

        String nameProdutcCategory = categoryPage.FirstProductTShirts;

        categoryPage.clickFirstProductCategory();

        assertEquals(productPage.textProductTShirts(), nameProdutcCategory);

        productPage.clickButtonAddProductToCart();

        productPage.clickButtonProceedToCheckout();

        productPage.clickButtonProceedToLogin();

        loginPage.fillLoginField();

        loginPage.fillPasswordField();

        loginPage.clickButtonSignIn();

        loginPage.clickButtonProceedToShipping();

        loginPage.clickCheckboxAcceptTerms();

        loginPage.clickButtonProceedToPayment();

        loginPage.clickButtonPayByCheck();







    }

}
