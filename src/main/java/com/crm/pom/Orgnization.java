package com.crm.pom;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.utility.VtigerUtility;





public class Orgnization {
	
	public Orgnization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	private @FindBy(linkText = "Organizations")
	WebElement organLink;
	
	private @FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement plusbutton;
	
	private @FindBy (name = "accountname")
	WebElement orgname;
	
	
	private @FindBy (xpath = "//input[@accesskey='S']")
	WebElement savebutton;
	
	private@FindBy (className = "dvHeaderText")
	WebElement header;
	
	private @FindBy(name = "industry")
	WebElement industry;
	
	public void organizationLink()
	{
		organLink.click();
	}
	
	public void plus_button()
	{
     	plusbutton.click();
	}
	public void org_name() throws IOException 
	{
	  String name = VtigerUtility.randomData("data1");
	  orgname.sendKeys(name);
	}
	
	public void save()
	{
		savebutton.click();
	}
	
	public void indDropDwon()
	{
		Select s=new Select(industry);
		s.selectByValue("Banking");
	}
	public WebElement headerText()
	{
		return header;
	}
	public WebElement getindutstrytext()
	{
		return industry;
	}
		

}
