package com.untitled.tests.helper;

import com.untitled.tests.AppManager;
import com.untitled.tests.HelperBase;
import com.untitled.tests.entities.AccountData;
import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {


    public LoginHelper(AppManager appManager) {
        super(appManager);
    }

    public void logOut(){
        appManager.driver.findElement(By.linkText("Logout")).click();
    }

    public void login(AccountData accountData){
        appManager.driver.findElement(By.id("AccountEmail")).click();
        appManager.driver.findElement(By.id("AccountEmail")).clear();
        appManager.driver.findElement(By.id("AccountEmail")).sendKeys(accountData.getMail());
        appManager.driver.findElement(By.id("AccountPassword")).click();
        appManager.driver.findElement(By.id("AccountPassword")).clear();
        appManager.driver.findElement(By.id("AccountPassword")).sendKeys(accountData.getPassword());
    }
}
