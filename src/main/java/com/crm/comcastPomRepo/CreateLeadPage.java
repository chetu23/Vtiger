package com.crm.comcastPomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage {
	WebDriver driver;
	
	@FindBy(name = "lastname")
	private WebElement LastNameTF;
	
	@FindBy(name = "salutationtype")
	private WebElement Firstnamedropdown;
	
	@FindBy(name = "firstname")
	private WebElement FirstNmaeTF;
	
	@FindBy(name = "company")
	private WebElement CompanyTF;
	
	@FindBy(id = "designation")
	private WebElement TitleTF;
	
	@FindBy(name = "leadsource")
	private WebElement LeadsourceDropDown;
	
	@FindBy(name="industry")
	private WebElement IndustryDropDown;
	
	@FindBy(name="annualrevenue")
	private WebElement AnnualRevenueDropDown;
	
	@FindBy(id="noofemployees")
	private WebElement NoOfEmployeesTF;
	
	@FindBy(id="mobile")
	private WebElement MobileNoTF;
	
	@FindBy(id="email")
	private WebElement EmailTF;
	
	@FindBy(name="leadstatus")
	private WebElement LeadStatusdropdown ;
	
	@FindBy(name="assigntype")
	private WebElement RadioButton;
	
	@FindBy(name="lane")
	private WebElement StreetTA;
	
	@FindBy(id="code")
	private WebElement PostalCodeTF;
	
	@FindBy(id="country")
	private WebElement CountryTF;
	
	@FindBy(id="city")
	private WebElement CityTF;
	
	@FindBy(id="state")
	private WebElement StateTF;
	
	@FindBy(name="button")
	private WebElement SaveButton;
	
	public CreateLeadPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

	public WebElement getLastNameTF() {
		return LastNameTF;
	}

	public WebElement getFirstnamedropdown() {
		return Firstnamedropdown;
	}

	public WebElement getFirstNmaeTF() {
		return FirstNmaeTF;
	}

	public WebElement getCompanyTF() {
		return CompanyTF;
	}

	public WebElement getTitleTF() {
		return TitleTF;
	}

	public WebElement getLeadsourceDropDown() {
		return LeadsourceDropDown;
	}

	public WebElement getIndustryDropDown() {
		return IndustryDropDown;
	}

	public WebElement getAnnualRevenueDropDown() {
		return AnnualRevenueDropDown;
	}

	public WebElement getNoOfEmployeesTF() {
		return NoOfEmployeesTF;
	}

	public WebElement getMobileNoTF() {
		return MobileNoTF;
	}

	public WebElement getEmailTF() {
		return EmailTF;
	}

	public WebElement getLeadStatusdropdown() {
		return LeadStatusdropdown;
	}

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getStreetTA() {
		return StreetTA;
	}

	public WebElement getPostalCodeTF() {
		return PostalCodeTF;
	}

	public WebElement getCountryTF() {
		return CountryTF;
	}

	public WebElement getCityTF() {
		return CityTF;
	}

	public WebElement getStateTF() {
		return StateTF;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
	
	

	
	
	
	
	
	
	
	
}
