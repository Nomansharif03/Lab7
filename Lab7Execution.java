package Lab7Execution;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Lab7TasksObject.Lab7TasksObject;

public class Lab7Execution {
	WebDriver driver=new ChromeDriver();
	
	Lab7TasksObject object =new Lab7TasksObject(driver);
	@BeforeTest
	public void setup() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
	}
@Test(description="Add Customer",priority=1)
	public void task1() throws Exception {
		
		
		
		object.ClickBankManager();
		object.ClickAddCustomer();
		object.ClickIstName();
		object.ClickLstName();
		object.ClickPstlCdeName();
		object.ClickAddCustomer11();
}
@Test(description="Open Account",priority=2)
public void task2() throws Exception {
	object.OpenAccount();
	object.SelectfromDropDown();
	object.SelectfromDropDown2();
	object.ClickProcesss();

}
@Test(description="Customers Login",priority=3)
public void task3() throws Exception{

   object.LogInCustomer();
   object.Tabledata();
   object.LogInAgainToPage();
   object.Customer();
}
}