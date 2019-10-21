package com.test1.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopups {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		
		if(text.equals("Please enter a valid username")) 
		{System.out.println("Correct alert message");
			
		}
		else {
			System.out.println("in-correct alert message");
		}
		alert.accept();
		
//	Alert alert =driver.switchTo().alert();
//	Thread.sleep(3000);
//	alert.getText();
//	System.out.println("Alert Text:" +alert.getText());
//	alert.accept();
//	driver.switchTo().defaultContent();
//	System.out.println("Go button text:" +driver.findElement(By.name("proceed")).getAttribute("Value"));
	}

}
