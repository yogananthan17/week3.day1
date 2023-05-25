package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssingmentFaceBookId {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Step 4: Maximize the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 6: Click on Create New Account button
		WebElement newAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		newAccount.click();

		// Step 7: Enter the first name
		WebElement firstName = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		firstName.sendKeys("Yoga");

		// Step 8: Enter the last name
		WebElement surName = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		surName.sendKeys("Nanthan");

		// Step 9: Enter the mobile number
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("8778664535");

		// Step 10: Enter the password
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("Yoga17");

		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select dayInput = new Select(day);
		dayInput.selectByValue("17");

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select monthInput = new Select(month);
		monthInput.selectByIndex(6);

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearInput = new Select(year);
		yearInput.selectByVisibleText("2000");

		// Step 12: Select the radio button "male"
		// ( A normal click will do for this step)
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='2']"));
		radioButton.click();

		Thread.sleep(10000);
		driver.close();
		


	}

}
