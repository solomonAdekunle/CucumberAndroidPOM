package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends BasePage {

	public LoginPage(AndroidDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public boolean isLoginPopUpBoxPresend() {
		WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBox)));
		return d.findElement(By.cssSelector(Constant.LoginPopUpBox)).isDisplayed();

	}

	public boolean isPopUpBoxSupercasinoLogoPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopUpBox_SiteLog)).isDisplayed();

	}

	public boolean isPopUpBoxUsernameInputBoxPresent() {
		
		return d.findElement(By.cssSelector(Constant.LoginPopBoxNewUser)).isDisplayed();

	}

	public boolean isPopUpBoxPasswordInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxPassword)).isDisplayed();

	}

	public boolean isPopUpBoxSignButtonPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxSignin)).isDisplayed();

	}

	public boolean isPopUpBoxForgottenDetialsLinkPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxForgottenDetailsLink)).isDisplayed();

	}

	public boolean isPopUpBoxNewUserLinkPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxNewUser)).isDisplayed();

	}

	public boolean isPopUpBoxJoinNowButtonPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxJoinNow)).isDisplayed();

	}
	public boolean isPopUpBoxCloseIconPresent(){
		return d.findElement(By.cssSelector(Constant.LoginPopUpBoxCloseIcon)).isDisplayed();
	}
   public boolean isLoginPopUpBoxErrorMessagePresent(){
	   WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBoxErrorMessage)));
	return d.findElement(By.cssSelector(Constant.LoginPopUpBoxErrorMessage)).isDisplayed();
	   
   }
	public void sendUseraname(String username) {
//		WebDriverWait wait = new WebDriverWait(d,30);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBox)));
		d.findElement(By.cssSelector(Constant.LoginPopUpBoxUsername)).sendKeys(username);

	}

	public void sendPassword(String password) {
//		WebDriverWait wait = new WebDriverWait(d,30);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBox)));
		d.findElement(By.cssSelector(Constant.LoginPopBoxPassword)).sendKeys(password);

	}

	public void clickSigninButton() {
		WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBox)));
		d.findElement(By.cssSelector(Constant.LoginPopBoxSignin)).click();

	}

	public void clickForgottenDetailsLink() {
		d.findElement(By.cssSelector(Constant.LoginPopBoxForgottenDetailsLink)).click();

	}

	public void clickJoinNowButton() {
		d.findElement(By.cssSelector(Constant.LoginPopBoxJoinNow)).click();

	}

	public void clickLoginBoxCloseIcon() {
		System.out.println("Am closing the Pop-up");
		WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBoxCloseIcon)));
		System.out.println("Am closing the Pop-up Box");
		d.findElement(By.cssSelector(Constant.LoginPopUpBoxCloseIcon)).click();
	}
	
}
