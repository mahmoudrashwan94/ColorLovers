Feature: Get Number of Color Lovers

  Scenario Outline:
    Given Color Patterns Endpoint
    When Calling the Endpoint
    Then Check that number of views is greater than <numViews>
    Examples:
      | numViews |
      | 4000     |

