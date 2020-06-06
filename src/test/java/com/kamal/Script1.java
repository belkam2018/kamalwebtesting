package com.kamal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Script1 {

    WebDriver driver = null;
    @BeforeMethod
            public void beforTest(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/wsgak/Documents/selenuim dependencies/drivers/chromedriver");
        driver = new ChromeDriver();
    }

//        System.setProperty("webdriver.gecko.driver","
//        /Users/wsgak/Downloads/selenuim dependencies/drivers/geckodriver" );
//        WebDriver driver = new FirefoxDriver();

    @Test
            public void webkamal() {
        driver.get("https://belkam2018.github.io/kamalweb/");
        driver.findElement(By.xpath("//a[contains(text(),'Apply here')]")).click();

    }
    @AfterTest
    public void tearDownTest(){

        driver.close();
        driver.quit();
        System.out.println("Test Completed Successfully");
    }


}
