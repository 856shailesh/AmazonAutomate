package com.sk.pageTest;

import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest{
    @Test
    public void LandingPageTest() throws InterruptedException {
        landingPage.doSignIn();
    }
}
