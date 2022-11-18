@Functional
Feature: Ping ID

  @PingID @fast
  Scenario: Log in Ping ID to access SD Web
    Given User is on the PingID access
    When  Write User and password and push on the button connect
    Then  Access to SD Web

   @DownloadAllStore
  Scenario: Download every order in every store
    Given The user access the page SD Web
    When  Choose the store, with particular date and download
    Then  The file is downloaded

  @DownloadOneStore
  Scenario: Download list of order on one store
    Given Access to SD Web on page list of orders
    When Choose the particular store, date and download
    Then Every file is downloaded