@rechercher

Feature: Rechercher Button

  Background:
    Given Go to url

  @pozitif  @Negatif
  Scenario Outline: seneriyo
    And Select "<contrat>" and "<localisation>" from the Localisation section
    And Click on the RECHERCHER button
    And Verify that the "<contrat>" and "<localisation>" in the search result


    Examples:
      | contrat | localisation    |
      | cdi     | Aix-en-Provence |
      | stage   | Lyon            |
      | stage   | Aix-en-Provence |
