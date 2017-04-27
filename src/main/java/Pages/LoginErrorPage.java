package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;
import io.appium.java_client.android.AndroidDriver;

public class LoginErrorPage extends BasePage {

	public LoginErrorPage(AndroidDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public void sendUseraname(String username) {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBoxUsername)));
		d.findElement(By.cssSelector(Constant.LoginPopUpBoxUsername)).sendKeys(username);

	}

	public void sendPassword(String password) {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopBoxPassword)));
		d.findElement(By.cssSelector(Constant.LoginPopBoxPassword)).sendKeys(password);

	}

	public void clickSigninButton() {
		WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBox)));
		d.findElement(By.cssSelector(Constant.LoginPopBoxSignin)).click();
}
}