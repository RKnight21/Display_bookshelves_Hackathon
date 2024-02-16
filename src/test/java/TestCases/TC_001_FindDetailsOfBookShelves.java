package TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBase.BaseClass;
import Utilities.TakeScreenshot;

public class TC_001_FindDetailsOfBookShelves extends BaseClass {

	@Test(priority=1)
	public void searchbookshelves() throws InterruptedException, IOException {
		
		logger.info("***** Starting TC_001_FindDetailsOfBookShelvesTest *****");
		HomePage hp = new HomePage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
//		Thread.sleep(3000);
		
		logger.debug("Application logs started........");
		logger.info("Search Bookshelves in the Home Page");
		hp.searchBookshelves();
		
		logger.info("Click on the search button");
		hp.searchClick();
		Thread.sleep(5000);
		
		hp.Close();
		Thread.sleep(5000);
		
		logger.info("Click Exclude out of stock");
		hp.excludeOFS();
		Thread.sleep(5000);
		
		logger.info("Move to category and  click kidbookshelves");
		hp.movetoCategory(driver);
		Thread.sleep(8000);
		
		logger.info("Sort price from High to Low");
		hp.SortPrice(driver);
		Thread.sleep(6000);
		
		logger.info("Set Price Under 15000");
		hp.SlidePrice(driver);
		Thread.sleep(5000);
		
		logger.info("Get Name,Price of Bookshelves and print in the console");
		List<WebElement> Top3= hp.Items;
		List<WebElement> Top3Price=hp.Price;
		for(int i=0;i<3;i++) {
			System.out.println(Top3.get(i).getText()+":"+Top3Price.get(i).getText());
		}
		
//		Thread.sleep(3000);
//
//		TakeScreenshot ts = new TakeScreenshot(driver);    // taking screenshot
//		ts.takeScreenshot("homePage");
		
		logger.info("***** Finished TC_001_FindDetailsOfBookShelvesTest *****");
	}

	}
	
	

