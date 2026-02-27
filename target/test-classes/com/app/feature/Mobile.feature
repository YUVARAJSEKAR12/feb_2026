Feature: Login page

	@Scenrio_Outline
  Scenario Outline: Validate the user and pass
    Given Login to the URL "https://adactinhotelapp.com/"
    When Enter the user "<username>"
    And Enter the pass "<password>"
    And Click the login button
    Then Validate the Home page

    Examples: 
      | username | password |
      | name1    | Aiite1   |
      | name2    | Aiite2   |
