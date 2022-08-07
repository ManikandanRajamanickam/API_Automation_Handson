package basePageUtility;

import java.util.ArrayList;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v101.page.Page;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	static WebDriver driver;
	static WebDriverWait Wait;
	static JavascriptExecutor  js;
	
	@BeforeTest 
	public void driverinit(String browser) {
		
		//WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\MANI_QA_FILES\\Chrome_Driver\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized"); // open Browser in maximized mode
//		options.addArguments("disable-infobars"); // disabling infobars
//		options.addArguments("--disable-extensions"); // disabling extensions
//		options.addArguments("--disable-gpu"); // applicable to windows os only
//		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//		options.addArguments("--no-sandbox"); // Bypass OS security model
//		driver = new ChromeDriver(options);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	

	@AfterTest
	public void test1(String element) {
		//driver.close();
	}	
	
	
	public void click(WebElement element) {
		 scrollToElement(element);
		 element.click();
	}	
 
	public void enter(WebElement element,  String text) {
		 scrollToElement(element);
		 element.clear();
		 element.sendKeys(text);
	}	

	public void scrollToElement(WebElement element) {
			js.executeScript("arguments[0].scrollIntoView(true)");
	}	
	
	public WebElement returnxpathLocator(String element) {
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
	}	

	public WebElement returnxpathCss(String element) {
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
		 
	}	

	public WebElement returnidLocator(String element) {
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
	 
	}	

	public WebElement returnnameSelector(String element) {
		return Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(element)));
		 
	}	

	public void openNewTab() {
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	
	public void load(String url) {
		String title = driver.getCurrentUrl();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
}
