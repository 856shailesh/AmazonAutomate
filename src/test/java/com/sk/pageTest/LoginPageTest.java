package com.sk.pageTest;

import com.sk.pages.LandingPage;
import com.sk.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @BeforeClass
    public void LoginPageSetup() {
        loginPage = landingPage.doSignIn();
    }
    @Test
    public void loginPageUrlTest(){
        Assert.assertTrue();
    }

    @Test
    public void enterCredentials() throws InterruptedException {
        loginPage.doLogin(prop.getProperty("username").trim(),prop.getProperty("password").trim());
        Thread.sleep(3000);
    }
}
