package com.matheus.treinamentocwi.tests;

import com.matheus.treinamentocwi.utils.Browser;
import com.matheus.treinamentocwi.utils.Utils;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void setup() {
        Browser.loadPage(Utils.baseUrl());

    }

    @After
    public void tearDown(){
        Browser.close();

    }
}
