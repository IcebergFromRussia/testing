package com.untitled.tests;

import org.openqa.selenium.*;

public class HelperBase {

    protected AppManager appManager;
    protected boolean acceptNextAlert = true;

    public HelperBase(AppManager appManager){
        this.appManager = appManager;
    }


    protected boolean isElementPresent(By by) {
        try {
            appManager.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected boolean isAlertPresent() {
        try {
            appManager.driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected String closeAlertAndGetItsText() {
        try {
            Alert alert = appManager.driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
