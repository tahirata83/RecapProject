Feature: Search price between 50 to 100
  Scenario: Search price between 50 to 100

    Given Navigate to website
    Given click on I understand button
    And Search for "Teddy bear"
    And Click on search button
    And click on price filter fifty to hundred Eur
    Then Verify all prices are between fifty and hundred Eur
