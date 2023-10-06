package Week4.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Naveen");
		driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("NaveenKumar");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Thangavel");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Electronics and Communication");
		driver.findElement(By.id("createContactForm_description")).sendKeys("To study about circuits");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement find = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select element=new Select(find);
		element.selectByVisibleText("Georgia");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Form");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text = driver.findElement(By.id("sectionHeaderTitle_contacts")).getText();
		System.out.println(text);
	}

}
