Feature: Searching

  Background:
    Given the user is in the wikipedia home page

    Scenario:Search button
      Given the user enter following "document"
      When the user click search button
      Then the title should be contain "Document"
