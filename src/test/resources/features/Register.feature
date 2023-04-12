Feature: Register testing demo page

  Scenario: Successful Register
    Given Open Azimut demo Register page
    Then I enter First Name "John"
    Then I enter Last Name "Doe"
    Then I enter Address "Los Angeles"
    Then I enter email adress "johndoe@mail.com"
    Then I enter Phone "0123654987"
    Then I select Gender "male"
    Then I select Hobbies "Movies"
    Then I select Languages "Filipino"
    Then I select Skills "Oracle"
    Then I select Country Buggy
    Then I select Country "Australia"
    Then I enter DateOfBirthYear "1933"
    Then I enter DateOfBirthMonth "January"
    Then I enter DateOfBirthDay "10"
    Then I enter Password "password"
    Then I enter Comfirm Password "password"
    Then I click the Submit Button "Submit"
