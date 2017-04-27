Feature: User should be able to Login with Valid Username and Password 
	User should also not be able to login with Invalid data
   
#	   Background:
#	    Given I Navigate to the homepage on browser     
#	  
	#@ignore
	@Login 
Scenario: Clicking On Login Buttton to see if Loging Pop-up box displayed 
	Given I Navigate to the homepage on "Chrome"
	When I click on Login Button 
	Then I should see Login Pop-up box displayed 
	And I should see Supercasino Logo displayed 
	And I should see Username Input Box 
	And I should see Password Input box 
	And I should see Forgotten details link 
	And I should see SignIn Button 
	And I should see New User link 
	And I should see Join Now Button 
	And I should see Close Incon 	
	
	
#@ignore
#@web
@Login 
Scenario Outline: Logging in with Invalid data 
Given I Navigate to the homepage on "Chrome"
When I click on Login Button 
And  I enter Username as "<username>" 
And  I enter Password as "<password>" 
And  I click on SignIn button 
Then I should see Login errorMesssage Pop-up box 
Examples: 
		|username         | password   |
		|mmm12	          |MNNH$1      |
		|Noblebugq11	  |Bola123     |
		
	
	
#@ignore	
@Login 	
Scenario: Close the Login Pop-up box
Given I Navigate to the homepage on "Chrome"
When I click on Login Button 
And  I click on the Login Pop-up close icon
Then Login Pop-up box should be closed	
	
		
@web
@Login 
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
		
		


		
 
			
