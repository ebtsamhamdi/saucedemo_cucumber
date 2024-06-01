Feature: Login to SauceDemo

  Scenario Outline: Successful login with valid and invalid credentials
    Given I enter valid "<username>" and "<password>"
    When I click the login button
    Then I should be redirected to the inventory page
    Examples:
    |   username    |    password   |
    | standard_user | secret_sauce  |
    |  notaccurate  | secret_sauce  |
    | standard_user |  notaccurate  |
    |               | secret_sauce  |
    | standard_user |               |
    |               |               |





