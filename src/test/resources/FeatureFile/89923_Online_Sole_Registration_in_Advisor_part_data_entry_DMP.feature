Feature: Validation of E2E scenario 89923
  @89923
  @OnlineBatchE2E_All_Scenario
  Scenario: Validate End TO End 89923 scenario
    Given User is in login page for Online
 #   And User Navigates to Online Welcome Page
    And In the Establish Client Needs page capture the details for Online
      | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition |referredBY |financialDifficulty        |doTheyLiveWithPartner|partnerUkDebts|inCoupleDebitAdvice|healthIssue|partnerSelfEmployed|partnerAge|
      | England         |Yes   |No                 |53 |No                 |No             |Other      |Unemployment or redundancy |Yes                  |No            |Yes                |false      |No                 |30        |
#    Then Client Registered With StepChnage
 #   |firstName|domain         |dateOfBirth|
#    |Client1  |@stepchange.com|10/11/19865|
    And Create Step Change Account page and Enter Valid data89923
    And User Clicks CheckBox Button And Clicks Continue Button
    And User Clicks On HouseHolds And Fills the Details as below
      |housingStatus              |maritalStatus    |ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment      |noOfVehicles|
      |Renting - private landlord |Cohabiting       |0                |0                     |0                |false                    |Full-time employed|Full-time employed     |0           |
    Then User fills the Debt Details Online for Client and assert Total Amount "7200"
      | creditor            | debttype        |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|linkMainHome|linkAssets|assetWorth|ownerOfTheAsset|isClientLiableForAllPayments|
      | Argos               |  Store card     |      1000        | Client1   |  Yes                      |      Yes     |   Default notice |  false               |4                             |No                          |true               |Repayment             |No                         |934.92                |4                        |Yes         |false     |false     |false          |false                       |
    And User Navigates to have you added everything DebtPage and selects No
    And User Navigates Create Your Budget and clicks on Continue button
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1095.00"
      |header    | field | amount |whoPays|index|
      |Earnings  |Wage   | 670    |Client1|4    |
    And User Navigates to have you added everything IncomePage and selects No
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header              | field             | amount    |  index  |whoPays  |  arrears  |isMortagageLink|creditor|debtType|whoIsDebtor|mortgageBalance|paidArrearsIn12Months|typeOfMortgage|isSVR|mainHome|assetWorth|assetBelogsto|
      |Home and contents   |Mortgage payment   |310        |4        |Client1  |No         |true           |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Home and contents   |TV licence         |12.87      |3        |Client1  |No         |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Transport and travel|Public transport   |200        |5        |Client1  |false      |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
#      |Utilities           |Water supply       |46         |4        |Client1  |false      |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
    And User Navigates to have you added everything SpendingPage and selects No
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header                  | field             | amount    | index |whoPays  | arrears   |isMortagageLink|creditor|debtType|whoIsDebtor|mortgageBalance|paidArrearsIn12Months|typeOfMortgage|isSVR|mainHome|assetWorth|assetBelogsto|
      |Food and housekeeping   |Groceries          |216        |5      |Shared   |false      |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Food and housekeeping   |Meals at work      |55         |5      |Shared   |false      |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
    And User Navigates to have you added everything SpendingPage and selects No
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header                     | field                             | amount  | index |whoPays  |   arrears   |isMortagageLink|creditor|debtType|whoIsDebtor|mortgageBalance|paidArrearsIn12Months|typeOfMortgage|isSVR|mainHome|assetWorth|assetBelogsto|
      |Home and contents          |Council tax                        |116      |4      |Shared   |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
#      |Utilities                  |Electricity                        |71       |4      |Shared   |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
#      |Utilities                  |Gas                                |50       |4      |Shared   |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Pensions and insurances    |Buildings and contents insurance   |25       |4      |Shared   |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Communications and leisure |Home phone, internet and TV package|35       |4      |Shared   |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Personal costs             |Clothing and footwear              |20       |4      |Shared   |false        |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
    And User Navigates to Utilities Field on Spending Fixed Page and fills the Details
    And User Navigates to have you added everything SpendingPage and selects yes
    Then user Navigates To Have You Forgotten Some Spending items Page And Performs Action
    Then User fills the Debt Details Online for Client and assert Total Amount "7200" After Navigating back completing 2
      | creditor            | debttype        |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|linkAssets|assetWorth|ownerOfTheAsset|isClientLiableForAllPayments|
      | Barclaycard         | Credit card     |      1500        | Client1   |  Yes                      |      Yes     |   Default notice |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |
    And User Navigates to have you added everything DebtPage and selects yes
    Then User Will be Navigated to Questions and Answer the questions as below
      |guarantor|disputeddebt|debtUnenforceable|
      |No       |No          |No               |
    And User Clicks On continue With DebtAdvice
    Then User Navigates to Income Page
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1095.00"
      |header      | field           | amount |whoPays  |index|
      |Earnings    |Other earnings   | 125    |Client1  |2    |
      |Other income|Other income     |300     |Client1  |5    |
    And User Navigates to have you added everything IncomePage and selects yes
    Then User Navigates to Advice on Your Budget89923
    And User Navigated to Final Questions and Continues Without changing the assets
    Then User Navigates to Priority Payments and Continues and Select No Savings
    Then User Navigates to Review Your Options and Continues89923
    And Close the Session
    And Quit Browser