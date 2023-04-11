package practiceWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExcercise {

public static void main(String args[])
{
WebDriverManager.chromedriver().setup();
WebDriver driver;
ChromeOptions co = new ChromeOptions();
co.addArguments("==remote=allow=origins=*");

driver=new ChromeDriver(co);
driver.get("http://www.google.com");
driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
WebElement firstname=driver.findElement(By.id("input-firstname"));
firstname.sendKeys("pragu");
WebElement lastname=driver.findElement(By.id("input-lastname"));
lastname.sendKeys("M");
WebElement email=driver.findElement(By.id("input-email"));
email.sendKeys("pragu@gamil.com");
WebElement pwd=driver.findElement(By.id("input-password"));
pwd.sendKeys("pragu555");
WebElement yes=driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]"));
yes.click();
}
}