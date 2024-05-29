package assignments.w2d1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();

		//load the url

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//account creation
		driver.findElement(By.linkText("Create new account")).click();
		//fill in the registration form
		driver.findElement(By.name("firstname")).sendKeys("Tamizh");
		driver.findElement(By.name("lastname")).sendKeys("karthik");
		driver.findElement(By.name("reg_email__")).sendKeys("0586678048");
		driver.findElement(By.id("password_step_input")).sendKeys("ram*bal@1986");
		//drop down selection
		WebElement dropdown1 = driver.findElement(By.name("birthday_day"));
		Select date = new Select(dropdown1);
		date.selectByIndex(20);
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select month = new Select(dropdown2);
		month.selectByValue("8");
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select year = new Select(dropdown3);
		year.selectByVisibleText("1986");
		// radio button
				WebElement radiobutton = driver.findElement(By.cssSelector("[data-name='gender_wrapper']>span input[value ='1']"));
				boolean femaleSelected=radiobutton.isSelected();
				if(!radiobutton.isSelected()) {
					radiobutton.click();
				}
		driver.findElement(By.name("websubmit")).click();

}
}

