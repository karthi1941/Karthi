package org.mbit.Excel;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug25 extends Exelread {
	
	

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Karthivelu\\Excel\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement input = driver.findElement(By.id("inputValEnter"));
		
		input.sendKeys(getData(1, 1));
		
		WebElement srch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		
		srch.click();
		
		WebElement lenovo = driver.findElement(By.xpath("//img[@title='Vivo V15Pro ( 128GB , 8 GB ) Red']"));
		
		lenovo.click();
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window id is :"+parent);
		
		
		
		Set<String> child = driver.getWindowHandles();
		
		int count=child.size();
		
		System.out.println("Total Window is :"+count);
		
		int count1=0;
		
	for(String chid:child)
	{
		if(!chid.equalsIgnoreCase(parent))
		{
			driver.switchTo().window(chid);
		}
	}
	
	WebElement buy = driver.findElement(By.xpath("//div[@class='col-xs-6 btn btn-xl rippleWhite buyLink buyNow marR15  ']"));
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	buy.click();
	
	
WebElement email = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));


email.sendKeys(getData(3, 1));

	WebElement con = driver.findElement(By.id("login-continue"));
	
	con.click();
	
	WebElement pass = driver.findElement(By.xpath("//input[@id='w_password']"));
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	pass.sendKeys(getData(5, 1));
	
	
	WebElement click = driver.findElement(By.xpath("//button[text()='LOGIN']"));
	
	click.click();
	
WebElement click1 = driver.findElement(By.xpath("//div[@class='make-payment-button']"));

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	click1.click();
		
		{
			
		}
		
		
		

	}
	
}



