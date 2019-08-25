package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "E:\\Karthivelu\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		
		WebElement u=driver.findElement(By.xpath("//input[@class='login_input']"));
		
		u.sendKeys("8148791286");
		
		WebElement p=driver.findElement(By.xpath("//input[@class='login_input']"));
		
		p.sendKeys("123456");
		

		
		
	}

}
