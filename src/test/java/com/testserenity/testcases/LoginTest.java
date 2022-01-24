package com.testserenity.testcases;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.requirements.reports.ReportBadges;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject{
	
	@Managed
	WebDriver driver;
	
	@FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")
	WebElementFacade ddCurrency; 
	
	@FindBy(xpath="//*[@id=\"ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen\"]")
	WebElementFacade chkbox; 
	
	
	@Title("Executing SpiceJet Test") 	
	@Test	
	public void doLogin()  {
		
		open();
		//driver.get("http://google.com");
		//find(By.name("q")).sendKeys("Hello Serenity");
		
		//typeInto(googleSearch,"Hello Serenity");
		
		//find(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")).selectByVisibleText("GBP");
		
		ddCurrency.selectByVisibleText("GBP");
		Serenity.takeScreenshot();
		
		List <WebElementFacade> allList = findAll(By.tagName("option"));
		
		System.out.println("Total Items " + allList.size());
		
		chkbox.select();
		
		
		//Select selDD = new Select(ddCurrency);
		//selDD.selectByVisibleText("GBP");
		
		
		
	
		
	}


}
