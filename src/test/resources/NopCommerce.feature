Feature: My Feature File

  Scenario Outline: To test that users can login with valid credentials


    Given user launches the url "https://admin-demo.nopcommerce.com/login"
    When  user attempts to login by entering  username as "<email>"  and password as "<passwd>"
    Then user confirms page title should be "Dashboard / nopCommerce administration"


    Examples:
      | email        | passwd  |
      | admin@yourstore.com       | admin|


    #Today 02/02/2022

  Scenario Outline: To test that users can login with valid credentials


    Given user launches the url "https://admin-demo.nopcommerce.com/login"
    When  user attempts to login by entering  username as "<email>"  and password as "<passwd>"

    Then user should be able to see the error messages "<errorMessage>"

    Examples:
      | email                     | passwd |errorMessage|
      | admin@yourstore.com       | tttt   | Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect|
      |test123@ab.com             |admin   |Login was unsuccessful. Please correct the errors and try again.No customer account found              |
      |admin@yourstore.com        |        |Login was unsuccessful. Please correct the errors and try again.The credentials provided are incorrect |
      |                           |admin   |Please enter your email                                                                                |
      |                           |        | Please enter your email                                                                               |

  Scenario: Adding A New Customer

      #wip  for step def  for today  02/02/2022
     Given user is successfully logged into nopcommerce dashboard
     When  the user selects the customer menu
    And the user clicks on the Customer
    And user clicks on the add new button
    Then user confirms page title should be "Add a new customer / nopCommerce administration"
    And user populate the Customer info
    When user  clicks the save button
    Then user should see the message "The new customer has been added successfully"








