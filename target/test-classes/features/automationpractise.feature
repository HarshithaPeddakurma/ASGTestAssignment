Feature: Automation Practise dresses page
 
Scenario: If the email address is incorrect user should see an error message
Given Open Chrome and navigate to "http://automationpractice.com/"
When Click on the SignIn and enter the invalid email address
Then User should not be able to login into the automation practise website

Scenario: User should be able to register using a valid email address
Given Enter the Valid Email address and password
When Click on the Submit Button
Then User should be able to login into the automation practise website

Scenario: User should be successfully add the item to the cart
Given Go to Dresses and click on the Summer dresses
When Click on Add to Cart
Then Validate that product is successfully added to the cart

Scenario: Validate whether same product name colour and quantity are displayed in Cart Summary page
Given Get the productname colour and quantity
When Click on Proceed to CheckOut
Then Validate whether same productname colour and quantity are displayed in the Cart



