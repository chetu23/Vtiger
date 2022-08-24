package com.crm.comcast.contactTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcastPomRepo.ContactInformationPage;
import com.crm.comcastPomRepo.ContactPage;
import com.crm.comcastPomRepo.CreatecontactPage;
import com.crm.comcastPomRepo.HomePage;

import GeneralLibraries.BaseClass;

public class CreateContactTest extends BaseClass{
	
		@Test(groups="smokeTest")
         public  void CreateContact() throws Throwable {
        	
     		  
     		int rn = jLib.getRandomNum();
     		
     		String cellValue = eLib.getCellValue("practise", 1, 5)+rn;
     		
            HomePage hp= new HomePage(driver);
            hp.getContactLink().click();
            
            ContactPage cp=new ContactPage(driver);
            cp.contactImg();
            
            CreatecontactPage ccp=new CreatecontactPage(driver);
            ccp.getlastNameTF().sendKeys(cellValue);
            ccp.Createcontact();
             
            ContactInformationPage cip= new ContactInformationPage(driver);
            
            String actualSucessfulmessage =cip.getsucessfulMsg().getText();
            Assert.assertEquals(actualSucessfulmessage.contains(cellValue), true);
   		   
            
   		  
     		 		
	}

}

