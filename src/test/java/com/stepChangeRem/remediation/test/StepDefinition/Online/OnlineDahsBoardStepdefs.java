package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineAdviceOnYourBudgetPage;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OnlineDahsBoardStepdefs {
    OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    OnlineDebtHelper helper=new OnlineDebtHelper();

    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    OnlineAdviceOnYourBudgetPage adviceOnYourBudgetPage=new OnlineAdviceOnYourBudgetPage();
    @Then("^User Navigates to Advice on Your Budget$")
    public void userNavigatesToAdviceOnYourBudget() throws InterruptedException {
        houseHolds.getAdviceOnBudget().click();
        Thread.sleep(4000);
        adviceOnYourBudgetPage.getRuSatisified().click();
        Thread.sleep(4000);
        helper.getContinueButton().click();
        adviceOnYourBudgetPage.getConsiderIncreasing().click();
        Thread.sleep(4000);
        adviceOnYourBudgetPage.getIncreaseAmountForGroceriesNo().click();
        Thread.sleep(4000);
        adviceOnYourBudgetPage.getReasonWhyNotIncreaseYourSpendDropdown().selectFromDropdownByIndex(1);
        helper.getContinueButton().click();
        Thread.sleep(4000);
        helper.getContinueButton().click();
        Thread.sleep(4000);
        helper.getContinueButton().click();

    }

    @Then("^User Navigates to Advice on Your Budget89923$")
    public void userNavigatesToAdviceOnYourBudget89923() throws InterruptedException {
        houseHolds.getAdviceOnBudget().click();
        Thread.sleep(4000);
        adviceOnYourBudgetPage.getRuSatisified().click();
        Thread.sleep(4000);
        helper.getContinueButton().click();
        Thread.sleep(4000);
        helper.getContinueButton().click();
        Thread.sleep(4000);
        helper.getContinueButton().click();



    }



    @And("^User Navigated to Final Questions$")
    public void userNavigatedToFinalQuestions() {
        houseHolds.getFinalQuestion().click();
    }

    @And("^User Navigated to Final Questions and Continues$")
    public void userNavigatedToFinalQuestionsAndContinues() {
        houseHolds.getFinalQuestion().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @And("^User Navigated to Final Questions Page For Client And Partner and Continues$")
    public void userNavigatedToFinalQuestionsPageForClientAndPartner() {
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @Then("^User Navigates to Priority Payments and Continues$")
    public void userNavigatesToPriorityPaymentsAndContinues() {
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getPriorityPayments().click();
        GenericMethods_cvp.implicitWait(5000);
        helper.getContinueButton().click();
    }

    @Then("^User Navigates to Review Your Options and Continues$")
    public void userNavigatesToReviewYourOptionsAndContinues89947() throws InterruptedException {
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getReviewOptions().click();
        GenericMethods_cvp.implicitWait(5000);
        helper.getContinueButton().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getApplyingPaymentSuspension().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getFinOutMore().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getReturnToDebtSolution().click();
        GenericMethods_cvp.implicitWait(5000);
//        houseHolds.getSolution().click();
        helper.getContinueButton().click();
    }


    @Then("^User Navigates to Review Your Options and Continues89923$")
    public void userNavigatesToReviewYourOptionsAndContinues89923() throws InterruptedException {
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getReviewOptions().click();
        GenericMethods_cvp.implicitWait(5000);
        helper.getContinueButton().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getApplyingDMP().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getFinOutMore().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getReturnToDebtSolution().click();
        GenericMethods_cvp.implicitWait(5000);
//        houseHolds.getSolution().click();
        helper.getContinueButton().click();
    }


    @Then("^User Navigates to Review Your Options and Continues89944$")
    public void userNavigatesToReviewYourOptionsAndContinues89944() throws InterruptedException {
        houseHolds.getReviewOptions().click();
        GenericMethods_cvp.implicitWait(5000);
        helper.getContinueButton().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getApplyingDPP().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getFinOutMoreDPP().click();
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getReturnToDebtSolution().click();
        GenericMethods_cvp.implicitWait(5000);
//        houseHolds.getSolution().click();
        helper.getContinueButton().click();
    }

    @And("^User Navigated to Final Questions and Continues and Answer No For all Question$")
    public void userNavigatedToFinalQuestionsAndContinuesAndAnswerNoForAllQuestion() {
        houseHolds.getFinalQuestion().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @And("^User Navigates to Priority Payments and Continues and Select No Savings$")
    public void userNavigatesToPriorityPaymentsAndContinuesAndSelectNoSavings() {
        GenericMethods_cvp.implicitWait(5000);
        houseHolds.getPriorityPayments().click();
        GenericMethods_cvp.implicitWait(5000);
        helper.getContinueButton().click();
        GenericMethods_cvp.implicitWait(5000);;
        houseHolds.getSavingSmallAccountNoButton().click();
        GenericMethods_cvp.implicitWait(5000);
        helper.getContinueButton().click();
    }

    @And("Close the Session")
    public void closeTheSession() {
        houseHolds.getCloseTheSession().click();
    }

    @And("^User Navigated to Final Questions and Continues Without changing the assets$")
    public void userNavigatedToFinalQuestionsAndContinuesWithoutChangingTheAssets() {
        houseHolds.getFinalQuestion().click();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @Then("User Agrees to repay arrears on Priority Payments and Continues")
    public void userAgreesToRepayArrearsOnPriorityPaymentsAndContinues() {
        houseHolds.getRepayArrears().click();
        helper.getContinueButton().click();
    }
    @And("User Answers Final Questions and Continues")
    public void userAnswersFinalQuestionsAndContinues() {
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }
    @And("^User Navigated to Registration from Final Questions$")
    public void userNavigatedToRegistrationFromFinalQuestions() {
        houseHolds.getRegisterToSaveProgress().click();
    }
}
