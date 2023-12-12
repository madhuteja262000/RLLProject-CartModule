package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TestPage {
	WebDriver driver;
	@FindBy(xpath = "(//input[@class = 'main-search__input'])[1]")
	WebElement Searchbox;
	
	@FindBy(xpath = "(//button [@type = 'submit'])[1]")
	WebElement Searchbutton;
	
	public void enterTheproduct() throws InterruptedException
	{
		Assert.assertTrue(Searchbox.isEnabled());
		Searchbox.sendKeys("Table");
		 Thread.sleep(3000);
	}
	 
	public void clickOnSearchbtn() throws InterruptedException
	{
		Searchbutton.click();
		Thread.sleep(10000);
	}
	
	@FindBy(xpath = "(//button[@name='add'])[1]")
	WebElement product1;
	
	public void product1() throws InterruptedException 
	{
		product1.click();
		Thread.sleep(10000);
	}
	
	@FindBy(xpath="//span[contains(.,'Continue shopping')]")
	WebElement continueshopping;
	
	public void continueshopping() throws InterruptedException 
	{
		continueshopping.click();
		Thread.sleep(10000);
	}
	
	@FindBy(xpath = "(//button[@name='add'])[2]")
	WebElement product2;
	
	public void product2() throws InterruptedException 
	{
		product2.click();
	}

}
