package com.sk.pages;

import com.sk.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver driver;
    private ElementUtil eleUtil;

    public LandingPage(WebDriver driver){

        this.driver = driver;
        eleUtil = new ElementUtil(this.driver);
    }

    private By SignIn = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");

    public LoginPage doSignIn()  {
        eleUtil.doClick(SignIn);
        return new LoginPage(driver);
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }
}
