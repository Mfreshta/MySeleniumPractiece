package dynamicElements;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jamil_HomeWork {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		WebElement mp3 = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		mp3.click();
		WebElement showAll = driver.findElement(By.xpath("//a[text()='Show All MP3 Players']"));
		showAll.click();
		WebElement ipodTuch = driver.findElement(By.xpath("//a[text()='iPod Touch']"));
		ipodTuch.click();
		WebElement addToCart = driver.findElement(By.xpath("//button[@id='button-cart']"));
		addToCart.click();
		
	
		
		
		

	}

}
