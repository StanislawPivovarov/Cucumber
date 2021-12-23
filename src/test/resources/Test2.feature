@naselenide
Feature: Check uspevaemost
  Scenario: Uspevaemost
    Given i am on "https://kpfu.ru/"
    When press button with text "Личный кабинет"
    And type text: "SSPivovarov" to input
    And type text: "349q8h49" to input two
    And press button with text "Успеваемость"