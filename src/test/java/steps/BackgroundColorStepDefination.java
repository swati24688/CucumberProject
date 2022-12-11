package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BackgroundColorPage;
import page.TestBase;

public class BackgroundColorStepDefination extends TestBase {

	BackgroundColorPage backgroundColorPage;

	private static final String SKY_BLUE = "#87ceeb";
	private static final String SKY_WHITE = "#ffffff";

	@Before
	public void setUp() {
		initDriver();
		backgroundColorPage = PageFactory.initElements(driver, BackgroundColorPage.class);
	}

	@Given("^User is on set background page$")
	public void user_is_on_set_background_page() {

		driver.get("https://techfios.com/test/101/");
	}

	@When("^User click on the skyblue button$")
	public void user_click_on_the_skyblue__button() {

		backgroundColorPage.setSkyBlueBackground();

	}

	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		String background = backgroundColorPage.background();
		Assert.assertEquals(SKY_BLUE, background);
	}

	@Given("^User Set SkyWhite Background button exists$")
	public void user_Set_SkyWhite_Background_button_exists() {
		backgroundColorPage.setWhiteBackground();
	}

	@When("^User click on the white button$")
	public void user_click_on_the_white_button() {
		backgroundColorPage.setWhiteBackground();
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
		String background = backgroundColorPage.background();
		Assert.assertEquals(SKY_WHITE, background);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
