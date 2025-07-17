package com.example.tests;

import com.example.pages.HomePage;
import org.testng.annotations.Test;

public class ProductSearchTest extends BaseTest {

    @Test
    public void testProductSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Dress");
        // Add assertions or further steps as needed
    }
}
