package assignments.w2d1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Accountcreation {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();

		//load the url

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

	//to find the element in the dom-> findElement


	//to enter the value in the text field-sendKeys
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

	//to enter the password

	driver.findElement(By.id("password")).sendKeys("crmsfa");

	//By classname

	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();	
	driver.findElement(By.id("accountName")).sendKeys("TBalakri");
	
		WebElement dropdown1 = driver.findElement(By.name("industryEnumId"));
	Select opt1 = new Select(dropdown1);
	opt1.selectByIndex(3);
	WebElement dropdown2 = driver.findElement(By.name("ownershipEnumId"));
	Select opt2 = new Select(dropdown2);
	opt2.selectByVisibleText("S-Corporation");
	WebElement dropdown3 = driver.findElement(By.name("dataSourceId"));
	Select opt3 = new Select(dropdown3);
	opt3.selectByValue("LEAD_EMPLOYEE");
	WebElement dropdown4 = driver.findElement(By.name("marketingCampaignId"));
	Select opt4 = new Select(dropdown4);
	opt4.selectByIndex(6);
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	WebElement dropdown5 = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select opt5 = new Select(dropdown5);
	opt5.selectByValue("TX");
	driver.findElement(By.className("smallSubmit")).click();
	Thread.sleep(5000);

	System.out.println("Account created Successfully");
	driver.close();

	
	
}
}

