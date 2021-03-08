package org.abc.Starting.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/webDriverBinaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//dynamic 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();//for selecting departure drop down
		driver.findElement(By.xpath("//a[@value='BLR']")).click();//for selecting departure city
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();//for arriving drop down
		driver.findElement(By.xpath(" (//a[@value='MAA'])[2]")).click();//for arriving city
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();//for current calender 
		
		
		driver.findElement(By.id("divpaxinfo")).click();//for seat adult
		//Thread.sleep(2000L);
		int i=1;
		while(i<5){
			driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_ddl_Adult\']")).click();//selecting 5 adults
			i++;
		}
		
		//Static drop down
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));//for currency by using select 
		//s.selectByValue("INR");
		//s.selectByIndex(5);
		s.selectByVisibleText("AED");
	
		//we can also deselect by using deselect option
		
		//checkbox
		
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		
		
		

		
		

	}

}
