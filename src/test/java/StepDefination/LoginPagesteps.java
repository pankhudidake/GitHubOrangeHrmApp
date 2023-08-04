package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPagesteps extends BaseClass {
	public static LoginPage log;

	@Given("user on HomePage")
	public void user_on_home_page() {
		initailization();
	}

	@When("user enter valid username and password and click on Login button")
	public void user_enter_valid_username_and_password_and_click_on_login_button() {
		log = new LoginPage();
		log.loginPageFunctionality(prop.getProperty("uname"), prop.getProperty("pass"));
	}

	@After
	public static void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			byte f[] = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());

		} else {
			byte f[] = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f, "image/png", scenario.getName());

		}
	}
}