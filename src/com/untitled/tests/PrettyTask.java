package com.untitled.tests;

import com.untitled.tests.entities.AccountData;
import com.untitled.tests.entities.TaskData;
import org.junit.Test;

public class PrettyTask extends TestBase{

    protected AccountData accountData;
    protected TaskData taskData;
    protected String pageUrl;

    public PrettyTask(){
        String mail = "alb-ert@mail.ru";
        String password = "0206080Albert27";
        String taskName = "newTask";
        accountData = new AccountData(mail, password);
        taskData = new TaskData(taskName);
        pageUrl = "https://prettytasks.com/en/login";
    }

    @Test
    public void testPrettyTask() throws Exception {
        //переходим на сайт
        appManager.openPageHelper.goToSite(pageUrl);
        //логинимся
        appManager.loginHelper.login(accountData);
        //добавляем таск
        appManager.taskHelper.addTask(taskData);
        //logout
        appManager.loginHelper.logOut();
    }


}
