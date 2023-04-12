Feature: Demo Page Switch to Frame

  Background:
    Given Open Azimut Demo Frame page

  Scenario: Single iFrame
    Then Click "Single"
    Then Enter input1 "Orange"


  Scenario: IFrame with in an IFrame
    Then Click "Multiple"
    Then Enter input2 "Apple"