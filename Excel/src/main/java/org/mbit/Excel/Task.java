package org.mbit.Excel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task extends Exelread {
	
	@Test

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Karthivelu\\Excel\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement reg=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		reg.sendKeys(getData(1, 1));
		
		WebElement reg1=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		reg1.sendKeys(getData(1, 2));
		
		WebElement reg2=driver.findElement(By.xpath("//textarea[@rows='3']"));
		
		reg2.sendKeys(getData(2, 1));
		
		WebElement reg3=driver.findElement(By.xpath("//input[@type='email']"));
		
		reg3.sendKeys(getData(3, 1));
		
	WebElement reg4=driver.findElement(By.xpath("//input[@type='tel']"));
		
		reg4.sendKeys(getData(4, 1));
		
		
		WebElement genderbtn=driver.findElement(By.xpath("//input[@value='Male']"));
		
		genderbtn.click();
		
		WebElement hob=driver.findElement(By.id("checkbox1"));
		hob.click();
		
		
		
		
		
		WebElement drop=driver.findElement(By.id("Skills"));
		drop.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select skill=new Select(drop);
		skill.selectByValue("Adobe InDesign");
	
		
		

		WebElement drop1=driver.findElement(By.id("countries"));
		drop1.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select country=new Select(drop1);
		country.selectByValue("Afghanistan");
		
		
		
		
		//WebElement drop2=driver.findElement(By.xpath("//span[@role='combobox'])/.//a[text()='Bulgarian']"));
	
		//drop2.sendKeys("Hong Kong");
		//drop2.click();
		
		
		WebElement drop3=driver.findElement(By.id("yearbox"));
		drop3.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select date=new Select(drop3);
		date.selectByValue("1994");
		
		
		WebElement drop4=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		drop4.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select month=new Select(drop4);
		month.selectByValue("February");
		
		WebElement drop5=driver.findElement(By.xpath("//select[@placeholder='Day']"));
		drop5.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select day=new Select(drop5);
		day.selectByValue("4");
		
		
		WebElement reg5=driver.findElement(By.id("firstpassword"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reg5.sendKeys(getData(5, 1));
		
		WebElement reg6=driver.findElement(By.id("secondpassword"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reg6.sendKeys(getData(6, 1));
		
		

	}

}
