package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CT02ValidarOrdenacaoTest {
  private WebDriver driver;
  private String baseUrl;
  private final String pathChromeDriver = "C:\\Users\\PC\\Desktop\\EcoFriendly\\chromedriver.exe";
  
  
  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", pathChromeDriver);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    baseUrl = "https://shop.googlemerchandisestore.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  //Validar a ordenação de A para Z
  @Test
  public void cT02ValidarOrdenacao() {
    driver.get(baseUrl);
    driver.findElement(By.linkText("New")).click();
    driver.findElement(By.id("sortby")).click();
    {
      WebElement dropdown = driver.findElement(By.id("sortby"));
      dropdown.findElement(By.xpath("//option[. = 'Title A --> Z']")).click();
    }
    sleep(7000);
    driver.quit();
  }
  
  private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
}
}
