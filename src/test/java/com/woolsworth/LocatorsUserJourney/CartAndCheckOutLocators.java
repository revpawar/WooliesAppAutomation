package com.woolsworth.LocatorsUserJourney;

import org.openqa.selenium.By;

public class CartAndCheckOutLocators {

	
	
	public static By SearchBar= By.xpath("//input[@id='wx-headerSearch']");
	
	public static By SearchButton = By.xpath("(//button[contains(@id,clear)]/following::button)[2]");
	
	public static By addToCart= By.xpath("//button[@class='add-to-cart-btn']"); //shadow host 
	
	public static By CartButton= By.cssSelector("button#header-view-cart-button");
	
	public static By CheckOutButton=By.xpath("//div[@class=\"cart-checkout-button\"]");
	
}


