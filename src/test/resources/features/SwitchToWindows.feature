Feature: Demo Page Switch to Windows
  Background:
    Given Open Azimut Demo Windows page

  Scenario:"Tabbed" Windows
    Then Click "Tabbed" button
    And Close other window tabs

  Scenario:Separate windows
    When Select Section "Seperate" page
    Then Click "Seperate" button
    Then Close other window tabs


  Scenario:Multiple Windows
    When Select Section "Multiple" page
    Then Click "Multiple" button
    Then Close other window tabs

   Scenario: Windows page Multiple section closing specific tabs having url
     Then Select Section "Multiple" page
     Then Click "Multiple" button
     Then Close window tab having url: "https://demo.automationtesting.in/Index.html"

