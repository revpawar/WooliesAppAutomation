package com.woolsworth.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.woolsworth.base.BaseClass;

public class CommonUtil extends BaseClass {
	public JavascriptExecutor js;
	
	public void scrollToView(By Xpath) {
		try {
			
			WebElement element = getDriver().findElement(Xpath);
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			js.executeScript("window.scrollBy(0,200)");
			
		}
		catch (Exception e ) {
			
		}
	}

}
