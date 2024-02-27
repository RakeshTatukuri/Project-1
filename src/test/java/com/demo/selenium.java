package com.demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class selenium {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
/*	
WebElement button=	driver.findElement(By.xpath(""));
//double click
Actions action=new Actions(null);
action.doubleClick(button).perform();
//right click
action.contextClick(button).perform();
//drag and drop
action.dragAndDrop(button, button).perform();
//mouseover
action.moveToElement(button).perform();
//resizable
action.moveToElement(button).dragAndDropBy(button, 10, 0).build().perform();
//slider
action.clickAndHold(button).moveToElement(button, 10, 0).build().perform();
//findelement returns single webelement
//findelements returns list of webslements

//windowhandle returns String
//windowhandles returns set of strings

for(int i=0;i<=10;i++)
{
	WebDriver newtab=driver.switchTo().newWindow(WindowType.TAB);
	newtab.get("url");
}

WebDriver newwindow=driver.switchTo().newWindow(WindowType.WINDOW);
newwindow.get("url");
 
 
 
 //tagname[@attribute='value']//ancestor::tagname of ancestor
 
 //following-forward
//preceding-previous
*/
driver.get("https://www.google.com");

}
public static void TakesScreenshot(WebDriver driver) {

TakesScreenshot fs= (TakesScreenshot)driver;
File temp=fs.getScreenshotAs(OutputType.FILE);
File des=new File(System.getProperty("user.dir")+"\\Screenshots\\google"+System.currentTimeMillis()+".png");
try {
	FileHandler.copy(temp, des);
	System.out.println("done");
} catch (IOException e) {
	e.toString();
}
}

}