package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineIncomeHelper;
import com.stepChangeRem.remediation.pages.helper.vo.DebtsFields;
import com.stepChangeRem.remediation.pages.helper.vo.QuestionsFields;
import com.stepChangeRem.remediation.pages.onlinePages.HaveYouAddedEverythingPage;
import com.stepChangeRem.remediation.pages.onlinePages.YourMakingGoodProgress;
import com.stepchange.atf.core.GenericMethods;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class OnlineDebtsStepdefs {
	OnlineDebtHelper helper = new OnlineDebtHelper();

	 OnlineIncomeHelper onlineIncomeHelper = new OnlineIncomeHelper();
	OnlineDashBoardHelper houseHolds = new OnlineDashBoardHelper();
	YourMakingGoodProgress MakingGoodprogress = new YourMakingGoodProgress();
	GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();

	HaveYouAddedEverythingPage haveyouaddedeverythingpage = new HaveYouAddedEverythingPage();

	@Then("User fills the Debt Details Online for Client and assert Total Amount \"([^\"]*)\"$")
	public void userFillsTheDebtDetailsOnlineForClientAndAssertTotalAmount(String total, DataTable values) {
		houseHolds.getYourDebts().click();
		List<DebtsFields> debtsFields = values.asList(DebtsFields.class);
		helper.completeOnlinedebtDetails(debtsFields, total);

	}

	/*@And("User Clicks On Continue Button")
	public void UserClicksOnContinueButton() {
		onlineIncomeHelper.getPageHeader().waitForElementIdDisplayed();
		GenericMethods_cvp.implicitWait(5000);
		helper.getContinueButton().click();

	}*/

//	@And("^User Clicks On Continue Button and Marks the Debt completion as \"([^\"]*)\"$")
//	public void userClicksOnContinueButtonAndMarksTheDebtCompletionAs(String debtsReason) throws InterruptedException {
//		onlineIncomeHelper.getPageHeader().waitForElementIdDisplayed();
//		GenericMethods_cvp.implicitWait(5000);
//		helper.getContinueButton().click();
//		GenericMethods_cvp.implicitWait(5000);
//		haveyouaddedeverythingpage.ActionOnHaveYouAddedEverythingPage();
//		helper.getFinishedDebts(debtsReason).click();
//		GenericMethods_cvp.implicitWait(5000);
//		helper.getDebtAddedEverythingYes().click();
//		GenericMethods_cvp.implicitWait(5000);
//		helper.getDebtAddedEverythingNo().click();
//		GenericMethods_cvp.implicitWait(5000);
//		helper.getConfirmFinishedDebts().click();
//	}

	@And("^User Navigates to have you added everything DebtPage and selects yes$")
	public void User_Navigates_to_have_you_added_everything_Debtpage_and_selects_yes() {
		GenericMethods_cvp.implicitWait(5000);
		helper.getContinueButton().click();
		haveyouaddedeverythingpage.ActionOnHaveYouAddedEverythingDebtPageYes();

	}

	@And("^User Navigates to have you added everything DebtPage and selects No$")
	public void User_Navigates_to_have_you_added_everything_Debtpage_and_selects_No() {
		GenericMethods_cvp.implicitWait(5000);
		helper.getContinueButton().click();
		haveyouaddedeverythingpage.ActionOnHaveYouAddedEverythingDebtPageNo();

	}

	@And("^User Navigates to have you added everything IncomePage and selects yes$")
	public void User_Navigates_to_have_you_added_everything_Incomepage_and_selects_yes() {
		GenericMethods_cvp.implicitWait(4000);
		helper.getContinueButton().click();
		haveyouaddedeverythingpage.ActionOnHaveYouAddedEverythingIncomePageYes();

	}
	@And("^User Navigates to have you added everything IncomePage and selects No$")
	public void User_Navigates_to_have_you_added_everything_Incomepage_and_selects_No() {
		GenericMethods_cvp.implicitWait(4000);
		helper.getContinueButton().click();
		GenericMethods_cvp.implicitWait(4000);
		haveyouaddedeverythingpage.ActionOnHaveYouAddedEverythingIncomePageNo();

	}
	@And("^User Navigates to have you added everything SpendingPage and selects yes$")
	public void User_Navigates_to_have_you_added_everything_Spendingpage_and_selects_yes() {
		GenericMethods_cvp.implicitWait(4000);
		helper.getContinueButton().click();
		haveyouaddedeverythingpage.ActionOnHaveYouAddedEverythingSpendingPageYes();

	}
	@And("^User Navigates to have you added everything SpendingPage and selects No$")
	public void User_Navigates_to_have_you_added_everything_Spendingpage_and_selects_No() {
		GenericMethods_cvp.implicitWait(4000);
		helper.getContinueButton().click();
		haveyouaddedeverythingpage.ActionOnHaveYouAddedEverythingSpendingPageNo();

	}

	@And("User Clicks On continue With DebtAdvice")
	public void UserClicksOnContinueWithDebtAdvice() {
		MakingGoodprogress.YourMakingGoodprogress();

	}

	@And("User Navigates Create Your Budget and clicks on Continue button")
	public void userNavigatesCreateYourBudgetAndClicksOnContinueButton() {
		houseHolds.getCreateYourBudget().click();
		GenericMethods_cvp.implicitWait(5000);
		helper.getContinueButton().click();
	}

	@Then("User fills the Debt Details Online for Client and assert Total Amount \"([^\"]*)\" After Navigating back completing (\\d+)$")
	public void userFillsTheDebtDetailsOnlineForClientAndAssertTotalAmountAfterNavigatingBackCompleting(
			String totalAmount, int previousExecutions, DataTable values) {
		houseHolds.getYourDebts().click();
		List<DebtsFields> debtsFields = values.asList(DebtsFields.class);
		helper.completeOnlinedebtDetailsAfterNavigatingBack(debtsFields, totalAmount, previousExecutions);
	}

//	@Then("User Again Navigates Debt Details Online for Client and assert Total Amount \"([^\"]*)\"$")
//	public void useragainnavigatestoFillsTheDebtDetailsOnlineForClientAndAssertTotal(
//			String totalAmount, int previousExecutions, DataTable values) {
//		houseHolds.getYourDebts().click();
//		List<DebtsFields> debtsFields = values.asList(DebtsFields.class);
//		helper.completeOnlinedebtDetailsAfterNavigatingBack(debtsFields, totalAmount, previousExecutions);
//	}

	@Then("User Will be Navigated to Questions and Answer the questions as below")
	public void userWillBeNavigatedToQuestionsAndAnswerTheQuestionsAsBelow(DataTable questions) {
		List<QuestionsFields> questionsFields = questions.asList(QuestionsFields.class);
		helper.fillTheGlobalQuestions(questionsFields);
	}

	@Then("^user Navigates To Have You Forgotten Some Spending items Page And Performs Action$")
	public void userNavigatesToHaveYouForgottenSomeSpendingitemsPageAndPerformsAction(){
		GenericMethods_cvp.implicitWait(4000);
		helper.getDontHaveThisCost().click();
		GenericMethods_cvp.implicitWait(4000);
		helper.getContinueButton().click();



	}

}
