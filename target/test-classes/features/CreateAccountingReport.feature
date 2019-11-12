Feature: Create Accounting Report

Background: Login successful
Given Go to login page
When Input email "user2@keisan.jp"
And Input password "12345"
And Click button login
Then Display username "user2"

Scenario: Create Successful Accounting Report
Given Go to URL
When Click button Create Business Plan
And Input Data No "QLDS2"
And Input Data title "DEHAでQUANのテストデータ"
And Input Company name "DEHA Software"
And Select business category
And Input Remarks "This is test data from DEHA's QA."
And Select Period unit
And Select Period
And Input start date of business period "2019/01/02"
And Select currency unit
And Select Currency
And Input author "Quan Le"
And Input Registration date "2019/01/02"
And Input abstract "Made by DEHA Software."
And Click button save and return
Then Display message successfull "事業計画が作成できました"
And Display accounting report with data no "QLDS2"