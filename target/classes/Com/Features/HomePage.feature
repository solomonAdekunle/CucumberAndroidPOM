Feature: User Should be able to navigate to the HomePage 

#@ignore
#@web
@Homepage
Scenario: Navigating to the Home Page
Given I Navigate to the homepage on "Chrome"
Then I should see Login Button
 And I should see Supercasino Logo
 And I should see SideBar Menu Icon
 And I should see Casino Vertical Tab
 And I should see Vegas Vertical Tab
 And I should see Live Vertical Tab
 And I should see Promos Vertical Tab
 And I should see Hero Banner
 And I should see  Games Category Tab