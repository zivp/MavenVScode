package com.example;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testNg {
  
  WebDriver driver ;


  @BeforeClass()
  public void beforeClass() throws Exception {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    System.out.println("init driver");
  }

  @Test(priority = 1)
  public void firstTest() throws Exception {

    try{
    System.out.println("open google URL");
    driver.get("https://doxi-sign.com/#/consist");
    driver.manage().window().maximize();
    Thread.sleep(3000);

    //check if the of the realm is "consist"
   String text =  driver.findElement(By.xpath("//*[@id='kc-header-wrapper']")).getText();
   Assert.assertEquals("consist",text.toLowerCase());
   
   /*login to DOXI 
   1. insert name 
   2. insert password
   */
    }
    catch(Exception e)
    {System.out.println(">> Exception : "+e); }
    catch(AssertionError e)
    {  org.testng.Assert.fail(">> AssertionError : "+e); }
  }


  @AfterClass()
  public void afterClass() throws Exception {
    System.out.println("quit driver");
   driver.quit();
  }

}
