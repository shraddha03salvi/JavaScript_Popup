package com.test1.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBoxJs {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		driver.findElement(By.id("prompt")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert text:" +alert.getText());
		alert.sendKeys("Shraddha");
		Thread.sleep(3000);
		alert.accept();
		driver.switchTo().defaultContent();
	}

}
