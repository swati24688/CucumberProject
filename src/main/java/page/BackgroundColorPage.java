package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BackgroundColorPage {

	WebDriver driver;

	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;

	}

	
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']")
	WebElement skyBlueElement;
	
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']")
	WebElement setWhiteElement;
	
	@FindBy(how = How.TAG_NAME,  tagName = "body")
	WebElement pageBody;

	public void setSkyBlueBackground() {
		skyBlueElement.click();

	}

	public void setWhiteBackground() {
		setWhiteElement.click();
	}
	
	public String background() {
		String backcolor = pageBody.getCssValue("background-color");
		String bcolor = Color.fromString(backcolor).asHex();	
		return bcolor;
  }
}
