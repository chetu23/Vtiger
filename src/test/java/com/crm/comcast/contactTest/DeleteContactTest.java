package com.crm.comcast.contactTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcastPomRepo.ContactInformationPage;
import com.crm.comcastPomRepo.ContactPage;
import com.crm.comcastPomRepo.CreatecontactPage;
import com.crm.comcastPomRepo.HomePage;

import GeneralLibraries.BaseClass;

public class DeleteContactTest extends BaseClass {
@Test(groups="smokeTest")
	public void DeleteContact() throws Throwable  {
		
 		  
 		int rn = jLib.getRandomNum();
 		
 		String cellValue = eLib.getCellValue("practise", 1, 5)+rn;
 		  		 
  		 HomePage hp=new HomePage(driver);
  		 hp.getContactLink().click();
  		 
  		 ContactPage cp=new ContactPage(driver);
  		 cp.contactImg();
  		 
  		CreatecontactPage ccp=new CreatecontactPage(driver);
  		ccp.getlastNameTF().sendKeys(cellValue);
  		ccp.Createcontact();
  		
  		ContactInformationPage cip=new ContactInformationPage(driver);
  		cip.ClickDelete();
  		
  		wLib.switchToAlertWindowAndAccept(driver, "Are you sure you want to delete this record?");
  		
  		cp.getSearchTF().sendKeys(cellValue);
  		cp.DropDown();
  		cp.getSearchButton().click();
  		
  		String actualmsg=cp.getSuccesfulmsg().getText();
  		 Assert.assertEquals(actualmsg.contains(cellValue), true);
  		
  		}

}
