package flipkart;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FlipkartAutomation{
	
	public static void main(String[] args)
	
{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div/span/span")).click();
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]")).click();		
				driver.findElement(By.linkText("Samsung")).click();
				driver.findElement(By.xpath("https://www.flipkart.com/search?p%5B%5D=facets.brand%255B%255D%3DSamsung&sid=tyy%2F4io&sort=recency_desc&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkxhdGVzdCBTYW1zdW5nIG1vYmlsZXMgIl0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&wid=1.productCard.PMU_V2_1")).click();
				driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[1]/div/div[1]/div/section[5]/div[2]/div/div[1]/div/label/div[2]")).click();
	}
}