package org.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PC2 {
	public static void main(String[] args) {
		//select date in calender
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement btnDate = driver.findElement(By.id("datepicker"));
		btnDate.click();
		
		WebElement month = driver.findElement(By.className("ui-datepicker-title"));
		String text = month.getText();
		System.out.println(text);

		while (!(text.equals("October 2024"))) {
			WebElement btnNext = driver.findElement(By.xpath("//a[@title='Next']"));
			btnNext.click();
			
			 text= driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(text);
		}
		driver.findElement(By.xpath("//a[text()='15']")).click();
		
	}
}
