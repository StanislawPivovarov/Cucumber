@naselenide
  Feature: Reiting
    Scenario: Reiting
      Given i am on "https://kpfu.ru/"
      When press button with text "Личный кабинет"
      And type text: "SSPivovarov" to input
      And type text: "349q8h49" to input two
      And press button with text "Мой рейтинг"