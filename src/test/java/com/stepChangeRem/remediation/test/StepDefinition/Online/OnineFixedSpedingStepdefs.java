package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.YourSpendingHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineIncomeHelper;
import com.stepChangeRem.remediation.pages.helper.vo.SpendingsFields;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class OnineFixedSpedingStepdefs {
    OnlineIncomeHelper helper=new OnlineIncomeHelper();
    OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    YourSpendingHelper spendingHelper=new YourSpendingHelper();
    OnlineDebtHelper debtHelper=new OnlineDebtHelper();
    @And("Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as \"([^\"]*)\"$")
    public void navigateToTheOnlineSpendingsFixedPageAndEnterTheDataAsBelowAssertTotalIncomeAs(String spendings, DataTable spendingsDetails) {
        houseHolds.getCreateYourSpending().click();
        List<SpendingsFields> spendingsFields = spendingsDetails.asList(SpendingsFields.class);
        helper.fillTheSpendingDetails(spendingsFields);
    }

    @And("^User Navigates to Utilities Field on Spending Fixed Page and fills the Details$")
    public void User_Navigates_to_Utilities_Field_on_Spending_Fixed_Page_and_fills_the_Details() {
 //       GenericMethods_cvp.implicitWait(4000);
        helper.FillSpendingUtilitiesDetails();
    }

//    @And("^User Navigates to Utilities Field on Spending Fixed Page and fills the Details Advisor Journey$")
//    public void User_Navigates_to_Utilities_Field_on_Spending_Fixed_Page_and_fills_the_Details_AdvisorJourney() {
//        //       GenericMethods_cvp.implicitWait(4000);
//        helper.FillSpendingUtilitiesDetailsAdvisorJourney();
//    }



    @Then("^User Navigates to Utilities Field on Spending Fixed Page and fills the Details Advisor Journey$")
    public void user_Navigates_to_Utilities_Field_on_Spending_Fixed_Page_and_fills_the_Details_Advisor_Journey() throws Throwable {

        helper.FillSpendingUtilitiesDetailsAdvisorJourney();
    }




    @And("User Continues After Checks Item Type Not Applicable \"([^\"]*)\"$")
    public void userChecksItemTypeNotApplicable(String itemType) {
        spendingHelper.checkItemsNotApplicable(itemType);
        debtHelper.getContinueButton().click();
    }
}
