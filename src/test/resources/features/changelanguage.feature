Feature: Language


  Scenario:Change Language
    Given the user is in the wikipedia home page
    When the user select Espanol
    Then language should be changed as "español"