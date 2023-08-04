package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass{
public static HomePage home;
	@When("user is on HomePage validate homePage title")
	public void user_is_on_home_page_validate_home_page_title() {
	   home=new HomePage();
	 String ActualTitle= home.getTitle();
	 Assert.assertEquals(ActualTitle, "OrangeHRM");
	}

	@Then("validate HomePage URL")
	public void validate_home_page_url() {
	  String ActualUrl=home.getUrl();
	  Assert.assertEquals(ActualUrl.contains("dashboard"),true);
	}

	@Then("validate HomePage  Logo")
	public void validate_home_page_logo() {
	   boolean Logo=home.checkLogo();
	   Assert.assertEquals(Logo, true);
	}
	
}
