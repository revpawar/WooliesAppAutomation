package com.woolsworth.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.woolsworth.LocatorsUserJourney.CartAndCheckOutLocators;
import com.woolsworth.base.BaseClass;
import com.woolsworth.userjourney.CartAndCheckOut;
import com.woolsworth.userjourney.Products;
import com.woolsworth.util.ShadowDOM;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartCheckOut extends BaseClass{
 
	
	CartAndCheckOut CartCheckOut = new CartAndCheckOut();

//commented to give demo	
//	 @Given("open url {string}")
//	 public void OpenBrowser(String url)
//	 {
//		 System.out.print("Rev1");
//		 getDriver().get(url);
//		 
//	
//	 }
	 
		@Given("open url {string}")
		public void openBrowser(String url) {
		    System.out.println("Opening URL: " + url);
		    if (getDriver() == null) {
		        System.out.println("WebDriver is not initialized. Initializing now...");
		        setDriver(new ChromeDriver()); // Or initialize with  desired WebDriver (Chrome, Firefox, etc.)
		    }
		    getDriver().get(url);
		}

	 
	 @When("Search for Products and click add to cart")
	 public void ProductSearch(DataTable prods)
	 {
		CartCheckOut.ClickSearchBar(prods);
	
	 }
	 
	 @And("Click cart button on the homepage")
	 public void ClickCartButton()
	 {
		 CartCheckOut. ClickCartButton();
	 }
	 
	 @And("Click Checkout")
	 public void ClickCheckout()
	 {
		 CartCheckOut.ClickCheckOutButton();
	 }
	 @Then("verify the mini cart")
	 public void VerifyMiniCart()
	 {
		 
	 }



}


