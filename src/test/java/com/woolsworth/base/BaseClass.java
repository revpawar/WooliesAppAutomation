package com.woolsworth.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.woolsworth.util.ReadExcel;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.sukgu.Shadow;


public class BaseClass extends AbstractTestNGCucumberTests {
	private static final ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<RemoteWebDriver>();
	private static final ThreadLocal<Shadow> dom = new ThreadLocal<Shadow>() {
		@Override
	    protected Shadow initialValue() {
			
			
	        return new Shadow(getDriver());
	        
	    }
	};
	
	public Shadow getShadowElement() {
	    return dom.get();
	

	}

public void setShadowDom() {
    dom.set(new Shadow(getDriver()));
}

	public static void setDriver(RemoteWebDriver driver) {

		tlDriver.set(driver);
	
	}
	

	public static RemoteWebDriver getDriver() {
		return tlDriver.get();
	}


	public String fileName;
	
	public void preCondition() {
	setDriver(new ChromeDriver());}

//commented this to give demo, so dint clean up the code 
	
//	@Parameters("browser")
//	@BeforeMethod
//	public void preCondition(@Optional("chrome") String browser) {
//
//		if (browser.equalsIgnoreCase("chrome")) {
//			setDriver(new ChromeDriver());
//	
//		} else if (browser.equalsIgnoreCase("firefox")) {
//			
//			setDriver(new FirefoxDriver());
//		}
//		}
//	

	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

	@DataProvider(name = "getData", indices = 0)
	public String[][] fetchData() throws IOException {
		return ReadExcel.readData(fileName);
	}

}
