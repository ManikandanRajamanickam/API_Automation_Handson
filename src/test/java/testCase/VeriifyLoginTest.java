package testCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import basePageUtility.BasePage;
import io.netty.util.Timeout;
import locatorsProperty.LoginProperty;

import org.testng.annotations.Test;


public class VeriifyLoginTest extends LoginProperty{
 
	BasePage base;
	LoginProperty login;
	
  @Test(priority = 1)
  public void loadPage() {
	  	base.load("https://opensource-demo.orangehrmlive.com/");
  }
  
  @Test(priority = 2)
  public void loginMethod() {
 	  base.enter(base.returnxpathLocator("//*[@id='divUsername']"), "Admin");
 	  base.enter(base.returnxpathCss("input[id='txtPassword']"), "admin123 ");
 	  base.click(base.returnidLocator("divLoginButton"));
  }
 
}
