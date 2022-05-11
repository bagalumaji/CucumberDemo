Feature: Demonstration of Data Table feature
  '''
  this feature just use data table demo
  '''

  @dataTableList
  Scenario: Data table demo for list
    Given user is on registration page
    When user enters following data
    |abc|xyz|
    |pqr|aaa|
    Then it should be entered and available for use