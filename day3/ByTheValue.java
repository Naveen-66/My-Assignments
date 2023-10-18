package Week6.day3;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByTheValue {
public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://buythevalue.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='grid-image']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("600041");
	driver.findElement(By.xpath("//input[@value='Check']")).click();
	driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//span[text()='View Cart']")).click();
	driver.findElement(By.xpath("//input[@value='Check Out']")).click();
	Alert buy = driver.switchTo().alert();
	Thread.sleep(3000);
	buy.accept();
	driver.close();
}
}
