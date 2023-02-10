package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Link;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.utilities.RandomGenerators;
import org.openqa.selenium.By;

public class HaveYouAddedEverythingPage extends Control {

    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();

    private Button AddedEveryThing;
    private Button NotAddedEveryThing;
    private Button Cancel;
    private Button Confirm;



    public Button AddedEveryThing() {return AddedEveryThing;}
    public Button NotAddedEveryThing() {return NotAddedEveryThing;}
    public Button Cancel() {return Cancel;}
    public Button Confirm() {return Confirm;}


    public HaveYouAddedEverythingPage(){
        AddedEveryThing=new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
        NotAddedEveryThing=new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[1]"));
        Cancel=new Button(By.xpath("(//button[text()='Cancel'])[1]"));
        Confirm=new Button(By.xpath("(//button[text()='Confirm'])[1]"));

    }

    public void ActionOnHaveYouAddedEverythingDebtPageYes(){
        GenericMethods_cvp.implicitWait(5000);
        this.AddedEveryThing().click();
        GenericMethods_cvp.implicitWait(5000);
        this.Confirm().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void ActionOnHaveYouAddedEverythingDebtPageNo(){
        GenericMethods_cvp.implicitWait(5000);
        this.NotAddedEveryThing().click();
        GenericMethods_cvp.implicitWait(5000);
        this.Confirm().click();
        GenericMethods_cvp.implicitWait(5000);
    }
    public void ActionOnHaveYouAddedEverythingIncomePageYes(){
        GenericMethods_cvp.implicitWait(5000);
        this.AddedEveryThing().click();
        GenericMethods_cvp.implicitWait(5000);
        this.Confirm().click();
        GenericMethods_cvp.implicitWait(5000);
    }
    public void ActionOnHaveYouAddedEverythingIncomePageNo(){
        GenericMethods_cvp.implicitWait(5000);
        this.NotAddedEveryThing().click();
        GenericMethods_cvp.implicitWait(5000);
        this.Confirm().click();
        GenericMethods_cvp.implicitWait(5000);
    }
    public void ActionOnHaveYouAddedEverythingSpendingPageYes(){
        GenericMethods_cvp.implicitWait(5000);
        this.AddedEveryThing().click();
        GenericMethods_cvp.implicitWait(5000);
        this.Confirm().click();
        GenericMethods_cvp.implicitWait(5000);
    }

    public void ActionOnHaveYouAddedEverythingSpendingPageNo(){
        GenericMethods_cvp.implicitWait(5000);
        this.NotAddedEveryThing().click();
        GenericMethods_cvp.implicitWait(5000);
        this.Confirm().click();
        GenericMethods_cvp.implicitWait(5000);
    }




}