package com.woolsworth.userjourney;



import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.woolsworth.LocatorsUserJourney.CartAndCheckOutLocators;
import com.woolsworth.base.BaseClass;
import com.woolsworth.util.CommonUtil;
import com.woolsworth.util.ShadowDOM;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;
import io.github.sukgu.Shadow;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CartAndCheckOut extends BaseClass {
	
	CommonUtil utils=new CommonUtil();
	CartAndCheckOutLocators cart=new CartAndCheckOutLocators();
	
	public void ClickSearchBar(DataTable prods)
	{
		
		
		 List<Map<String, String>> data = prods.asMaps(String.class, String.class);
		 
	        for (Map<String, String> row : data) {
	            String product = row.get("product");
	        	getDriver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        	getDriver().findElement(cart.SearchBar).click();
	    		getDriver().findElement(cart.SearchBar).sendKeys(product,Keys.ENTER);
 		
	    		utils.scrollToView(cart.addToCart);
		  	
				getShadowElement().findElementByXPath("//button[@class='add-to-cart-btn']").click();
		    		
	    		getDriver().findElement(cart.SearchBar).clear();
	
	}
	}
	        
	   public void ClickCartButton()
       {
       	getDriver().findElement(cart.CartButton).click();
       }
	   
	   public void ClickCheckOutButton()
	   {
			getDriver().findElement(cart.CheckOutButton).click();
	   }
	
	}
	

	
	 


