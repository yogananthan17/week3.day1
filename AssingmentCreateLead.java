package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentCreateLead {
	public static void main(String[] args) throws InterruptedException {
		// Launch browser
		ChromeDriver driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/login/");
		// Locate username field
		WebElement username = driver.findElement(By.id("username"));
		// Enter password as DemoSalesManager
		username.sendKeys("DemoSalesManager");
		// Locate password field
		WebElement password = driver.findElement(By.id("password"));
		// Enter password as crmsfa
		password.sendKeys("crmsfa");
		// Click on the Login button
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		// Get title of the welcome page
		String welcomePageTitle = driver.getTitle();
		System.out.println("welcomePageTitle : " + welcomePageTitle);
		// Click on the crmsfa link
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		// Get title of the MyHome page
		String HomePageTitle = driver.getTitle();
		System.out.println("HomePageTitle : " + HomePageTitle);
		// Click on the leads tab
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();
		Thread.sleep(3000);
		// Click on the create lead
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		Thread.sleep(3000);
		// Enter companyName as TestLeaf
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testleaf");
		// Enter firstName as Ravi
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Yoga");
		// Enter lastName as Yoga
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Nanthan");
		// Enter firstName(local) as Nanthan
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Yoga");
		// Enter departmentName as Testing
		WebElement departmentName = driver.findElement(By.name("departmentName"));
		departmentName.sendKeys("Testing");
		Thread.sleep(3000);
		// Enter description as 5 years Experienced
		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("5 years Experienced");
		Thread.sleep(3000);
		// Enter email address as yogananthan877866@gmail.com
		WebElement emailID = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailID.sendKeys("yogananthan@877866@gmail.com");
		Thread.sleep(3000);
		// Click on the createLead button
		WebElement createLeadButton = driver.findElement(By.linkText("Create Lead"));
		createLeadButton.click();
		Thread.sleep(5000);
		// To close the window
		driver.close();
	}
	

}
