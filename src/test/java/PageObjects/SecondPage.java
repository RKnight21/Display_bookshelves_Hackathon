package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends BasePage {

WebDriver driver;

public SecondPage(WebDriver driver) {
	super(driver);
}
	
@FindBy(xpath="//li[@class='topnav_item livingunit']")
WebElement Living;

@FindBy(xpath="//li[@class='topnav_item livingunit']/div/div/ul/li/ul/li/a/span")
public List<WebElement> Itemsunderliving;

public void MoveToLiving(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-500)");
	
	Actions act = new Actions(driver);
	
	act.moveToElement(Living).build().perform();
	
}

public void toGifts(WebDriver driver) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,100)");
	js.executeScript("window.scrollBy(0,-600)");
}


}
