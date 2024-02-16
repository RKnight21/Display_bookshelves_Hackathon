package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends BasePage {

	WebDriver driver;
	public ThirdPage(WebDriver driver) {
		super(driver);
		
	}
    // Locating Gift cards Button and filling the necessary details
	@FindBy(xpath="//a[@class='featuredLinksBar__link' and @href='../../gift-cards?src=header']")
	public WebElement GiftCards;
	
	@FindBy(xpath="//img[@alt='Birthday/Anniversary Gift Card by Urban Ladder']")
	public WebElement ReachBirthday;
	
	@FindBy(xpath="//p[contains(text(),'Gift something memorable to help them celebrate great memories!')]/following::button[1]")
	public WebElement ChooseBirthday;
	
	@FindBy(xpath="//input[@id='ip_2251506436']")
	public WebElement EnterAmount;
	
	@FindBy(xpath="//option[@value='4/2024']")
	public WebElement EnterMonth;
	
	@FindBy(xpath="//option[@value='5']")
	public WebElement EnterDay;
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	public WebElement ClickNext;

	
	//Locating the recipient's details and filling the details
    @FindBy(xpath="//input[@id='ip_4036288348']")
    public  WebElement Recipientsname;
    
    @FindBy(xpath="//input[@id='ip_137656023']")
    public WebElement RecipientsEmail;
    
    @FindBy(xpath="//input[@id='ip_3177473671']")
    public WebElement RecipientNumber;
    
    //Locating the Customer's Detail
    
    @FindBy(xpath="//input[@id='ip_1082986083']")
    public WebElement Name;
    
    @FindBy(xpath="//input[@id='ip_4081352456']")
    public WebElement Email;
    
    @FindBy(xpath="//input[@id='ip_2121573464']")
    public WebElement Number;
    
    @FindBy(xpath="//input[@id='ip_2194351474']")
    public WebElement Address;
    
    @FindBy(xpath="//input[@id='ip_567727260']")
    public WebElement pincode;
    
    @FindBy(xpath="//button[contains(text(),'Confirm')]")
    public WebElement Confirm;
    
    @FindBy(xpath="//span[contains(text(),'Proceed to payment')]")
    public WebElement Payment;
    
    @FindBy(xpath="//li[@class='_2tx0o']")
    public WebElement errormsg;
    
	public void clickGiftcards() {
		try {
			Thread.sleep(2000);
			GiftCards.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickBirthday(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.moveToElement(ReachBirthday).build().perform();
		ChooseBirthday.click();
	}
	
	public void Enteramount(String amount) {
		EnterAmount.sendKeys(amount);
	}
	
	public void Entermonth() {
		EnterMonth.click();
	}
	
	public void Enterday() {
		EnterDay.click();
	}
	
	public void Clicknext() {
		ClickNext.click();
	}
	
	public void EnterToDetails(String name,String email,String mobile) {
		
		Recipientsname.sendKeys(name);	
		RecipientsEmail.sendKeys(email);
	    RecipientNumber.sendKeys(mobile);
	}
	
	
	public void EnterCustomerDetails(String name,String email,String mobile,String address,String pinCode) throws InterruptedException
	{  
    	
    	
    Name.sendKeys(name);
    Email.sendKeys(email);
    Address.sendKeys(address);
    Number.sendKeys(mobile);
    pincode.sendKeys(pinCode);
    Thread.sleep(2000);
    Confirm.click();
   
	}
	
	public void clickpayment(WebDriver driver) throws InterruptedException {
    	
    	Thread.sleep(5000);
    	JavascriptExecutor js= (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,150)");
    	Thread.sleep(5000);
    	Confirm.click();
    	Thread.sleep(3000);
//	    Payment.click();
	}

	public void getErrorMsg(WebDriver driver) {
		
		String Msg = RecipientsEmail.getAttribute("validationMessage");
		System.out.println("Error Message: "+Msg);
	}
}
