package com.example.tests;

import com.example.pages.HomePage;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignIn();
        loginPage.login("testuser@example.com", "password123");
        Assert.assertTrue(loginPage.isLoggedIn(), "Login was not successful");
    }
}
