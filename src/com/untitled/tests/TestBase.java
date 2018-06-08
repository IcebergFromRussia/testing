package com.untitled.tests;

import org.junit.After;
import org.junit.Before;

public class TestBase {

    protected AppManager appManager;

    public TestBase(){
        appManager = new AppManager();
    }

    @Before
    public void setUp() throws Exception {
        appManager.setUp();
    }

    @After
    public void tearDown() throws Exception {
        appManager.tearDown();
    }

}
