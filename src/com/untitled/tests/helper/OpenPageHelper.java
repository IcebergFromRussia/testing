package com.untitled.tests.helper;

import com.untitled.tests.AppManager;
import com.untitled.tests.HelperBase;

public class OpenPageHelper extends HelperBase {

    public OpenPageHelper(AppManager appManager) {
        super(appManager);
    }

    public void goToSite(String url){
        appManager.driver.get(url);
    }
}
