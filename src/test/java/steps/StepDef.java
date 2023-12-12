package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestPage;

public class StepDef {
	TestPage Tp;
	BaseTest Tr;
	WebDriver driver;
	
	public StepDef(BaseTest Tr) {
		this.Tr=Tr;
	}
	@Given("I am on the Chiltern Oak Furniture website")
	public void i_am_on_the_chiltern_oak_furniture_website() {
		driver = Tr.getdriver();
		Tp = PageFactory.initElements(driver, TestPage.class);
		driver.get("https://www.chilternoakfurniture.co.uk/");
	}

	@Then("User search the product")
	public void user_search_the_product() throws InterruptedException {
		Tp.enterTheproduct();
	    
	}

	@Then("User Click on search button")
	public void user_click_on_search_button() throws InterruptedException {
	   Tp.clickOnSearchbtn();
	}

	@When("I add Product1 to the cart")
	public void i_add_product1_to_the_cart() throws InterruptedException {
	    Tp.product1();
	   // String Text = driver.findElement(By.xpath("//span[@class = 'inner-count']")).getText();
	   // System.out.println(Text);
	}
	@Then("i click on continue shopping")
	public void i_click_on_continue_shopping() throws InterruptedException {
	    Tp.continueshopping();
	}

	@Then("I add Product2 to the cart")
	public void i_add_product2_to_the_cart() throws InterruptedException {
	    Tp.product2();
	}

}
