package com.woolsworth.runner;

import org.testng.annotations.DataProvider;

import com.woolsworth.base.BaseClass;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/resources/FeatureFiles/CartAndCheckOut.feature",glue="com.woolsworth.stepdefinitions"
,monochrome=true,publish=true)
public class Runner extends BaseClass
{
	
@Override 
@DataProvider(parallel=true)
public Object[][] scenarios()
{
	//to call the same function from the parent class
	//why called because to execcute the testcase with 2 different sets of data
return super.scenarios();
}
}

