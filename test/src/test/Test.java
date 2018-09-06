package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String[] args) {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "src/chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 * driver.get("http://www.google.com");
		 * //System.out.println(driver.getPageSource());
		 * 
		 * String filePath = "./page/hello.txt"; File file = new File(filePath);
		 * 
		 * try { if (!file.exists()) { file.createNewFile(); }
		 * 
		 * FileWriter fileWriter = new FileWriter(filePath); BufferedWriter bw =
		 * new BufferedWriter(fileWriter); bw.write(driver.getPageSource());
		 * bw.close();
		 * 
		 * } catch (IOException e) {
		 * 
		 * }
		 * 
		 * driver.close();
		 */

		dropDown();

	}

	public static void dropDown() {
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement element = driver.findElement(By.id("select-demo"));
		// driver.navigate().forward();
		// driver.navigate().back();
		Point location = element.getLocation();
		System.out.println(location.getX());
		System.out.println(location);

		String attribute = element.getAttribute("offsetTop");
		System.out.println(attribute + "---");
		System.out.println(element.getAttribute("offsetLeft"));
		System.out.println(element.getAttribute("offsetRight"));
		Select dd = new Select(element);
		// List<WebElement> options = dd.getOptions();
		// for(WebElement ele : options){
		// System.out.println("inner text: "+ ele.getText());
		// System.out.println("value : "+ ele.getAttribute("value"));
		// }

		WebElement inputForms = driver.findElement(By.xpath("//a[contains(text(),'Input Forms')]"));
		System.out.println(inputForms.getAttribute("offsetTop"));
		System.out.println(inputForms.getAttribute("offsetLeft"));
		System.out.println(inputForms.getSize());
		System.out.println(inputForms.getLocation());
		System.out.println(inputForms.getCssValue("color").toString());

		WebElement other = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		System.out.println(other.getAttribute("offsetTop"));
		System.out.println(other.getAttribute("offsetLeft"));
		System.out.println(other.getSize());
		System.out.println(other.getLocation());
		System.out.println(other.getCssValue("color").toString());
		System.out.println(Color.fromString(other.getCssValue("color")).asHex());
		System.out.println(other.getCssValue("background-color"));
		System.out.println(other.getCssValue("text-decoration"));

		WebElement table = driver.findElement(By.xpath("//a[contains(text(),'Table')]"));
		System.out.println(table.getAttribute("offsetTop"));
		System.out.println(table.getAttribute("offsetLeft"));
		System.out.println(table.getSize());
		System.out.println(table.getLocation());
		System.out.println(Color.fromString(table.getCssValue("color")).asHex());
		System.out.println(table.getCssValue("background-color"));
		System.out.println(table.getCssValue("text-decoration"));

		driver.navigate().to("https://www.google.com/");
		WebElement telugu = driver.findElement(By.xpath("//div[@id='SIvCob']/a[3]"));
		System.out.println(telugu.getAttribute("offsetTop"));
		System.out.println(telugu.getAttribute("offsetLeft"));
		System.out.println(telugu.getSize());
		System.out.println(telugu.getLocation());
		System.out.println(Color.fromString(telugu.getCssValue("color")).asHex());
		System.out.println(telugu.getCssValue("background-color"));
		System.out.println(telugu.getCssValue("text-decoration"));
	}

}
