package ObjectRepos;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(xpath="")private WebElement untxt;
	@FindBy(xpath="")private WebElement pwdtxt;
	@FindBy(xpath="")private WebElement loginBtn;
	
	//initialization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
	}
	//utilization(getters)

	public WebElement getUntxt() {
		return untxt;
	}

	public WebElement getPwdtxt() {
		return pwdtxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

		
	}

