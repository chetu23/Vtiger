package com.crm.comcast.campaignTest;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.comcastPomRepo.CampaignPage;
import com.crm.comcastPomRepo.CreateCampaignInfoPage;
import com.crm.comcastPomRepo.CreateCampaignPage;
import com.crm.comcastPomRepo.HomePage;

import GeneralLibraries.BaseClass;

public class CreateCampaignWithProductTest extends BaseClass {
	@Parameters("browser")
     @Test(groups="RegressionTest")
	public  void CreateCampaignProduct(@Optional("firefox") String browser) throws Throwable {
		
		 
		int rn = jLib.getRandomNum();
		
		String cellValue = eLib.getCellValue("practise", 1, 5)+rn;
		String cellValue1 = eLib.getCellValue("practise", 1, 7);
		 
		
		 HomePage hp=new HomePage(driver);
		 hp.moreLink();
		 hp.getCampaignLink().click();
		 
		 CampaignPage cp=new CampaignPage(driver);
		 cp.campaignImg();
		 
		 CreateCampaignPage ccp=new CreateCampaignPage(driver);
		 ccp.getcampaignNameTF().sendKeys(cellValue);
		 ccp.getplusImg().click();
		 ccp.switchto();
		 ccp.getSearchTF().sendKeys(cellValue1);
		 ccp.getSearchButton().click();
		 ccp.getLaplink().click();
		 ccp.switchback();
		 ccp.getSaveButton().click();
		 
		 CreateCampaignInfoPage ccip=new CreateCampaignInfoPage(driver);
		 
		 String actualSucessfulmessage =ccip.getsucessfulMsg().getText();
		 Assert.assertEquals(actualSucessfulmessage.contains(cellValue), true);
		}

}
