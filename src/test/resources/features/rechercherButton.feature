@rechercher

Feature: Rechercher Button

  Background:
    Given Go to url

  @pozitif
  Scenario Outline: seneriyo
    And Select "<contrat>" and "<localisation>" from the Localisation section
    And Click on the RECHERCHER button
    And Verify that the "<contrat>" and "<localisation>" in the search result

    Examples:
      | contrat | localisation    |
      | stage   | Aix-en-Provence |
      | cdi     | Lyon            |
      | stage   | Aix-en-Provence |
