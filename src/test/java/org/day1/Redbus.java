package org.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
//		driver.get("https://www.redbus.in/");
//		
//		WebElement txtSrc = driver.findElement(By.id("src"));
//		txtSrc.sendKeys("Tambaram");
//		
//		WebElement txtDest = driver.findElement(By.id("dest"));
//		txtDest.sendKeys("Kumbakonam");
//		
//		WebElement btncalender = driver.findElement(By.className("labelCalendarContainer"));
//		btncalender.click();
		
		driver.get("https://www.cleartrip.com/trains");
		WebElement btndate = driver.findElement(By.id("dpt_date"));
		btndate.click();
		
		WebElement month = driver.findElement(By.xpath("(//th[@class='month'])[1]"));
		String text = month.getText();
		System.out.println(text);
		while(!(text.equals("December 2023")))
		{
			driver.findElement(By.xpath("//a[@title='Next month']")).click();
			text=driver.findElement(By.xpath("(//th[@class='month'])[1]")).getText();
		}
		
		driver.findElement(By.xpath("(//a[text()='15'])[1]")).click();
	} 

}
