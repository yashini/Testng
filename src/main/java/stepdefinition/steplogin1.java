package stepdefinition;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import accessexcel.accessprptyexcel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class steplogin1 {
	
	static WebDriver dr;
	String data[][];
	@Given("^user is on Demo Site Testing page$")
	public void login() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyadharshini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//dr = new ChromeDriver();
		DesiredCapabilities ca = DesiredCapabilities.chrome();
		dr= new RemoteWebDriver(new URL("http://192.168.1.32:4444/wd/hub"), ca);
		data = accessprptyexcel.getDataFromExcel("testdataworkbook-hdf.xls", "testdata");
	}
	@When("^user launch app with URL$")
	public void launch()
	{
		dr.manage().window().maximize();
		dr.get("http://demo.automationtesting.in");
	}
	
	@When("^user clicks on skip sign in$")
	public void skip()
	{
		dr.findElement(By.xpath("//button[@id='btn2']")).click();
	}
	@When("^user is on Automation Demo Site page$")
	public void verify()
	{
		String a= dr.getCurrentUrl();
		String b= dr.getTitle();
		System.out.println(a);
		System.out.println(b);
	}
	@When("^Enter as \"(.*)\" into firstname$")
	public void first(String name)
	{
		dr.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(name);;
	}
	
	@When("^enter text for name field$")
	public void register() throws InterruptedException
	{
		for (int i=1;i<data.length;i++)
		  {
			  Thread.sleep(2000);
			  //dr.findElement(By.xpath("//button[@id='btn2']")).click();
			  dr.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(data[i][1]);
			  dr.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(data[i][2]);
			  dr.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(data[i][3]);
			  dr.findElement(By.xpath("//input[@type='email']")).sendKeys(data[i][4]);
			  dr.findElement(By.xpath("//input[@type='tel']")).sendKeys(data[i][5]);
			  dr.navigate().refresh();
			 // dr.findElement(By.xpath("//input[@type='radio']")).sendKeys(data[i][6]);
			  //dr.findElement(By.xpath("//select[@id='countries']")).sendKeys(data[i][7]);
			  //takesscreenshot.screenshot(dr);  
		  }
		  
	  }
	
	
	@When("^Close the browser$")
	public void close()
	{
		dr.close();
	}
	
	

}
