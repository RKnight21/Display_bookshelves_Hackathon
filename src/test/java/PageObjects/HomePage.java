package PageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage {

	

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[contains(text(),'Bookshelves')]")
	 public WebElement Bookshelves;
	
	@FindBy(xpath="//input[@name='keywords']")
	 public WebElement SearchBox;
	
	@FindBy(xpath="//button[@id='search_button']")
	public WebElement SearchClick;
	
	@FindBy(xpath="//label[contains(text(),'Kids Bookshelves')]")
	public WebElement KidBookshelves;
	
	@FindBy(xpath="//input[@value='In Stock Only']")
	public WebElement Outofstock;
	
	@FindBy(xpath="//span[contains(text(),'Recommended')]")
	public WebElement Recommended;
	
	@FindBy(xpath="//li[@class='option' and @data-key='price_desc']")
	public WebElement SortByPrice;
	
	@FindBy(xpath="//li[@class='item' and @data-group='price']")
	public WebElement PriceIcon;
	
	@FindBy(xpath="//div[@class='noUi-origin'][2]")
	public WebElement UnderPrice;
	
	@FindBy(xpath="//a[@data-id='114364' and @data-ga='Text']")
	public WebElement FirstItem;
	
	@FindBy(xpath="//a[@data-ga='Text' and @data-id='189167']")
	public WebElement SecondItem;
	
	@FindBy(xpath="//a[@data-ga='Text' and @data-id='189168']")
	public WebElement ThirdItem;
	
	@FindBy(xpath="//span[@class='name']")
	 public List<WebElement> Items;
	
	@FindBy(xpath="//div[@class='price-number']/span")
	public List<WebElement> Price;
	
	@FindBy(xpath="//li[@class='item' and @data-group='category']")
	public WebElement Category;
	
	@FindBy(xpath="//a[@href='javascript:void(0);' and  @data-gaaction='popup.auth.close']")
	public WebElement CloseButton;
	
	
	public void searchBookshelves() {
		SearchBox.sendKeys("Bookshelves");
	}
	
	public void searchClick() {
	SearchClick.click();	
	}
	
	public void clickKB() {
		
	KidBookshelves.click();
	}
	
	public void excludeOFS() {
		Outofstock.click();
	}
	public void clickBookshelves() {
		Bookshelves.click();
	}
	
	
	public void SlidePrice(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
		
		act.moveToElement(PriceIcon).build().perform();
		Thread.sleep(3000);
		act.moveToElement(UnderPrice).dragAndDropBy(UnderPrice, -211, 0).perform();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute['style','left: 32.1767%;']",UnderPrice);
//		
	
	}
	public void SortPrice(WebDriver driver) {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Recommended).build().perform();
		SortByPrice.click();
	}
	
	public void movetoCategory( WebDriver driver) {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Category).build().perform();
		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",KidBookshelves);
		
	}
	
	
	public void Dismissalert() {
		driver.switchTo().alert().dismiss();
	}

	public void Close() {
		CloseButton.click();
	}
}
