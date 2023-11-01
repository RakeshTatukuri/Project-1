package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automationpageloading {
	
	public static void main(String args []) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();

		driver.get("https://staragile.melimu.com/login/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		//driver.get("https://www.youtube.com/");
		Thread.sleep(2500);
		//driver.get("https://www.facebook.com/");
		Thread.sleep(2500);
		//driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2500);
		//driver.get("https://www.isro.gov.in/");
		Thread.sleep(5000);
		driver.close();
		
	}

}