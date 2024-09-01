package com.herocuapp.theinternet.base;

public class TestUtilities extends BaseTest{

    protected void sleep(long millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
