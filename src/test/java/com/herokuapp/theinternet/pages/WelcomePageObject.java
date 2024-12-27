package com.herokuapp.theinternet.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject{


    private String pageUrl = "http://the-internet.herokuapp.com/";
    private By formAuthenticationLink = By.linkText("Form Authentication");

    public WelcomePageObject(WebDriver driver, Logger log) {
        super(driver,log);
    }

    public void openPage(){
        log.info("Opening page : " + pageUrl);
        openUrl(pageUrl);
        log.info("Page is opened");
    }

    // Open LoginPage by clicking on Form Authentication link
    public LoginPage clickFormAuthenticationLink(){
        log.info("Clicking Form Authentication link on Welcome Page");
        click(formAuthenticationLink);
        return new LoginPage(driver,log);
    }



}
