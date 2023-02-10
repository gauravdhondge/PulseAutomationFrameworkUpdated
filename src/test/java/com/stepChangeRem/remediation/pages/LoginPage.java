package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.data.SoleClientaFinancialSol_SC89933_Obj;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.testdata.SoleClientFinancialSolutionsTestData;
import com.stepchange.atf.utilities.AAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends Control{
//	private TextField Username;
//	private TextField password;
	private TextField Uname;
	private TextField Pswd;
	private Button LoginBtn;
	private Button TroubleLoggingIn;

	private String TroubleLoggingInText ="Trouble logging in?";
	private Button LaunchPortal;
	private Button AdvisorPortal;

	GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
	private SoleClientaFinancialSol_SC89933_Obj personalDetailsData;


	 public String UName ="jayesh.dhondge@aaseya.com"; public String PWD="JayD@123";

	
	public TextField getUsername() {
		return Uname;
	}

	public Button getLaunchPortal(){
		return LaunchPortal;
	}

	public Button getAdvisorPortal(){
		return AdvisorPortal;
	}

	public TextField getPassword() {
		return Pswd;
	}

	public Button getLoginBtn() {
		return LoginBtn;
	}

	public Button getTroubleLoggingIn() {
		return TroubleLoggingIn;
	}


	public LoginPage() {

//		Username = new TextField(By.xpath("//input[@id ='okta-signin-username']"));
//		password = new TextField(By.xpath("//input[@id ='okta-signin-password']"));
//		Uname = new TextField(By.xpath("//input[@id ='okta-signin-username']"));
		Uname = new TextField(By.xpath("//input[@id='txtUserID']"));
		Pswd= new TextField(By.xpath("//input[@id='txtPassword']"));
		LoginBtn = new Button(By.xpath("//button[@id='sub']"));
//		Pswd= new TextField(By.xpath("//input[@id ='okta-signin-password']"));
//		LoginBtn = new Button(By.xpath("//input[@id ='okta-signin-submit']"));
		TroubleLoggingIn = new Button(By.xpath("//a[.='Need help signing in?']"));
		LaunchPortal =new Button(By.xpath("//a[@title='Launch portal']"));
		AdvisorPortal =new Button(By.xpath("//span[text()='Advisor Portal']"));


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
	
		WebElement element = getDriver().findElement(By.xpath("//a[@id='spnLoginFrgtPwd']"));
		String data = element.getText();
		System.out.println(data);
		AAssert.assertEquals("Trouble logging in?", data);
	}
	public void LoginintoApplication(){
//		personalDetailsData = SoleClientFinancialSolutionsTestData.getLoginDetails();
		personalDetailsData = SoleClientFinancialSolutionsTestData.getTestData();
		this.getUsername().enterText(personalDetailsData.getUserName());
		GenericMethods_cvp.implicitWait(4000);
		this.getPassword().enterText(personalDetailsData.getPassword());
		GenericMethods_cvp.implicitWait(4000);
		this.getLoginBtn().click();
		GenericMethods_cvp.implicitWait(4000);
		getBrowser().sleep(3000);
//		this.getLaunchPortal().selectFromDropdownByIndex(1);
//		this.getLaunchPortal().click();
//		GenericMethods_cvp.implicitWait(4000);
//		this.getAdvisorPortal().click();


	}

	public  void LoginWithDevStudio(){
		GenericMethods_cvp.implicitWait(4000);
		this.getUname().enterText(UName);
		GenericMethods_cvp.implicitWait(4000);
		this.getPswd().enterText(PWD);
		GenericMethods_cvp.implicitWait(4000);
		this.getLoginBtn().click();
		GenericMethods_cvp.implicitWait(4000);
//       this.getLaunchPortal().click();
//		GenericMethods_cvp.implicitWait(4000);
//       this.getAdvisorPortal().click();
//	   GenericMethods_cvp.implicitWait(4000);
	}




	public void UserEntersLoginCredentials()
	{
		WebElement element = getDriver().findElement(By.xpath("//a[@id='spnLoginFrgtPwd']"));
		String data = element.getText();
		System.out.println(data);
		AAssert.assertEquals("Trouble logging in?", data);
		this.getLoginBtn().click();

	}

}
