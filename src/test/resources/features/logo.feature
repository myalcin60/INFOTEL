@logo
Feature: Site logo

  Background:
    Given Go to url

  @pozitif
  Scenario: logo
    Then Hover your mouse over CARRIRE and click on nos offres in the drop-down menu
    And On the page that opens, click on the site Logo
    And Verify that you are back on the home page


