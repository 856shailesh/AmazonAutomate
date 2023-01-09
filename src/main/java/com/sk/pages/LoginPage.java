package com.sk.pages;

import com.sk.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private ElementUtil eleUtil;
    private By email = By.name("email");
    private By cont = By.id("continue");
    private By pass = By.id("ap_password");
    private By signInBtn = By.id("signInSubmit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        eleUtil = new ElementUtil(this.driver);
    }

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void doLogin(String uName,String pwd){
        eleUtil.doSendKeys(email,uName);
        eleUtil.doClick(cont);
        eleUtil.doSendKeys(pass,pwd);
        eleUtil.doClick(signInBtn);
    }
}
