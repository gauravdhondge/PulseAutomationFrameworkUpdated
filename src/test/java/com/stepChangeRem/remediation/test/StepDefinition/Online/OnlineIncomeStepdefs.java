package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineIncomeHelper;
import com.stepChangeRem.remediation.pages.helper.vo.IncomeFields;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class OnlineIncomeStepdefs {
    OnlineIncomeHelper helper=new OnlineIncomeHelper();
    OnlineDebtHelper debtHelper=new OnlineDebtHelper();
    OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    @And("Navigate to the Online Income page and enter the data as below Assert Total Income as \"([^\"]*)\"$")
    public void navigateToTheOnlineIncomePageAndEnterTheDataAsBelowAssertTotalIncomeAs(String total, DataTable incomeDetails) {
        List<IncomeFields> incomeFields = incomeDetails.asList(IncomeFields.class);
        helper.fillTheIncomeDetails(incomeFields);
    }

    @Then("User Navigates to Income Page")
    public void userNavigatesToIncomePage() {
        houseHolds.getCreateYourIncome().click();
    }

    @Then("User Navigates to Have You Forgotten Any Item and selects I dont have this and continues")
    public void userNavigatesToHaveYouForgottenAnyItemAndSelectsIDontHaveThisAndContinues() {
        helper.getPageHeader().waitForElementIdDisplayed();
        helper.selectAllAsiDontHave();
        debtHelper.getContinueButton().click();
    }

    @Then("^User Navigates to Advice on Your Budget And Fill Details$")
    public void userNavigatesToAdviceOnYourBudget() throws InterruptedException {
        houseHolds.getAdviceOnBudget().click();
        Thread.sleep(4000);
        houseHolds.getBudgetFeelAccurate().click();
        Thread.sleep(4000);
        debtHelper.getContinueButton().click();
        Thread.sleep(4000);
        debtHelper.getContinueButton().click();
        Thread.sleep(4000);
        debtHelper.getContinueButton().click();
    }

    @And("user Navigates to your budget looks good page and Continues")
    public void user_Navigates_to_your_budget_looks_good_page_and_Continues() throws InterruptedException {
        Thread.sleep(4000);
        debtHelper.getContinueButton().click();
    }

    @And("user Navigates to your Budget Summary Page and Continues")
    public void user_Navigates_to_your_budget_looks_good_page_and_Continue() throws InterruptedException {
        Thread.sleep(4000);
        debtHelper.getContinueButton().click();
    }



}
