  Feature: User should also not be able to login with Invalid data
  
  
  @ignore
  @Reg
 Scenario Outline:Login
 Given I Navigate to the homepage on "Chrome"
  When I click on Login Button
   And  I enter Username as "<username>"
   And  I enter Password as "<password>"
   And  I click on SignIn button
  Then  I should see username as "<username>" present
   And  I should see AccountBlance present
   And  I should see Depositbutton present
  
 Examples:  
     |	username	| password     |
     | NOBLEBUG228	|Bola123$%^    |
