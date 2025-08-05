package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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

		// Click on the "Leads" tab

		driver.findElement(By.linkText("Leads")).click();

		// Click on the "Create Lead" button

		driver.findElement(By.linkText("Create Lead")).click();

		// Enter a FirstName

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ms");

		// Enter a LastName

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tester");

		// Enter a CompanyName

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		// Enter a Title

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation tester");

		// Click the "Create Lead" button

		driver.findElement(By.className("smallSubmit")).click();

		// Verify that the Title is displayed correctly

		String title = driver.findElement(By.xpath("(//span[@class='tabletext'])[11]")).getText();

		if (title.contains("Automation tester")) {
			System.out.println("Title verified: " + " " + title);
		} else {
			System.out.println("Title is incorrect");
		}

		// closing the browser

		driver.close();

	}

}
