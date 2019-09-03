$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("automationpractise.feature");
formatter.feature({
  "line": 1,
  "name": "Automation Practise dresses page",
  "description": "",
  "id": "automation-practise-dresses-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "If the email address is incorrect user should see an error message",
  "description": "",
  "id": "automation-practise-dresses-page;if-the-email-address-is-incorrect-user-should-see-an-error-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Chrome and navigate to \"http://automationpractice.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on the SignIn and enter the invalid email address",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should not be able to login into the automation practise website",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://automationpractice.com/",
      "offset": 29
    }
  ],
  "location": "stepdefination.open_chrome_and_navigate_to_something(String)"
});
formatter.result({
  "duration": 13948520100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_on_the_signin_and_enter_the_invalid_email_address()"
});
formatter.result({
  "duration": 4889329700,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_should_not_be_able_to_login_into_the_automation_practise_website()"
});
formatter.result({
  "duration": 95578700,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to register using a valid email address",
  "description": "",
  "id": "automation-practise-dresses-page;user-should-be-able-to-register-using-a-valid-email-address",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Enter the Valid Email address and password",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Click on the Submit Button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User should be able to login into the automation practise website",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.enter_the_valid_email_address_and_password()"
});
formatter.result({
  "duration": 2093117400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_on_the_submit_button()"
});
formatter.result({
  "duration": 1822042800,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.user_should_be_able_to_login_into_the_automation_practise_website()"
});
formatter.result({
  "duration": 109961100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should be successfully add the item to the cart",
  "description": "",
  "id": "automation-practise-dresses-page;user-should-be-successfully-add-the-item-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Go to Dresses and click on the Summer dresses",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Click on Add to Cart",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Validate that product is successfully added to the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.go_to_dresses_and_click_on_the_summer_dresses()"
});
formatter.result({
  "duration": 3619789200,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_on_add_to_cart()"
});
formatter.result({
  "duration": 344556300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.validate_that_product_is_successfully_added_to_the_cart()"
});
formatter.result({
  "duration": 40230200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Validate whether same product name colour and quantity are displayed in Cart Summary page",
  "description": "",
  "id": "automation-practise-dresses-page;validate-whether-same-product-name-colour-and-quantity-are-displayed-in-cart-summary-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Get the productname colour and quantity",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Click on Proceed to CheckOut",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Validate whether same productname colour and quantity are displayed in the Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.get_the_productname_colour_and_quantity()"
});
formatter.result({
  "duration": 2274029300,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.click_on_proceed_to_checkout()"
});
formatter.result({
  "duration": 2529495900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefination.validate_whether_same_productname_colour_and_quantity_are_displayed_in_the_cart()"
});
formatter.result({
  "duration": 294431100,
  "status": "passed"
});
});