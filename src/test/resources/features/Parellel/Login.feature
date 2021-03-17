@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User is already in login page
    When user enters login user and pass
    |username|password|
    |adarshkm008@gmail.com|Missumissu009@|
    |adarshkm0010@gmail.com|Missumissu009@|
    |adarshkm009@gmail.com|Missumissu009@|
    Then user is on home page
    
 #Examples:
 #| username | password |
 #| adarshkm009@gmail.com | Missumissu009@ |
 #| adarshkm009@ | Missumissu009 |
