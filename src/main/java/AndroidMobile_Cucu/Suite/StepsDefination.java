package AndroidMobile_Cucu.Suite;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Assert;

import Base.TestBase;
import Pages.BasePage;
import Pages.LoginErrorPage;
import Pages.LoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefination extends TestBase {
	private BasePage basePage;
	private LoginPage loginPage;
    private LoginErrorPage LEPage;

	public StepsDefination() throws IOException {

		super();
		basePage = new BasePage(TestBase.d);
		loginPage = new LoginPage(TestBase.d);
		LEPage=new LoginErrorPage(TestBase.d);

	}

	@Before("@web")
	public void beforeScenario() throws IOException {
		//TestBase.SetPath();
		//d.get(CONFIG.getProperty("URL"));
	  // actions
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This below are Only For @Given Methods */
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* @param {string} siteName-is the url address od supercasino.com */

	@Given("^I navigate to the homepage on \"([^\"]*)\"$")
	public void i_navigate_to_the_homepage_on(String browser) throws MalformedURLException {
		
		//basePage.getSiteAddress(Config.getProperty("URL"));
		//basePage.get(browser);

	}

	@Given("^I Navigate to the homepage on \"([^\"]*)\"$")
	public void i_Navigate_to_the_homepage_on_browser(String browser) throws Throwable {
		
		d.get(CONFIG.getProperty("URL"));
	}
	@Given("^I am on the Page$")
	public void i_am_on_the_Page() {
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Below are Only for @When Method */
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* Click on the Login Button at the RTop of the Home Page */
	@When("^I click on Login Button$")
	public void i_click_on_Login_Button() {
		basePage.clickLoginButton();

	}

	@When("^I click on the Login Pop-up close icon$")
	public void i_click_on_the_Login_Pop_up_close_icon() {
		loginPage.clickLoginBoxCloseIcon();

	}

	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username) {
			LEPage.sendUseraname(username);

	}

	@When("^I enter Password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String password) {
		LEPage.sendPassword(password);
	}

	@When("^I click on SignIn button$")
	public void i_click_on_SignIn_button() {
		loginPage.clickSigninButton();

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Below are Only for @Then Method */
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/* Verify if Login Button is present on the home page */
	@Then("^I should see Login Button$")
	public void i_should_see_Login_Button() {
	Assert.assertTrue(basePage.isLoginButtonPresent());

	}

	/* Verify if Supercasino Logo is displayed on the Home page */
	@Then("^I should see Supercasino Logo$")
	public void i_should_see_Supercasino_Logo() {
		Assert.assertTrue(basePage.isSupercasinoLogoPresent());

	}

	/* Verify if Side Bar Menu icon is displayed */
	@Then("^I should see SideBar Menu Icon$")
	public void i_should_see_SideBar_Menu_Icon() {
		Assert.assertTrue(basePage.isSideBarIconPresent());

	}

	/* Verify if Casino Tab is Present within the Vertical */
	@Then("^I should see Casino Vertical Tab$")
	public void i_should_see_Casino_Vertical_Tab() {
		Assert.assertTrue(basePage.isCasinoTabPresent());
	}

	/* Verify if Vegas Tab is Present within the Vertical */
	@Then("^I should see Vegas Vertical Tab$")
	public void i_should_see_Vegas_Vertical_Tab() {
		Assert.assertTrue(basePage.isVegasTabPresent());

	}

	/* Verify if Live Tab is Present within the Vertical */
	@Then("^I should see Live Vertical Tab$")
	public void i_should_see_Live_Vertical_Tab() {
		Assert.assertTrue(basePage.isLiveTabPresent());

	}

	/* Verify if Promos Tab is Present within the Vertical */
	@Then("^I should see Promos Vertical Tab$")
	public void i_should_see_Promos_Vertical_Tab() {
		Assert.assertTrue(basePage.isPromoTabPresent());

	}

	/* Verify if Hero Banner is displayed on the Home Page */
	@Then("^I should see Hero Banner$")
	public void i_should_see_Hero_Banner() {

	}

	/* Verify if Games Category is present on the Home Page */
	@Then("^I should see  Games Category Tab$")
	public void i_should_see_Games_Category_Tab() {

	}

	/* Verify if Login Pop up box is displayed when Login button is clicked */
	@Then("^I should see Login Pop-up box displayed$")
	public void i_should_see_Login_Pop_up_box_displayed() {
		Assert.assertTrue(loginPage.isLoginPopUpBoxPresend());
	}

	/* Verify if Supercasino logo is displayed on Login Pop Up Box */
	@Then("^I should see Supercasino Logo displayed$")
	public void i_should_see_Supercasino_Logo_displayed() {
		Assert.assertTrue(loginPage.isPopUpBoxSupercasinoLogoPresent());

	}

	/* Verify if username Input box is displayed */
	@Then("^I should see Username Input Box$")
	public void i_should_see_Username_Input_Box() {
		Assert.assertTrue(loginPage.isPopUpBoxUsernameInputBoxPresent());
	}

	/* Verify if password Input box is displayed */
	@Then("^I should see Password Input box$")
	public void i_should_see_Password_Input_box() {
		Assert.assertTrue(loginPage.isPopUpBoxPasswordInputBoxPresent());

	}

	/* Verify if forgotten details link is displayed */
	@Then("^I should see Forgotten details link$")
	public void i_should_see_Forgotten_details_link() {
		Assert.assertTrue(loginPage.isPopUpBoxForgottenDetialsLinkPresent());

	}

	/* Verify if Sign in button is displayed */
	@Then("^I should see SignIn Button$")
	public void i_should_see_SignIn_Button() {
		Assert.assertTrue(loginPage.isPopUpBoxSignButtonPresent());

	}

	/* Verify if NewUser link displayed */
	@Then("^I should see New User link$")
	public void i_should_see_New_User_link() {
		Assert.assertTrue(loginPage.isPopUpBoxNewUserLinkPresent());

	}

	/* Verify if Join Now button is displayed */
	@Then("^I should see Join Now Button$")
	public void i_should_see_Join_Now_Button() {
		Assert.assertTrue(loginPage.isPopUpBoxJoinNowButtonPresent());

	}

	/* Verify if close link is displayed */
	@Then("^I should see Close Incon$")
	public void i_should_see_Close_Incon() {
		Assert.assertTrue(loginPage.isPopUpBoxCloseIconPresent());
	}

	/* Verify Login Pop-up box is closed when close icon is clicked */
	@Then("^Login Pop-up box should be closed$")
	public void login_Pop_up_box_should_be_closed() {
		Assert.assertTrue(basePage.isLoginButtonPresent());

	}

	/* Verify if Login Error Message is displayed */
	@Then("^I should see Login errorMesssage Pop-up box$")
	public void i_should_see_Login_errorMesssage_Pop_up_box() {
		Assert.assertTrue(loginPage.isLoginPopUpBoxErrorMessagePresent());
	}

	/* Verify if Username is displayed */
	@Then("^I should see username as \"([^\"]*)\" present$")
	public void i_should_see_username_as_present(String username) {
		Assert.assertTrue(basePage.isUserInfoPresent());

	}

	/* Verify if Login Account Balance displayed */
	@Then("^I should see AccountBlance present$")
	public void i_should_see_AccountBlance_present() {
		Assert.assertTrue(basePage.isHomePageAccountBalancePresent());

	}

	/* Verify if Deposit is displayed */
	@Then("^I should see Depositbutton present$")
	public void i_should_see_Depositbutton_present() {
		Assert.assertTrue(basePage.isTopDepositButtonPresent());

	}
	@After("@web")
	public void afterScenario() {
		d.quit();
	}

}