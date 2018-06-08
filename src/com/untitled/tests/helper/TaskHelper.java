package com.untitled.tests.helper;

import com.untitled.tests.AppManager;
import com.untitled.tests.HelperBase;
import com.untitled.tests.entities.TaskData;
import org.openqa.selenium.By;

public class TaskHelper extends HelperBase {

    public TaskHelper( AppManager appManager ) {
        super( appManager );
    }

    public void addTask(TaskData taskData){
        appManager.driver.findElement(By.xpath("//input[@value='Log in']")).click();
        appManager.driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
        appManager.driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
        appManager.driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(taskData.getTaskName());
        appManager.driver.findElement(By.xpath("//div[@id='2018-06-06']/div/div/div[2]/div/button")).click();
        appManager.driver.findElement(By.xpath("//div[@id='wrapper-all']/div/div/div/div/div/ul/li/a[2]/b")).click();
    }
}
