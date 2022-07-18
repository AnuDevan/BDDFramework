Feature: DemoSite Registration Page1

Scenario: Register Page Validation1

Given User launches browser and open a test URL "http://demo.automationtesting.in/Register.html"
When User clicks firstname textbox and enter a value "Anu"
And User clicks lastname textbox and enter a value "Devan"
And User click Address textbox and enter a value "test address"
And User click email testbox and enter a value "anuextreme05@gmail.com"
And User click phoneNumber textbox and enter  value "9677393595"
And User click "Male" radiobutton
Then User validates Male radiobutton is selected or not
When User clicks movie checkbox
Then User validates movie checkbox is checked
When User clicks and select C as a skills
And User enters date of birth
And User enters the password
And User enters confirm passsword
And User enters submit button