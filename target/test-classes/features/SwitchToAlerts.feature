Feature: Demo Page Switch To Alerts
  Background:
    Given Open Azimut Demo Alert page

#  Scenario: Alert with OK
#    Then Display an alert box
#    Then Accept alert
#
#  Scenario: Alert with Ok & Cancel
#    When Button Alert with Ok & Cancel
#    Then Display a confirm box
#    Then Press a button
#
#  Scenario: Alert with Textbox
#    When Button Alert with textbox
#    Then Click to demonstrate the prompt box
#    Then I enter my name "John"

  Scenario: Alert with OK
    Then Click on section Button "btn btn-danger"
    Then Accept Alert

  Scenario: Alert with Ok
    When Select Section "CancelTab"
    Then Click on section Button "btn btn-primary"
    Then Accept Alert

  Scenario: Alert with Cancel
    When Select Section "CancelTab"
    Then Click on section Button "btn btn-primary"
    Then Cancel Alert

  Scenario: Alert with Textbox
    When Select Section "Textbox"
    Then Click on section Button "btn btn-info"
    Then I enter my name "John"