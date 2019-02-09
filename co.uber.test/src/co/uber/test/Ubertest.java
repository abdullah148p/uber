package co.uber.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ubertest {
	private static WebDriver driver;

	private static String baseUrl;



	public static void main(String[] args) throws Exception {

	String username = "qa+ridertest@ridecell.com";

	String password = "123456qa";

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");


	WebDriver driver = new ChromeDriver();



	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



	driver.get("https://auth.uber.com/login/session");



	driver.manage().window().maximize();



	driver.findElement(By.id("useridInput")).sendKeys(

	"6467856739");
	
	//driver.findElement(By.className("full-width form-control radius border border-moonstone m-b-s")).sendKeys(

	//"6467856739");

	// driver.findElement(By.id("next")).click();



	//driver.findElement(By.id("password")).sendKeys("123456qa");

	//driver.findElement(By.id("loginButton")).click();



	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.className("btn btn--arrow btn--full grey")).click();



	driver.findElement(By.id("request-from")).sendKeys(

	"514 Bryant St,San Francisco,CA 94107");



	driver.findElement(By.id("request-to")).sendKeys(

	"123 Townsend St, San Francisco, CA 94107");



	driver.findElement(By.id("request-button")).click();



	System.out

	.println("RideCell Rider request sent Successfully,Searching for nearest ride available");



	driver.close();

	}



}

