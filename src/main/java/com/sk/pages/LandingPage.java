package com.sk.pages;

import com.sk.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    private WebDriver driver;
    private ElementUtil eleUtil;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        eleUtil = new ElementUtil(this.driver);
    }

    private By SignIn = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");

    private By searchBox = By.id("twotabsearchtextbox");
    private By searchBoxClick = By.id("nav-search-submit-button");

    public LoginPage doSignIn() {
        eleUtil.doClick(SignIn);
        return new LoginPage(driver);
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public SearchPageResult doSearch(String value) {
        eleUtil.doSendKeys(searchBox, value);
        eleUtil.doClick(searchBoxClick);
        return new SearchPageResult(driver);
    }
}
