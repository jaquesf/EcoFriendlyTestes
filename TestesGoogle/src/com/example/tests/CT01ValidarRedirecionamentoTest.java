package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class CT01ValidarRedirecionamentoTest {
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

//Validar o redirecionamento para a seção "New"
	  
  @Test
  public void cT01ValidarRedirecionamento() {
    driver.get(baseUrl);
    driver.findElement(By.linkText("New")).click();
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