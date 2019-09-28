package com.matheus.treinamentocwi.tests;

import com.matheus.treinamentocwi.pageObjects.BasePage;
import com.matheus.treinamentocwi.pageObjects.HomePage;
import org.junit.Test;

public class EcommerceFlow extends BaseTest {

    @Test
    public void testAcessCategoryTShirts() {
        HomePage homePage = new HomePage();

        homePage.clickTitleCategoryMenu();
    }

}
