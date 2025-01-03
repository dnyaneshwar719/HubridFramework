package genericUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class flipkartAutomation {
    public static void main(String[] args) {
	        // Set the path to your ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");

	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        try {
	            // Step 1: Navigate to Flipkart
	            driver.get("https://www.flipkart.com");

	            // Step 2: Handle the login pop-up (if any)
	            try {
	                WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), '✕')]")));
	                closeButton.click();
	            } catch (Exception e) {
	                System.out.println("Login pop-up not displayed.");
	            }

	            // Step 3: Click on "Mobiles"
	            WebElement mobilesLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Mobiles']")));
	            mobilesLink.click();

	            // Step 4: Click on "Electronics" (if necessary)
	            WebElement electronicsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Electronics']")));
	            electronicsLink.click();

	            // Step 5: Click on "Samsung" under Mobiles
	            WebElement samsungFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Samsung']")));
	            samsungFilter.click();

	            // Step 6: Click on "View all Latest Samsung Mobiles"
	            WebElement viewAllLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'View all Latest Samsung Mobiles')]")));
	            viewAllLink.click();

	            // Step 7: Apply Filters
	            // Filter: Customer Rating - 4 Star and Above
	            WebElement ratingFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), '4★ & above')]")));
	            ratingFilter.click();

	            // Filter: RAM - 8 GB and Above
	            WebElement ramFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), '8 GB & Above')]")));
	            ramFilter.click();

	            // Filter: Internal Storage - 256 GB and Above
	            WebElement storageFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), '256 GB & Above')]")));
	            storageFilter.click();

	            // Step 8: Sort by Price - Low to High
	            WebElement sortDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Sort By')]/following-sibling::select")));
	            sortDropdown.click();
	            WebElement lowToHighOption = driver.findElement(By.xpath("//option[text()='Price -- Low to High']"));
	            lowToHighOption.click();

	            // Step 9: Verify the first mobile is Samsung Galaxy A15 5G
	            WebElement firstMobile = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, '_4rR01T')][1]")));
	            String firstMobileName = firstMobile.getText();
	            if (firstMobileName.contains("Samsung Galaxy A15 5G")) {
	                System.out.println("Verification Passed: First mobile is Samsung Galaxy A15 5G");
	            } else {
	                System.out.println("Verification Failed: First mobile is " + firstMobileName);
	            }

	            // Step 10: Click on the Samsung Galaxy A15 5G mobile
	            firstMobile.click();

	            // Add any additional validations if required

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Step 11: Close the browser
	            driver.quit();
	        }
	    }
	}


