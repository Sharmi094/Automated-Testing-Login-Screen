package LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUnsuccessful {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		   driver.get("https://app.germanyiscalling.com/");
		 WebElement a =  driver.findElement(By.name("username"));
		    a.sendKeys("sharmikutty094@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("1234567");
		  driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();

	}

}
