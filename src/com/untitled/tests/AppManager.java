package com.untitled.tests;

import com.untitled.tests.helper.LoginHelper;
import com.untitled.tests.helper.OpenPageHelper;
import com.untitled.tests.helper.TaskHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class AppManager {

    public WebDriver driver;

    protected OpenPageHelper openPageHelper = new OpenPageHelper(this);
    protected LoginHelper loginHelper = new LoginHelper(this);
    protected TaskHelper taskHelper = new TaskHelper(this);

    protected String baseUrl;

    protected StringBuffer verificationErrors = new StringBuffer();

    public AppManager(){
    }


    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}
