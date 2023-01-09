package com.sk.pageTest;

import com.sk.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseTest{

    @Test
    public void landingPageUrlTest() {
        Assert.assertEquals(landingPage.getLoginPageTitle(), Constants.LANDING_PAGE_TITLE);
    }
    @Test
    public void LandingPageTest() throws InterruptedException {
        landingPage.doSignIn();
    }
}
