package com.stepChangeRem.remediation.pages.helper.online;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OnlineDashBoardHelper extends Control {
    private Button houseHold;
    private Button yourDebts;
    private Button createYourBudget;
    private Button createYourIncome;
    private Button createYourSpending;
    private Button adviceOnBudget;
    private Button finalQuestion;

    private Button SavingSmallAccountNoButton;
    private Button priorityPayments;
    private Button reviewOptions;
    private Button finOutMore;

    private Button finOutMoreDPP;

    private Button ApplyingPaymentSuspension;
    private Button ApplyingDPP;

    private Button ApplyingDMP;
    private Button returnToSolution;
    private Button solution;
    private Button closeTheSession;
    private Button repayArrears;
    private Link registerToSaveProgress;

    private Button BudgetFeelAccurate;


    public Button getBudgetFeelAccurate() {
        return BudgetFeelAccurate=new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[1]"));
    }

    public Button getSavingSmallAccountNoButton() {
        return closeTheSession=new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
    }

    public Link getRegisterToSaveProgress() {
        return registerToSaveProgress=new Link(By.xpath("//a[contains(text(),'Register to save progress')]"));
    }
    public Button getRepayArrears() {
        return repayArrears=new Button(By.xpath("//label[contains(text(),'I understand that I must arrange to repay these arrears')]"));
    }

    public Button getCloseTheSession() {
        return closeTheSession=new Button(By.xpath("//div[.='Close']"));
    }

    public Button getSolution() {
        return solution=new Button(By.xpath("//input[contains(@name,'$ppxResults$l1$ppySelected')]/../label"));
    }

    public Button getReturnToDebtSolution() {
        return returnToSolution=new Button(By.xpath("//button[text()='Return to debt solutions']"));
    }

    public Button getFinOutMore() {
        return finOutMore=new Button(By.xpath("(//button[text()='Find out more'])[1]"));
    }

    public Button getFinOutMoreDPP() {
        return finOutMoreDPP=new Button(By.xpath("(//button['Find out more'])[5]"));
    }

    public Button getApplyingPaymentSuspension() {
        return ApplyingPaymentSuspension=new Button(By.xpath("(//label[@class=' cb_standard'])[1]"));
    }

    public Button getApplyingDMP() {
        return ApplyingDMP=new Button(By.xpath("(//input[contains(@name,'$ppxResults$l1$ppySelected')])[2]"));
    }

    public Button getApplyingDPP() {
        return ApplyingDPP = new Button(By.xpath("//label[text()='We’re interested in applying for a DPP']"));
    }


    public Button getReviewOptions() {
        return reviewOptions=new Button(By.xpath("(//div[.='Review your options'])[2]"));
    }

    public Button getPriorityPayments() {
        return priorityPayments=new Button(By.xpath("(//div[text()='Your priority payments'])[2]"));
    }


    public void clickOnNoButtons() {
        getBrowser().sleep(getTimeout()/5);
        List<WebElement> elements = getDriver().findElements(By.xpath("//label[.='No']"));
        for (int i = 0; i < elements.size(); i++) {
            verifyOverLayDisplayed();
            new Button(By.xpath("(//label[.='No'])["+(i+1)+"]")).click();
            verifyOverLayDisplayed();
        }
    }

    public Button getFinalQuestion() {
        return finalQuestion=new Button(By.xpath("(//div[.='Final questions'])[2]"));
    }

    public Button getAdviceOnBudget() {
        return adviceOnBudget=new Button(By.xpath("(//div[.='Advice on your budget'])[2]"));
    }

    public Button getCreateYourSpending() {
        return createYourSpending=new Button(By.xpath("(//div[text()='Your spending'])[2]"));
    }

    public Button getCreateYourIncome() {
        return createYourIncome=new Button(By.xpath("(//div[text()='Your income'])[2]"));
    }

    public Button getCreateYourBudget() {
        return createYourBudget=new Button(By.xpath("(//div[text()='Creating your budget'])[2]"));
    }

    public Button getHouseHold() {
        return houseHold=new Button(By.xpath("(//div[text()='Your household'])[1]"));
    }

    public Button getYourDebts() {
        return yourDebts=new Button(By.xpath("(//div[text()='Your debts'])[1]"));
    }

}
