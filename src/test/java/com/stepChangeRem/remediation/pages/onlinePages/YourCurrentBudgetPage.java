package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourCurrentBudgetPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button BudgetFeelAccurateYesRb;
    private Button ContinueButtonforYourCurrentBudgePage;
    private Link RegisteToSaveProgresslink;
    private Button feelAccurateYesButton;
    private Button continueCurrentBudgetPageButton;
    private Button ConsiderIncreasing;
    private Button IncreaseAmountForGroceriesNo;
    private Dropdown ReasonWhyNotIncreaseYourSpendDropdown;

    private Button groceriesPageContinueButton;
    //getters


    public Button getGroceriesPageContinueButton() {
        return groceriesPageContinueButton;
    }
    public Dropdown getReasonWhyNotIncreaseYourSpendDropdown() {return ReasonWhyNotIncreaseYourSpendDropdown; }
    public Button getIncreaseAmountForGroceriesNo() {
        return IncreaseAmountForGroceriesNo;
    }
    public Button getConsiderIncreasing() {
        return ConsiderIncreasing;
    }
    public Button getBudgetFeelAccurateYesRb() {
        return BudgetFeelAccurateYesRb;
    }
    public Button getContinueButtonforYourCurrentBudgePage() {
        return ContinueButtonforYourCurrentBudgePage;
    }
    public Link getRegisteToSaveProgresslink() {
        return RegisteToSaveProgresslink;

    }
    //getters
    public Button getFeelAccurateYesButton() {return feelAccurateYesButton;}
    public Button getContinueCurrentBudgetPageButton() {return continueCurrentBudgetPageButton;}

    public YourCurrentBudgetPage(){
         feelAccurateYesButton= new Button(By.xpath("(//label[text()='Yes'])[1]"));
         continueCurrentBudgetPageButton = new Button(By.xpath("//button[text()='Continue']"));
        BudgetFeelAccurateYesRb = new Button(By.xpath("//label[text()='Does your budget feel accurate to you?']//following::label[1]"));
        ContinueButtonforYourCurrentBudgePage = new Button(By.xpath("//button[text()='Continue']"));
        RegisteToSaveProgresslink = new Link(By.xpath("//a[text()='Register to save progress']"));
        ConsiderIncreasing = new Button(By.xpath("//div[text()='Consider increasing']"));
        IncreaseAmountForGroceriesNo = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
        ReasonWhyNotIncreaseYourSpendDropdown=new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l3$ppxResults$l1$pReason']"));
        groceriesPageContinueButton = new Button(By.xpath("//button[text()='Continue']"));

    }

    public void performActionsonyourCurrentBudgetPage(){
        GenericMethods_cvp.implicitWait(4000);
        this.getBudgetFeelAccurateYesRb().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getContinueButtonforYourCurrentBudgePage().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getConsiderIncreasing().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getIncreaseAmountForGroceriesNo().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getReasonWhyNotIncreaseYourSpendDropdown().selectFromDropdownByIndex(1);
        GenericMethods_cvp.implicitWait(4000);
        this.getGroceriesPageContinueButton().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getContinueButtonforYourCurrentBudgePage().click();
        GenericMethods_cvp.implicitWait(4000);
    }
    public void ActionSetYourCurrentBudget89955(){
        GenericMethods_cvp.implicitWait(10000);
        this.getFeelAccurateYesButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getContinueCurrentBudgetPageButton().click();
        GenericMethods_cvp.implicitWait(10000);

        //On your budget Lookes good, click on continue
        this.getContinueCurrentBudgetPageButton().click();
        GenericMethods_cvp.implicitWait(10000);
        // On your Budget Summary clicking on continue again on the page
        this.getContinueCurrentBudgetPageButton().click();
        GenericMethods_cvp.implicitWait(10000);
        //and navigated to dashboard.
    }
}
