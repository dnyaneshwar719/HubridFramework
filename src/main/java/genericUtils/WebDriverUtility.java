package genericUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	/**
	 * author Mr Rajkumar
	 * it is used to maximize browsers window
	 * @param driver
	 */
public void maximizewindow(WebDriver driver) {
	driver.manage().window().maximize();
}
/**
 * author Mr Rajkumar
 * it is used to minimize browsers window
 * @param driver
 */
public void minimizewindow(WebDriver driver) {
driver.manage().window().minimize();
}
/**
 * author Mr Rajkumar
 * it is used for implicitly wait
 * @param driver
 */
public void waitForPageLoad(WebDriver driver) {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
public void handleDD(WebElement element,int index) {
	Select s=new Select(element);
	s.selectByIndex(index);	
}
public void handleDD(String value,WebElement element) {
	Select s=new Select(element);
	s.selectByValue(value);	
}
public void handleDD(WebElement element,String visibleText) {
	Select s=new Select(element);
	s.selectByVisibleText(visibleText);	
}
public void mouseoverToElement(WebDriver driver,WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
}
public void rightClickpage(WebDriver driver) {
	Actions a=new Actions(driver);
	a.contextClick();
}
public void rightClickonelement(WebDriver driver,WebElement ele ) {
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
}
public void doubleClickAction(WebDriver driver) {
	Actions a=new Actions(driver);
	a.doubleClick().perform();
}
public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src,dest);
}
/**
 * @author Ankush
 * it is used to handle frame
 */
public void switchtoParentFrame(WebDriver driver) {
	driver.switchTo().parentFrame();
}
/**
 * @author Ankush
 * it is used to handle frame
 */
public void switchtodefaultFrame(WebDriver driver) {
	driver.switchTo().defaultContent();
}
/**
 * @author Ankush
 * it is used to handle frame
 */
public void switchtoFrameusingIdorNmae(WebDriver driver,String idOrNmae) {
	driver.switchTo().frame(idOrNmae);
}
/**
 * @author Ankush
 * it is used to handle the popup to click on ok button
 */
public void acceptAlert(WebDriver driver) {
	driver.switchTo().alert().accept();
}
/**
 * @author Ankush
 * it is used to handle the popup to click on cancel button
 */
public void dismissAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();;
}
/**
 * @author Ankush
 * it is used to handle the popup to get the text on alert popup
 */
public void getTextOnAlert(WebDriver driver) {
	driver.switchTo().alert().getText();
}
/**
 * @author Ankush
 * it is used to handle the scrolling mechanism
 */
public void handleScroll(WebDriver driver) {
JavascriptExecutor jse=(JavascriptExecutor)driver;	
jse.executeScript("window.scrollBy(0,2000);");
}
/**
 * @author Ankush
 * it is used to take the screenshot 
 * @throws Throwable 
 */
public String takeScreenshot(WebDriver driver,String SCNAME) throws Throwable {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./"+SCNAME+"\\.png");
	 Files.copy(src, dest);
	return dest.getAbsolutePath();
}
/**
 * @author Ankush
 * it is used to get the title of webpage
 */
public String gettitleofwebpage(WebDriver driver) {
	return driver.getTitle();
}
}

