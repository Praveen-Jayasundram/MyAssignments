package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		// Initialising the WebDriver (ChromeDriver) in guest mode

		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);

		// Loading the URL

		driver.get("https://en-gb.facebook.com/");

		// Maximising the browser window

		driver.manage().window().maximize();

		// Click on the Create new account button

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// Adding implicit waitS

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Enter the First name.

		driver.findElement(By.name("firstname")).sendKeys("kadhe");

		// Enter the Surname

		driver.findElement(By.name("lastname")).sendKeys("suhi");

		// Enter the Mobile number or email address.

		driver.findElement(By.name("reg_email__")).sendKeys("jayasundram.raman@gmail.com");

		// Enter the New password

		driver.findElement(By.id("password_step_input")).sendKeys("1299728gUyd@Rk");

		// Handle all three dropdowns in Date of birth

		WebElement day = driver.findElement(By.id("day"));
		Select date = new Select(day);
		date.selectByValue("2");

		WebElement month = driver.findElement(By.id("month"));
		Select monthu = new Select(month);
		monthu.selectByIndex(1);

		WebElement year = driver.findElement(By.id("year"));
		Select yearu = new Select(year);
		yearu.selectByVisibleText("1995");

		// Select the radio button in Gender.

		driver.findElement(By.xpath("//label[text()='Male']")).click();

		driver.close();

	}

}
