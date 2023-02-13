package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.data.SoleClientaFinancialSol_SC89933_Obj;
import com.stepchange.atf.testdata.SoleClientFinancialSolutionsTestData;
import com.stepchange.atf.utilities.AAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends Control{
	private TextField Username;
	private TextField password;

	private TextField Uname;
	private TextField Pswd;
	private Button LoginBtn;
	private Button LaunchPortal;
	private Button AdvisorPortal;
	private Button TroubleLoggingIn;
	private String TroubleLoggingInText ="Trouble logging in?";

	private SoleClientaFinancialSol_SC89933_Obj personalDetailsData;


	 public String UName ="yakub.pasha@aaseya.com"; public String PWD="Welcome@123";

	
	public TextField getUsername() {
		return Username;
	}

	public TextField getPassword() {
		return password;
	}

	public Button getLoginBtn() {
		return LoginBtn;
	}
	public Button getTroubleLoggingIn() {
		return TroubleLoggingIn;
	}
    public Button getLaunchPortal(){return LaunchPortal;}
	public Button getAdvisorPortal(){return AdvisorPortal;}

	public LoginPage() {
		Uname=new TextField(By.xpath("//input[@id='txtUserID']"));
		Pswd=new TextField(By.xpath("//input[@id='txtPassword']"));
		LaunchPortal = new Button(By.xpath("(//a[@class='Header_nav'])[3]"));
		AdvisorPortal= new Button(By.xpath("//span[text()='Advisor Portal']"));
		//Username = new TextField(By.xpath("//input[@id ='okta-signin-username']"));
		//password = new TextField(By.xpath("//input[@id ='okta-signin-password']"));
		//Uname = new TextField(By.xpath("//input[@id ='okta-signin-username']"));
		//Pswd= new TextField(By.xpath("//input[@id ='okta-signin-password']"));
		//LoginBtn = new Button(By.xpath("//input[@id ='okta-signin-submit']"));
		LoginBtn = new Button(By.xpath("(//button//span[text()='Log in'])[1]"));
		TroubleLoggingIn = new Button(By.xpath("//a[.='Need help signing in?']"));
	}
	
	public void EnterUsername(String UserName) {
		this.getUsername().enterText(UserName);
	}

	public void EnterPassword(String Password) {
		this.getPassword().enterText(Password);
	}

	public TextField getUname() {return Uname; }
	public TextField getPswd() {return Pswd; }



	public void clickLoginButton() {
		this.getLoginBtn().click();

	}
	
	public void VerifyingTroubleloggingInText() {
	
		WebElement element = getDriver().findElement(By.xpath("//a[text()='Trouble logging in?']"));
		String data = element.getText();
		System.out.println(data);
		AAssert.assertEquals("Trouble logging in?", data);
	}
	public void LoginintoApplication(){
	//	personalDetailsData = SoleClientFinancialSolutionsTestData.getLoginDetails();
	personalDetailsData = SoleClientFinancialSolutionsTestData.getTestData();
		this.getUsername().enterText(personalDetailsData.getUserName());
		this.getPassword().enterText(personalDetailsData.getPassword());
		this.getLoginBtn().click();
		getBrowser().sleep(3000);
	}
	public  void LoginWithDevStudio(){
   this.getUname().enterText(UName);
   this.getPswd().enterText(PWD);
   this.getLoginBtn().click();
//   this.getLaunchPortal().click();
//   this.getAdvisorPortal().click();
	}

	public void UserEntersLoginCredentials()
	{
		WebElement element = getDriver().findElement(By.xpath("//a[text()='Trouble logging in?']"));
		String data = element.getText();
		System.out.println(data);
		AAssert.assertEquals("Trouble logging in?", data);
		this.getLoginBtn().click();

	}

}
