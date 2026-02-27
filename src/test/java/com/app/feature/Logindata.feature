Feature: Validating the login pages

  @smoke_aslist
  Scenario: Validate the valids username and password
    When Update the form
      | Yuvaraj               |
      | Sekar                 |
      | yuvi.sekar3@gmail.com |

  @smoke_asMap
  Scenario: Validate the valid user and password
    When Update the form asMap
      | Firstname | Yuvaraj               |
      | Lastname  | Sekar                 |
      | Email     | yuvi.sekar3@gmail.com |