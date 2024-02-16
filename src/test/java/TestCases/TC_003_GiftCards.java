package TestCases;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.ThirdPage;
import Utilities.ExcelUtility;
import Utilities.TakeScreenshot;



public class TC_003_GiftCards extends TC_002_ItemsUnderLiving{


	//ThirdPage TP= new ThirdPage(driver);
	
	@Test(priority=3,dataProvider = "giftData")
	public void ClickGiftCards(String giftAmount,String recipientName,String recipientEmail, String recipientMobile , 
			String name, String corrcetEmail,String mobile, String address,String pinCode,String city , String incorrcetEmail ) throws InterruptedException {
	logger.info("***** Starting TC_003_GiftCardsTest *****");
	ThirdPage TP= new ThirdPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
	Thread.sleep(5000);
	
	logger.info("Click on the Gift icon");
	TP.clickGiftcards();
	Thread.sleep(5000);
	
	logger.info("Click on the Birthday icon");
	TP.clickBirthday(driver);
	Thread.sleep(5000);
	logger.info("Fill the necessary data for giftcards");
	TP.Enteramount(giftAmount);
	Thread.sleep(5000);
	TP.Entermonth();
	TP.Enterday();
	TP.Clicknext();
	Thread.sleep(3000);

//	
	logger.info("Entering Customers Details");
	TP.EnterToDetails(recipientName,incorrcetEmail,recipientMobile);
	Thread.sleep(3000);
	logger.info("Entering Recipient Details");
	TP.EnterCustomerDetails(name,corrcetEmail,mobile,address,pinCode);

	}
   
	
    @Test(priority=4)
   	public void GetErrorMsg() throws InterruptedException {
    	ThirdPage TP= new ThirdPage(driver);
    	Thread.sleep(5000);
    	TP.getErrorMsg(driver);
    	Thread.sleep(5000);
   	
//    String msg=TP.errormsg.getText();
//    logger.info("Printing Error Message in the console");
//   	System.out.println("Error Message:"+""+msg);
//   	Thread.sleep(3000);

	
   	}
    
    
    @Test(priority=5,dataProvider = "giftData")
	public void ValidateDetails(String giftAmount,String RecipientName,String RecipientEmail, String recipientMobile , 
			String name, String correctEmail,String mobile, String address,String pinCode,String city,String incorrcetEmail) throws InterruptedException {
    ThirdPage TP= new ThirdPage(driver);
	
	TP.RecipientsEmail.clear();
	TP.RecipientsEmail.sendKeys(RecipientEmail);
	TP.RecipientNumber.clear();
    TP.RecipientNumber.sendKeys("7869795910");
    TP.clickpayment(driver);
    Thread.sleep(4000);
    logger.info("***** Finished TC_003_GiftCardsTest *****");
	}
    
    @DataProvider(name = "giftData")
    public Object[][] giftDPMethod(){
    	
    	int rowNumber = 0;
    	int cellNumber = 0;
    	try {
    		rowNumber = ExcelUtility.getRowNumber("GiftData");
    		cellNumber = ExcelUtility.getCellNumber("GiftData");
    	}
    	catch (Exception e) {
			// TODO: handle exception
		}
    	
    	Object[][] giftData = new Object[rowNumber-1][cellNumber];
    	
    	for(int i=0;i<rowNumber;i++) {
    		for(int j=0;j<cellNumber;j++) {
    			try {
					giftData[i][j] = ExcelUtility.readExcelData("GiftData", (i+1), j);
				} catch (Exception e) {
					// TODO: handle exception
				}
    		}
    	}
    	
    	return giftData;
    	
    }

    
}
