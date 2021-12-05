package com.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
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
    System.out.println("open google URL");
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    Thread.sleep(3000);

  }

  @AfterClass()
  public void afterClass() throws Exception {
    System.out.println("quit driver");
   driver.quit();
  }

}
