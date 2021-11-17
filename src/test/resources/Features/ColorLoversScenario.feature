Feature: Patterns

  Scenario Outline: Comparing number of views of each pattern to a specific number
    Given Color Patterns Endpoint
    When Calling the Endpoint
    Then Check that number of views is greater than <numViews>
    Examples:
      | numViews |
      | 4000     |

