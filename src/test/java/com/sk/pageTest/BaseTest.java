package com.sk.pageTest;

import com.sk.factory.DriverFactory;
import com.sk.pages.LandingPage;
import com.sk.pages.LoginPage;
import com.sk.pages.SearchPageResult;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class BaseTest {
    WebDriver driver;
    DriverFactory driverFactory;
    Properties prop;
    LandingPage landingPage;
    LoginPage loginPage;
    SearchPageResult searchPageResult;

    @BeforeTest
    public void Setup(){
        driverFactory = new DriverFactory();
        prop = driverFactory.init_prop();
        driver = driverFactory.init_driver(prop);
        landingPage = new LandingPage(driver);
        //searchPageResult = new
    }

    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}
