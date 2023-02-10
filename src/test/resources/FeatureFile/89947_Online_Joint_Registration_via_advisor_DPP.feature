
	
		

Feature: Validation of E2E scenario 89947
  @89947
  @OnlineBatchE2E_All_Scenario
  Scenario: Validate End TO End 89947 scenario
  Given User is in login page for Online
    #And User Navigates to Online Welcome Page
    And In the Establish Client Needs page capture the details for Online
      | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|referredBY  |financialDifficulty       |doTheyLiveWithPartner|partnerUkDebts|inCoupleDebitAdvice|healthIssue|partnerSelfEmployed|partnerAge|
      |Scotland        |Yes   |No                 |36 |No                 |No             |Other       |Unemployment or redundancy|Yes                  |Yes           |Yes                |false      |No                 |22        |
    #Then Client Registered With StepChnage
    #|firstName|domain         |dateOfBirth|
    #|Client1  |@satepchane.com |10/01/1983 |
    And Create Step Change Account page and Enter Valid data89947
    And User Clicks CheckBox Button And Clicks Continue Button
    #And user Navigate to Create Step Change Account page and Enter Valid data
    And User Clicks On HouseHolds And Fills the Details as below
      |housingStatus        |maritalStatus    |ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment               |noOfVehicles|
      | Renting - Council   |Cohabiting       |0                |0                     |0                |false                    |Full-time employed|Unemployed: not looking for work|0           |
    And User Navigates Create Your Budget and clicks on Continue button
    And User Navigates to have you added everything IncomePage and selects No
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1635.00"
      |header                 | field                           | amount    |  index      |   arrears   |whoPays|
      |Home and contents      |Rent                             |1151.88    |4            |No           |Shared |
      |Home and contents      |Council tax                      |100        |4            |No           |Shared |
      |Home and contents      |TV licence                       |13.12      |3            |No           |Shared |
      |Pensions and insurances|Buildings and contents insurance |20         |4            |No           |Shared |
#      |Utilities              |Water supply                     |50         |4            |false        |Shared |
#      |Utilities              |Electricity                      |50         |4            |No           |Shared |
#      |Utilities              |Gas                              |50         |4            |No           |Shared |
    And User Navigates to Utilities Field on Spending Fixed Page and fills the Details
    And User Navigates to have you added everything SpendingPage and selects No
    Then User Navigates to Income Page
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1265.00"
      |header                  | field            | amount     |whoPays      |index     |
      |Benefits and Tax Credits| Universal Credit | 1200       |Client1      |1         |
      |Benefits and Tax Credits| Child Benefit    | 65         |Your Partner |1         |
      And User Navigates to have you added everything IncomePage and selects yes
    Then User fills the Debt Details Online for Client and assert Total Amount "11500"
      | creditor    | debttype   |amountOwed  | liability    |areYouBehindWithPayments |furtherAction |furtherActionType |isthedebtsubjecttoaguarantor|isDebtTypeMortagage|haveYouRepaidAnyArrearsInTheLast12Months|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|isClientLiableForAllPayments|linkMainHome|ownerOfPayment|
      | Littlewoods | Catalogue  |6000        | Client1      |No                       |   false      |   false          | No                         |false              |No                                      |Repayment             |No                         |934.92                |4                        |false                       |Yes         |1      |
      | Wonga       | Payday loan|2000        | Client1      |Yes                      |   Yes        |   Default notice | false                      |false              |No                                      |Repayment             |No                         |934.92                |4                        |false                       |Yes         |1      |
      | Barclaycard | Credit card|3500        | Your Partner |No                       |   false      |   false          | false                      |false              |No                                      |Repayment             |No                         |934.92                |4                        |false                       |Yes         |1      |
    And User Navigates to have you added everything DebtPage and selects yes
    Then User Will be Navigated to Questions and Answer the questions as below
     |guarantor|disputeddebt|debtUnenforceable|
     |No       |No          |No               |
    # And User Clicks On continue With DebtAdvice
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1635.00"
      |header                 | field                             | amount| whoPays     |   arrears   |index|
      |Food and housekeeping  |Groceries                          |200    |Shared       |false        |5    |
    And User Navigates to have you added everything SpendingPage and selects yes
    Then User Navigates to Have You Forgotten Any Item and selects I dont have this and continues
    Then User Navigates to Advice on Your Budget
    And User Navigated to Final Questions and Continues
#    And User Navigated to Final Questions Page For Client And Partner and Continues
     #|assetType |assetEstimatedValue|whoOwnsTheAsset|
     #|Other item|2500               |Client1        |
     #|Other item|4000               |Your Partner   |
    And User Navigates to Priority Payments and Continues and Select No Savings
    Then User Navigates to Review Your Options and Continues
    And Close the Session
    And Quit Browser