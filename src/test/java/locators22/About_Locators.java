package locators22;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class About_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Chaitanya, Ambica, Yashvir, Dhiyanshi got settled in IRELAND");

		// ChromeDriver driver = new ChromeDriver();
		// (or) The recommended one is the below one
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(options); // For Chrome browser
		// WebDriver driver = new EdgeDriver(); // For Edge browser

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		// name
		driver.findElement(By.name("search")).sendKeys("Mac");

		// id
		boolean isLogoExists = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println("Is logo of the website present :" + isLogoExists);

		// Link Text & Partial Link Text
		
		

		driver.quit();

	}

}
