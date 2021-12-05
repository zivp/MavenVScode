package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoMavenVScode {
  

public static void main(String[] args) throws Exception {

WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();


driver.get("https://www.google.com");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.quit();
  }
}
