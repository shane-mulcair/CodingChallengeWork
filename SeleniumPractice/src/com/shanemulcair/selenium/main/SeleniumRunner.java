package com.shanemulcair.selenium.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumRunner {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://arstechnica.com/");
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		List<WebElement> elements=driver.findElements(By.className("article"));
		System.out.println("Size of list: "+elements.size());
		for(WebElement e:elements){
			System.out.println(e.getText());
		}
		driver.get("http://www.bbc.com/");
		WebElement e=driver.findElement(By.name("q"));
		e.click();
		e.sendKeys("cat");
		e.sendKeys("\r");
		System.out.println("Page title is: "+driver.getTitle());
		//driver.quit();

	}

}
