Feature:Content

@wip
Scenario: Check contents
    Given the user is in the wikipedia home page
    When the user clicks Contents
    Then the user should be able to see following options

       | Contents         |
       | Overviews        |
       | Outlines         |
       | Lists            |
       | Portals          |
       | A–Z index        |
       | Glossaries       |
       | Categories       |
       | Indices          |
       | Reference        |
       | Culture          |
       | Geography        |
       | Health           |
       | History          |
       | Human activities |
       | Mathematics      |
       | Nature           |
       | People           |
       | Philosophy       |
       | Religion         |
       | Society          |
       | Technology       |
