package Lab7TasksObject;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lab7TasksObject {
	
	WebDriver driver;
	Logger logger = Logger.getLogger("Lab7TasksObject");
	 public Lab7TasksObject(WebDriver d){
		driver=d;
		PageFactory.initElements(d,this);
		}
	@FindBy(xpath="//button[@ng-click='manager()']")
	WebElement ClickBankManagerLogin;
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	WebElement ClickAddCustomer1;
	
	@FindBy(xpath="//input[@ng-model='fName']")
	WebElement ClickFirstName;
	
	@FindBy(xpath="//input[@ng-model='lName']")
	WebElement ClickLastName;
	
	
	@FindBy(xpath="//input[@ng-model='postCd']")
	WebElement ClickPostCode;

	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement ClickAddCustomer2;
	

	@FindBy(xpath="//button[@ng-class='btnClass2']")
	WebElement ClickOpenAccount;
	
	@FindBy(xpath="//select[@id = \"userSelect\"]")
	WebElement dropdown1;
	
	
	@FindBy(xpath="//select[@id='currency']")
	WebElement dropdown2;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ClickProcess;
	@FindBy(xpath="//button[@ng-click='customer()']")
	WebElement clickcustomerlogin3;
	
	@FindBy(xpath="//button[contains(text(),'Deposit')]")
	WebElement depositamount;
	
	@FindBy(xpath="//input[@type='number' and @placeholder='amount']")
	WebElement amounttobedeposited;
	
	@FindBy(xpath="//button[@type='submit' and @class='btn btn-default']")
	WebElement depositAgain;
	
	@FindBy(xpath="//button[@class='btn btn-lg tab' and @ng-click='withdrawl()']")
	WebElement withdrawAmount;
	
	@FindBy(xpath="//input[@type='number' and @placeholder='amount']")
	WebElement amounttobewithdraw;
	
	@FindBy(xpath="//button[@type='submit' and @class='btn btn-default']")
	WebElement withdrawAmountAgain;
	
	
	@FindBy(xpath="//button[@ng-class='btnClass1' and @class='btn btn-lg tab']")
	WebElement transactionofamount;
	
	@FindBy(xpath="//table[@class='table table-bordered table-striped']")
	WebElement DatainTable;
	
	
	@FindBy(xpath="//button[@class='btn' and @ng-show='showDate']")
	WebElement resetthedata;
	
	@FindBy(xpath="//button[@class='btn logout' and @ng-show='logout']")
	WebElement logoutfrompage;
	
	@FindBy(xpath="//button[@ng-class='btnClass3']")
	WebElement customers;
	
	@FindBy(xpath="//button[@ng-click='deleteCust(cust)']")
	WebElement deletethedata;
	
	@FindBy(xpath="//button[@class='btn btn-default' and @type='submit' ]")
	WebElement login;
	@FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
	WebElement loginSeconedTime;
	@FindBy(xpath="//input[@type='text']")
	WebElement WriteTheText;
	
	@FindBy(xpath="//input[@id='start']")
	WebElement date;
	
	@FindBy(xpath="//input[@id='end']")
	WebElement date1;
	
	@FindBy(xpath="//button[@ng-click=\"home()\"]")
	WebElement homebutton;
	
public void ClickBankManager() throws Exception {
	Thread.sleep(2000);
	ClickBankManagerLogin.click();
	logger.info("BankManager is Clicked");
	
}
public void ClickAddCustomer() throws Exception {
	Thread.sleep(2000);
    ClickAddCustomer1.click();
    logger.info("AddCustomer is Clicked");
}
public void ClickIstName() throws Exception {
	Thread.sleep(2000);
	ClickFirstName.sendKeys("Noman");
	logger.info("First Name is Clicked");
}
public void ClickLstName() throws Exception {
	Thread.sleep(2000);
	ClickLastName.sendKeys("Sharif");
	logger.info("Last Name is Clicked");
}
public void ClickPstlCdeName() throws Exception {
	Thread.sleep(2000);
	ClickPostCode.sendKeys("42000");
	logger.info("Postal Code  is Clicked");
}
public void ClickAddCustomer11() throws Exception {
	Thread.sleep(2000);
    ClickAddCustomer2.click();
    Alert alert1=driver.switchTo().alert();
	alert1.accept();
	logger.info("Alert  is Accepted");
}
public void OpenAccount() throws Exception {
	Thread.sleep(2000);
	ClickOpenAccount.click();
	logger.info("Account is Clicked");
	
	
}
public void SelectfromDropDown() throws Exception {
	Thread.sleep(2000);
	dropdown1.click();
	logger.info("dropdown is Clicked");
	Thread.sleep(2000);
	Select select= new Select(dropdown1);

	select.selectByVisibleText("Noman Sharif");
	logger.info("Name is Selected");
	Thread.sleep(2000);
	}
	
public void SelectfromDropDown2() throws Exception {
	dropdown2.click();
	logger.info("dropdown is Clicked");
	Thread.sleep(2000);
	Select select2= new Select(dropdown2);
	select2.selectByVisibleText("Dollar");
	logger.info("Name is Selected");
	Thread.sleep(2000);
	
	}
public void ClickProcesss() throws Exception {
	Thread.sleep(2000);
	ClickProcess.click();
	logger.info("ClickProcess is Clicked");
	 Alert alert2=driver.switchTo().alert();
		alert2.accept();
		logger.info("Alert is Accpeted");	
}
public void LogInCustomer() throws InterruptedException {
	Thread.sleep(2000);
	homebutton.click();
	logger.info("homebutton is Clicked");
	Thread.sleep(2000);
	clickcustomerlogin3.click();
	logger.info("clickcustomerlogin3 is Clicked");
	Thread.sleep(2000);
	Select select= new Select(dropdown1);
	logger.info("dropdown is Clicked");
	select.selectByVisibleText("Noman Sharif");
	Thread.sleep(2000);
	login.click();
	logger.info("LogIn is Clicked");
	Thread.sleep(2000);
	depositamount.click();
	logger.info("Depositamount is Clicked");
	Thread.sleep(2000);
	amounttobedeposited.sendKeys("5000");
	logger.info("amounttobedeposited is Clicked");
	Thread.sleep(2000);
	depositAgain.click();
	logger.info("depositagain is Clicked");
	Thread.sleep(2000);
	withdrawAmount.click();
	Thread.sleep(3000);
	amounttobewithdraw.sendKeys("2000");
	Thread.sleep(4000);
	withdrawAmountAgain.click();
	logger.info("withdrawAmountAgain is Clicked");
	Thread.sleep(4000);
	transactionofamount.click();
	logger.info("transactionofamount is Clicked");
	Thread.sleep(2000);
}
public void Tabledata() throws Exception {
	
	List<WebElement> rows=DatainTable.findElements(By.tagName("tr"));
		List<WebElement> headings=DatainTable.findElements(By.tagName("th"));
		for(int i=0;i<headings.size();i++) {
			System.out.print(headings.get(i).getText()+"  ");
			
		}
		for(int i=0;i<rows.size();i++) {
			List<WebElement>  coloms= rows.get(i).findElements(By.tagName("td"));
			
			for(int j=0;j<coloms.size();j++) {
				System.out.print(coloms.get(j).getText()+"  ");
			}
			System.out.println("  ");
		}
		Thread.sleep(2000);
		resetthedata.click();
		logger.info("resetthedata is Clicked");
		Thread.sleep(2000);
		logoutfrompage.click();
		logger.info("logoutfrompage is Clicked");
}


public void LogInAgainToPage() throws InterruptedException{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(homebutton));
		homebutton.click();
		logger.info("homebutton is Clicked");
	wait.until(ExpectedConditions.visibilityOf(loginSeconedTime));
	loginSeconedTime.click();
	logger.info("loginSeconedTime is Clicked");
	Thread.sleep(2000);
}
public void Customer() throws Exception {
	customers.click();
	logger.info("customers is Clicked");
	Thread.sleep(2000);
	WriteTheText.sendKeys("Noman");
	logger.info("Text is Sent");
	Thread.sleep(2000);
	WriteTheText.sendKeys(Keys.ENTER);
	logger.info("Text is Entered");
	Thread.sleep(2000);
	deletethedata.click();
	logger.info("Data is Deleted");
	Thread.sleep(2000);
	WriteTheText.clear();
	logger.info("Data is Cleared");
	driver.close();

	
}
}

