package com.stepChangeRem.remediation.pages.helper.online;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Dropdown;
import org.openqa.selenium.By;

public class OnlineAdviceOnYourBudgetPage {
    private Button ruSatisified;

    private Button ConsiderIncreasing;

    private Button IncreaseAmountForGroceriesNo;

    private Dropdown ReasonWhyNotIncreaseYourSpendDropdown;

    public Button getRuSatisified() {
        return ruSatisified=new Button(By.xpath("//input[@name='$PpyWorkPage$pIsYourSituationCorrect']/../label[.='Yes']"));
    }

    public Button getConsiderIncreasing() {
        return ConsiderIncreasing=new Button(By.xpath("//div[text()='Consider increasing']"));
    }

   public Button getIncreaseAmountForGroceriesNo(){

        return IncreaseAmountForGroceriesNo = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
   }

   public Dropdown getReasonWhyNotIncreaseYourSpendDropdown(){

   return ReasonWhyNotIncreaseYourSpendDropdown = new Dropdown(By.xpath("//select[@name='$PD_ExpenditureCategoryList$ppxResults$l3$ppxResults$l1$pReason']"));
  }





}
