package com.ey.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromeBrowser {

	
	@Test
	public void LaunchBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         System.out.println(driver.getTitle());
	}
	
	@Test
	public void verifyhomepage() {
		System.out.println("Home page verified");
	}

}
