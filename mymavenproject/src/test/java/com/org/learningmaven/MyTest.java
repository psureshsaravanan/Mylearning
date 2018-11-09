package com.org.learningmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class MyTest {

	
	@Test
	public void setup(){
		System.out.println("MyTest class is exeuted");
		
//		System.setProperty("webdriver.gecko.driver", "D:\\automation files\\geckodriver.exe");
//		FirefoxOptions options = new FirefoxOptions();
//		options.setCapability("marionette", false);
//		WebDriver Driver = new FirefoxDriver(options);
//		
//		//WebDriver driver=new FirefoxDriver();
//	Driver.quit();
	}
}
