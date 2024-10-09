package pkg.FirstTestCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class HelloIreland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Chaitanya, Ambica, Yashvir, Dhiyanshi got settled in IRELAND");

		// ChromeDriver driver = new ChromeDriver();
		// (or) The recommended one is the below one
		WebDriver driver = new ChromeDriver(); // For Chrome browser
		// WebDriver driver = new EdgeDriver(); // For Edge browser

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String pagetitle = driver.getTitle();
		System.out.println("The page title is : " + pagetitle);

		if (pagetitle.equals("Your Store")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		driver.quit();

	}

}
