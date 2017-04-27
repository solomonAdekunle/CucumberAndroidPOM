package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;
import io.appium.java_client.android.AndroidDriver;

public class BasePage {
protected AndroidDriver d;







	// Initilising the WebDriver
	public BasePage(AndroidDriver d) {
		this.d = d;
	
	}
	
		
	public void getBrowserType(String browser){
			 d.get(browser);
		 
	 }
		public void getSiteAddress(String BaseUrl){

		

		}

		public boolean isLoginButtonPresent() {
			System.out.println("Checking for Bug");
		return d.findElement(By.cssSelector(Constant.hp_Login)).isDisplayed();
		

		}

		public boolean isSupercasinoLogoPresent() {
			System.out.println("Checking for SiteLogo");
			return d.findElement(By.cssSelector(Constant.hp_SiteLogo)).isDisplayed();
		}

		public boolean isSideBarIconPresent() {
			return d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).isDisplayed();

		}

		public boolean isCasinoTabPresent() {
			return d.findElement(By.cssSelector(Constant.hp_CasinoTab)).isDisplayed();

		}

		public boolean isVegasTabPresent() {
		return d.findElement(By.cssSelector(Constant.hp_VegasTab)).isDisplayed();

		}

		public boolean isLiveTabPresent() {
			return d.findElement(By.cssSelector(Constant.hp_LiveTab)).isDisplayed();

		}

		public boolean isPromoTabPresent() {
			return d.findElement(By.cssSelector(Constant.hp_PromotionTab)).isDisplayed();

		}
		public boolean isTopDepositButtonPresent(){
			return d.findElement(By.cssSelector(Constant.hp_DepositButton)).isDisplayed();
		}
		public boolean isUserInfoPresent(){
			WebDriverWait wait= new WebDriverWait(d,20);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_UserNmaeInfo)));
			return d.findElement(By.cssSelector(Constant.hp_UserNmaeInfo)).isDisplayed();
		}
		
		public boolean isHomePageAccountBalancePresent(){
			return d.findElement(By.cssSelector(Constant.hp_AccountBalance)).isDisplayed();
		}
		
		
		
		
		
		
		public void clickLoginButton() {
		d.findElement(By.cssSelector(Constant.hp_Login)).click();

		}
		

		public void clickSideBarMenu() {

		}

		public void clickCasinoTab() {

		}

		public void clickVegasTab() {

		}

		public void clickLiveTab() {

		}

		public void clickPromosTab() {

		}
	

}
