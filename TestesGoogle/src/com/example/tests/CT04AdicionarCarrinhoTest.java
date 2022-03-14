package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CT04AdicionarCarrinhoTest {
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
	  
//Validar adição do produto ao carrinho
  @Test
  public void cT04AdicionarCarrinho() {
    driver.get(baseUrl);
    driver.findElement(By.linkText("New")).click();
    driver.findElement(By.id("sortby")).click();
    {
      WebElement dropdown = driver.findElement(By.id("sortby"));
      dropdown.findElement(By.xpath("//option[. = 'Title A --> Z']")).click();
    }
    driver.findElement(By.id("parent-title-9204093")).click();
    sleep(3000);
    driver.findElement(By.cssSelector("#js-item-addtocartbtn-9204093 > span")).click();
    sleep(3000);
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

