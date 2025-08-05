package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {

		// Initialising the WebDriver (ChromeDriver) in guest mode

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// Loading the URL

		driver.get("http://leaftaps.com/opentaps/");

		// Maximising the browser window

		driver.manage().window().maximize();

		// Enter a username and password.

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		// Click the "Login" button

		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the "CRM/SFA" link

		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on the "Accounts" tab.

		driver.findElement(By.linkText("Accounts")).click();

		// Click on the "Create Account" button.

		driver.findElement(By.linkText("Create Account")).click();

		// Enter an account name and description as "Selenium Automation Tester."

		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Testerr");

		// Select "ComputerSoftware" as the industry

		WebElement industry = driver.findElement(By.xpath("(//select[@class='inputBox'])[2]"));
		Select dropdown = new Select(industry);
		dropdown.selectByVisibleText("Computer Software");

		// Select "S-Corporation" as ownership using SelectByVisibleText.

		WebElement ownership = driver.findElement(By.xpath("(//select[@class='inputBox'])[3]"));
		Select dropdown2 = new Select(ownership);
		dropdown2.selectByVisibleText("S-Corporation");

		// Select "Employee" as the source using SelectByValue.

		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select dropdown3 = new Select(source);
		dropdown3.selectByValue("LEAD_EMPLOYEE");

		// Select "eCommerce Site Internal Campaign" as the marketing campaign using
		// SelectByIndex

		WebElement marketingCampaign = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select dropdown4 = new Select(marketingCampaign);
		dropdown4.selectByIndex(6);

		// Select "Texas" as the state/province using SelectByValue.

		WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select dropdown5 = new Select(state);
		dropdown5.selectByValue("TX");

		// Click the "Create Account" button

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		// Verify that the account name is displayed correctly

		String accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		if (accountName.contains("Selenium Automation Testerr")) {
			System.out.println("Account name verified:" + " " + accountName);
		} else {
			System.out.println("Account name is incorrect");
		}

		// Close the browser window

		driver.close();

	}

}
