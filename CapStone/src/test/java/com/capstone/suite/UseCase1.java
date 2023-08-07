package com.capstone.suite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseCase1 {

	WebDriver driver;

	@BeforeClass
	public void beforeclass() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hcltech.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();

	}

	@AfterClass
	public void afterclass() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();

	}

	@Test
	public void HandlingMenuItems() throws InterruptedException {

		List<WebElement> AllMenuNames = driver.findElements(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li/a"));
		int CountofAllMenus = AllMenuNames.size();
		System.out.println("Total No.of Menus = " + CountofAllMenus);

		WebElement DigitalMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[1]"));
		String MenuName1 = DigitalMenu.getText();
		System.out.println("Name of the Menu is " + MenuName1);

		WebElement EngineeringMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[2]"));
		String MenuName2 = EngineeringMenu.getText();
		System.out.println("Name of the Menu is " + MenuName2);

		WebElement CloudMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[3]"));
		String MenuName3 = CloudMenu.getText();
		System.out.println("Name of the Menu is " + MenuName3);

		WebElement AIMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[4]"));
		String MenuName4 = AIMenu.getText();
		System.out.println("Name of the Menu is " + MenuName4);

		WebElement ServiceMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[5]"));
		String MenuName5 = ServiceMenu.getText();
		System.out.println("Name of the Menu is " + MenuName5);
		ServiceMenu.click();

		List<WebElement> MenuItems5 = driver
				.findElements(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li/ul/li/ul/li"));
		int Count5 = MenuItems5.size();
		System.out.println("No.of ServiceMenu Items = " + Count5);
		for (WebElement List : MenuItems5) {
			String ListNames5 = List.getText();
			System.out.println(ListNames5);

		}

		WebElement IndustriesMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[6]"));
		String MenuName6 = IndustriesMenu.getText();
		System.out.println("Name of the Menu is " + MenuName6);
		IndustriesMenu.click();

		List<WebElement> MenuItems6 = driver
				.findElements(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[6]/ul/li/a"));
		int Count6 = MenuItems6.size();
		System.out.println("No.of Industries Menu Items = " + Count6);
		for (WebElement List : MenuItems6) {
			String ListNames6 = List.getText();
			System.out.println(ListNames6);

		}

		WebElement EcoSystemMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[7]/a"));
		String MenuName7 = EcoSystemMenu.getText();
		System.out.println(MenuName7);

		WebElement AboutUsMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[8]"));
		String MenuName8 = AboutUsMenu.getText();
		System.out.println(MenuName8);
		AboutUsMenu.click();

		List<WebElement> MenuItems8 = driver
				.findElements(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[8]/ul/li/a"));
		int Count8 = MenuItems8.size();
		System.out.println("No.of AboutUs Menu Items = " + Count8);
		for (WebElement List : MenuItems8) {
			String ListNames8 = List.getText();
			System.out.println(ListNames8);

		}

		WebElement TrendsandInsightsMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[9]"));
		String MenuName9 = TrendsandInsightsMenu.getText();
		System.out.println("Name of the Menu is " + MenuName9);
		TrendsandInsightsMenu.click();

		List<WebElement> MenuItems9 = driver
				.findElements(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[9]/ul/li/a"));
		int Count9 = MenuItems9.size();
		System.out.println("No.of TrendsandInsight Menu Items = " + Count9);
		for (WebElement List : MenuItems9) {
			String ListNames9 = List.getText();
			System.out.println(ListNames9);

		}

		WebElement CareersMenu = driver.findElement(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[10]"));
		String MenuName10 = CareersMenu.getText();
		System.out.println("Name of the Menu is " + MenuName10);
		CareersMenu.click();

		List<WebElement> MenuItems10 = driver
				.findElements(By.xpath("//*[@id=\"block-mainnavigationbt\"]/li[10]/ul/li/a"));
		int count10 = MenuItems10.size();
		System.out.println("No.of Careers Menu Items = " + count10);
		for (WebElement List : MenuItems10) {
			String ListNames10 = List.getText();
			System.out.println(ListNames10);

		}

	}

}
