package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String [] args){
		
	/*	System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//System.out.println(driver.getPageSource());

		String filePath = "./page/hello.txt";
		File file = new File(filePath);

		try {
			if (!file.exists()) {
				file.createNewFile();
			} 
			
			FileWriter	fileWriter = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write(driver.getPageSource());
			bw.close();
			
		} catch (IOException e) {
			
		}

		driver.close();*/
		
		dropDown();
		
	}
	
	public static void dropDown(){
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement element = driver.findElement(By.id("select-demo"));
		driver.navigate().forward();
		//driver.navigate().back();
		Select dd = new Select(element);
		List<WebElement> options = dd.getOptions();
		for(WebElement ele : options){
			System.out.println("inner text: "+ ele.getText());
			System.out.println("value : "+ ele.getAttribute("value"));
		}
		
		
	}

}
