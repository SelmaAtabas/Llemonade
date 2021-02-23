Feature: Searching

  Background:
    Given the user is in the wikipedia home page
@wip
    Scenario:Search button
      Given the user enter following "Document"
      When the user click search button
      Then the title should be contain "Document"
