package com.stepChangeRem.remediation.pages.helper.online;

import com.stepChangeRem.remediation.pages.helper.vo.IncomeFields;
import com.stepChangeRem.remediation.pages.helper.vo.SpendingsFields;
import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlineIncomeHelper extends Control {
	private Button header;
	private Button subHeading;

	GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();

	private TextField amountField;
	private Dropdown paymentFrequency;
	private Button addButton;
	private Button behindWithPayments;
	// Spending Fixed
	private AutoComplete creditor;
	private Dropdown debtType;
	private Button whoIsDebtor;
	private TextField mortgageBalance;
	private Button paidArrearsIn12Months;
	private Button typeOfMortgage;
	private Button isSVR;
	private Button mainHome;
	private TextField assetWorth;
	private Dropdown assetBelogsto;
	private Button addLink;
	private Button submit;
	private Button whoPays;

	private Div pageHeader;
	private Button idontHaveThisCost;
	private Button RadWhoReceives;
	// spending Fixed

	private Button Utilities;
	private Button Electricity;
	private Button WaterSupply;
	private Button Gas;

	private Button GasAdvisoryJourney;
	private TextField ElectricityTextBox;
	private TextField GasTextBox;
	private TextField WaterSupplyTextBox;
	private Dropdown ElectricityDropDown;
	private Dropdown GasDropDown;

	private Dropdown WaterSupplyDropDown;
	private Button BehindPayments;


	private Button PrePaymentMeter;
	private Button WhoPaysField;
	private Button RemoveElectricity;
	private Button ArrearsElectricity;

	private Button ArrearsGas;
	private Button PrepaymentMeterElectricity;

	private Button PrepaymentMeterGas;
	private Dropdown SupplierDropdown;

	private Button RemoveWaterSupply;

	private Checkbox allFixedSpendingCompleted;

	Div UtilitiesHeader;

	public Div getUtilitiesHeader() {
		return UtilitiesHeader= new Div(By.xpath("//div[text()='Utilities']"));
	}


	public Checkbox getAllFixedSpendingCompleted() {
		return allFixedSpendingCompleted=new Checkbox(By.xpath("//label[normalize-space()='All fixed spending items are complete']"));
	}

	public Button getRemoveElectricity() {
		return RemoveElectricity = new Button(By.xpath("(//button[@class='SC_Button_Quinary pzhc pzbutton'])[13]"));
	}

	public Button getArrearsElectricityNo() {
		return ArrearsElectricity = new Button(By.xpath("(//label[text()='No'])[11]"));
	}

	public Button getArrearsGasNo() {
		return ArrearsGas = new Button(By.xpath("(//label[text()='No'])[13]"));
	}

	public Button getPrepaymentMeterElectricity() {
		return PrepaymentMeterElectricity = new Button(By.xpath("(//label[text()='No'])[12]"));
	}

	public Button getPrepaymentMeterGas() {
		return PrepaymentMeterGas = new Button(By.xpath("(//label[text()='No'])[13]"));
	}

	public Dropdown getSupplierDropdown() {
		return SupplierDropdown = new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l2$pCaptureUtilityProvider']"));
	}

	public Button getRemoveWaterSupply() {
		return RemoveWaterSupply = new Button(By.xpath("(//button[@class='SC_Button_Quinary pzhc pzbutton'])[14]"));
	}



	public Button getUtilities() {
		return Utilities = new Button(By.xpath("//div[text()='Utilities']"));
	}

	public Button getWaterSupply() {
		return WaterSupply = new Button(By.xpath("(//span[text()='Water supply'])[1]"));
	}

	public Button getGas() {
		return Gas = new Button(By.xpath("(//span[text()='Gas'])[1]"));
	}

	public Button getGasAdvisoryJourney() {
		return GasAdvisoryJourney = new Button(By.xpath("//button[@name='ExpenditureItemButton_D_ExpenditureItemList.pxResults(29)_1']"));
	}


	public Button getElectricity() {
		return Electricity = new Button(By.xpath("(//span[text()='Electricity'])[1]"));
	}

	public TextField getElectricityTextBox() {
		return ElectricityTextBox = new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l2$pAmount']"));
	}

	public TextField getGasTextBox() {
		return GasTextBox = new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l3$pAmount']"));
	}


	public TextField getWaterSupplyTextBox() {
		return WaterSupplyTextBox = new TextField(By.xpath("//input[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l4$pAmount']"));
	}

	public Dropdown getElectricityDropDown() {
		return ElectricityDropDown = new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l2$pFrequency']"));
	}

	public Dropdown getGasDropDown() {
		return GasDropDown = new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l3$pFrequency']"));
	}

	public Dropdown getWaterSupplyDropDown() {
		return WaterSupplyDropDown = new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l2$ppxResults$l4$pFrequency']"));
	}

	public Button getWhoPaysField() {
		return WhoPaysField = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[3]"));
	}

	public Button getBehindPayments() {
		return BehindPayments = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[5]"));
	}



	public Button getPrePaymentMeter() {
		//	return PrePaymentMeter = new Button(By.xpath("//h1[.='" + field + "']//following::label[.='" + label + "']"));

		return PrePaymentMeter = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[7]"));

	}




	public Button getRadWhoReceives() {
		return RadWhoReceives = new Button(By.xpath("//label[contains(@class,'rb_standard')]"));
	}


	public Button getIdontHaveThisCost() {
		return idontHaveThisCost = new Button(By.xpath("//input[contains(@name,'$pIsItemNotApplicable')]/../label"));
	}

	public Div getPageHeader() {
		return pageHeader = new Div(By.xpath("//h1[@class='header-title']"));
	}

	public Button getWhoPays(String field, String label) {
		return whoPays = new Button(By.xpath("//h1[.='" + field + "']//following::label[.='" + label + "']"));
	}

	public Button getSubmit() {
		return submit = new Button(By.xpath("//button[.='Submit']"));
	}

	public Button getAddLink() {
		return addLink = new Button(By.xpath("//button[.='Add information']"));
	}

	public AutoComplete getCreditor() {
		return creditor = new AutoComplete(By.xpath("//input[contains(@name,'$l1$pCreditor$pDescription')]"));
	}

	public Dropdown getDebtType() {
		return debtType = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l1$pCode')]"));
	}

	public Button getWhoIsDebtor(String client) {
		return whoIsDebtor = new Button(
				By.xpath("//input[contains(@name,'$l1$pOwnership$pCode')]/../label[.='" + client + "']"));
	}

	public TextField getMortgageBalance() {
		return mortgageBalance = new TextField(By.xpath("//input[contains(@name,'$l1$pAmountOwed')]"));
	}

	public Button getPaidArrearsIn12Months(String action) {
		return paidArrearsIn12Months = new Button(
				By.xpath("//input[contains(@name,'$l1$pPaymentMissedInLast12Months')]/../label[.='" + action + "']"));
	}

	public Button getTypeOfMortgage(String type) {
		return typeOfMortgage = new Button(
				By.xpath("//input[contains(@name,'$ppxResults$l1$pMortgageType')]/../label[.='" + type + "']"));
	}

	public Button getIsSVR(String isSvr) {
		return isSVR = new Button(
				By.xpath("//input[contains(@name,'$l1$pClientOnStandardVariableRate')]/../label[.='" + isSvr + "']"));
	}

	public Button getMainHome(String isMainHome) {
		return mainHome = new Button(
				By.xpath("//input[contains(@name,'$l1$pIsDebtRelatedToMainHome')]/../label[.='" + isMainHome + "']"));
	}

	public TextField getAssetWorth() {
		return assetWorth = new TextField(By.xpath("(//input[contains(@name,'$l1$pAmount')])[2]"));
	}

	public Dropdown getAssetBelogsto() {
		return assetBelogsto = new Dropdown(By.xpath("//select[contains(@name,'$l1$pOwnership$pCode')]"));
	}

	// Income
	public Button getBehindWithPayments(String field, String label) {
		return behindWithPayments = new Button(
				By.xpath("//h1[.='" + field + "']//following::label[.='" + label + "']"));
	}

	public Button getAddButton() {
		return addButton = new Button(By.xpath("//button[text()='Add']"));
	}

	public TextField getAmountField(String heading) {
		return amountField = new TextField(
				By.xpath("//h1[.='" + heading + "']//following::input[not(@type='hidden')][1]"));
	}

	public Dropdown getPaymentFrequency(String heading) {
		return paymentFrequency = new Dropdown(By.xpath("//h1[.='" + heading + "']//following::select[1]"));
	}

	public Button getSubHeading(String subHeading) {
		return new Button(
				By.xpath("//div[not(@style=' display:none;')]/span[.='" + subHeading + "' and @class='body_text']"));
	}

	public Button getHeader(String header) {
		return new Button(By.xpath("//div[.='" + header + "' and @string_type='label']"));
	}


	public void fillTheIncomeDetails(List<IncomeFields> incomeFields) {
		getBrowser().sleep(getTimeout());
		this.getPageHeader().waitForElementIdDisplayed();
		for (IncomeFields field : incomeFields) {
			getBrowser().sleep(getTimeout() / 10);
			this.getHeader(field.getHeader()).click();
			getBrowser().sleep(getTimeout() / 10);
			this.getSubHeading(field.getField()).click();
			this.getAmountField(field.getField()).enterText(field.getAmount());
			this.getPaymentFrequency(field.getField()).selectFromDropdownByIndex(Integer.parseInt(field.getIndex()));
			if (field.getWhoPays() != null && !field.getWhoPays().equalsIgnoreCase("false"))
				getBrowser().sleep(getTimeout() / 10);
			this.getWhoPays(field.getField(), field.getWhoPays()).click();
			getBrowser().sleep(getTimeout() / 10);
			this.getAddButton().click();
			this.getHeader(field.getHeader()).click();
			//this.getRadWhoReceives().click();
			//this.getRadWhoReceives().click(); Ysp
		}
	}

	public void selectAllAsiDontHave() {
		getBrowser().sleep(getTimeout());
		List<WebElement> elements = getDriver().findElements(this.getIdontHaveThisCost().getSelector());
		for (WebElement element : elements) {
			element.click();
		}
	}

	public void FillSpendingUtilitiesDetails() {

		GenericMethods_cvp.implicitWait(5000);
        this.getUtilities().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getElectricity().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getElectricityTextBox().enterText("50");
		GenericMethods_cvp.implicitWait(5000);
		this.getElectricityDropDown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getWhoPaysField().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getBehindPayments().click();
		GenericMethods_cvp.implicitWait(5000);
        this.getPrePaymentMeter().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getAddButton().click();


		GenericMethods_cvp.implicitWait(5000);
		this.getGas().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getGasTextBox().enterText("50");
		GenericMethods_cvp.implicitWait(5000);
		this.getGasDropDown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getWhoPaysField().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getBehindPayments().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getPrePaymentMeter().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getAddButton().click();

		GenericMethods_cvp.implicitWait(5000);
		this.getWaterSupply().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getWaterSupplyTextBox().enterText("50");
		GenericMethods_cvp.implicitWait(5000);
		this.getWaterSupplyDropDown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getWhoPaysField().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getAddButton().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getUtilities().click();
		GenericMethods_cvp.implicitWait(5000);

	}

	public void FillSpendingUtilitiesDetailsAdvisorJourney() {
		GenericMethods_cvp.implicitWait(5000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(5000);
		this.getUtilitiesHeader().waitForElementIdDisplayed();
		GenericMethods_cvp.implicitWait(5000);
		this.getRemoveElectricity().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getElectricityTextBox().enterText("50");
		GenericMethods_cvp.implicitWait(5000);
		this.getElectricityDropDown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getArrearsElectricityNo().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getSupplierDropdown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getPrepaymentMeterElectricity().click();
		GenericMethods_cvp.implicitWait(5000);



		GenericMethods_cvp.implicitWait(5000);
		this.getGasAdvisoryJourney().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getGasTextBox().enterText("50");
		GenericMethods_cvp.implicitWait(5000);
		this.getGasDropDown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getArrearsGasNo().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getSupplierDropdown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getPrepaymentMeterGas().click();
		GenericMethods_cvp.implicitWait(5000);
		getAllFixedSpendingCompleted().click();
		GenericMethods_cvp.implicitWait(5000);



		this.getRemoveWaterSupply().click();
		GenericMethods_cvp.implicitWait(5000);
		this.getWaterSupplyTextBox().enterText("50");
		GenericMethods_cvp.implicitWait(5000);
		this.getWaterSupplyDropDown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getSupplierDropdown().selectFromDropdownByIndex(4);
		GenericMethods_cvp.implicitWait(5000);
		this.getAllFixedSpendingCompleted().click();


	}

	public void fillTheSpendingDetails(List<SpendingsFields> spendingFields) {
		getBrowser().sleep(getTimeout());
		this.getPageHeader().waitForElementIdDisplayed();
		for (SpendingsFields field : spendingFields) {
			getBrowser().sleep(getTimeout() / 10);
			this.getHeader(field.getHeader()).click();
			getBrowser().sleep(getTimeout() / 10);
			this.getSubHeading(field.getField()).click();
			this.getAmountField(field.getField()).enterText(field.getAmount());
			this.getPaymentFrequency(field.getField()).selectFromDropdownByIndex(Integer.parseInt(field.getIndex()));
			if (field.getArrears() != null
					&& (field.getArrears().equalsIgnoreCase("yes") || field.getArrears().equalsIgnoreCase("No")))
				this.getBehindWithPayments(field.getField(), field.getArrears()).click();
			if (field.getWhoPays() != null && !field.getWhoPays().equalsIgnoreCase("false"))
				this.getWhoPays(field.getField(), field.getWhoPays()).click();
//			if (field.getPrepaymentMeter() != null && !field.getPrepaymentMeter().equalsIgnoreCase("false"))
//				this.getPrePaymentMeter(field.getField(), field.getPrepaymentMeter()).click();
			if (field.isMortagageLink()) {
				this.getAddLink().click();
				this.getDebtType().selectFromDropdownByText(field.getDebtType());
				getBrowser().sleep(500);
				this.getCreditor().enterTextThenSelectFromAutoComplete(field.getCreditor());
				this.getCreditor().tab();
				this.getWhoIsDebtor(field.getWhoIsDebtor()).click();
				this.getMortgageBalance().enterText(field.getMortgageBalance().toString());
				this.getPaidArrearsIn12Months(field.getPaidArrearsIn12Months()).click();
				this.getTypeOfMortgage(field.getTypeOfMortgage()).click();
				this.getIsSVR(field.getIsSVR()).click();
				this.getMainHome(field.getMainHome()).click();
				if (field.getMainHome() != null && field.getMainHome().equalsIgnoreCase("No")) {
					this.getAssetWorth().enterText(field.getAssetWorth().toString());
					this.getAssetBelogsto().selectFromDropdownByText(field.getAssetBelogsto());
				}
				this.getSubmit().click();
			}
			this.getAddButton().click();
			this.getHeader(field.getHeader()).click();
		}
	}
}

//	public void fillTheSpendingDetailsPart2(List<SpendingsFields> spendingFields) {
//		getBrowser().sleep(getTimeout());
//		this.getPageHeader().waitForElementIdDisplayed();
//		for (SpendingsFields field : spendingFields) {
//			getBrowser().sleep(getTimeout() / 10);
//			this.getHeader(field.getHeader()).click();
//			getBrowser().sleep(getTimeout() / 10);
//			this.getSubHeading(field.getField()).click();
//			this.getAmountField(field.getField()).enterText(field.getAmount());
//			this.getPaymentFrequency(field.getField()).selectFromDropdownByIndex(Integer.parseInt(field.getIndex()));
//			if (field.getArrears() != null
//					&& (field.getArrears().equalsIgnoreCase("yes") || field.getArrears().equalsIgnoreCase("No")))
//				this.getBehindWithPayments(field.getField(), field.getArrears()).click();
//			if (field.getWhoPays() != null && !field.getWhoPays().equalsIgnoreCase("false"))
//				this.getWhoPays(field.getField(), field.getWhoPays()).click();
//			if (field.isMortagageLink()) {
//				this.getAddLink().click();
//				this.getDebtType().selectFromDropdownByText(field.getDebtType());
//				getBrowser().sleep(500);
//				this.getCreditor().enterTextThenSelectFromAutoComplete(field.getCreditor());
//				this.getCreditor().tab();
//				this.getWhoIsDebtor(field.getWhoIsDebtor()).click();
//				this.getMortgageBalance().enterText(field.getMortgageBalance().toString());
//				this.getPaidArrearsIn12Months(field.getPaidArrearsIn12Months()).click();
//				this.getTypeOfMortgage(field.getTypeOfMortgage()).click();
//				this.getIsSVR(field.getIsSVR()).click();
//				this.getMainHome(field.getMainHome()).click();
//				if (field.getMainHome() != null && field.getMainHome().equalsIgnoreCase("No")) {
//					this.getAssetWorth().enterText(field.getAssetWorth().toString());
//					this.getAssetBelogsto().selectFromDropdownByText(field.getAssetBelogsto());
//				}
//				this.getSubmit().click();
//			}
//			this.getAddButton().click();
//			this.getHeader(field.getHeader()).click();
//		}
//	}
//}

