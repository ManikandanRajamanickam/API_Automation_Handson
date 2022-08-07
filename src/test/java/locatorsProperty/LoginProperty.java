package locatorsProperty;

import javax.swing.text.html.CSS;
import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice.Return;
 

 
public class LoginProperty {
	
	@FindBy(xpath = "(//input[@value='Google Search'])[2]")	
	WebElement searchButton;
	
	@FindBy(css = "input[name='q']")	
	WebElement search;
}
