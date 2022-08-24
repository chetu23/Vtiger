package com.crm.comcastPomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadpage {
	WebDriver driver;
	 
	@FindBy(css = "img[src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement plusIconLink;

	public WebElement getPlusIconLink() {
		return plusIconLink;
	}
	
	public Leadpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

}
