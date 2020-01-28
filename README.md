<b>Steps to Run the Tests</b>
<br>Download the zip file onto any computer which has maven(along with selenium dependencies) and java installed. Once the file is downloaded got to the root folder via command prompt and run <b>mvn compile</b> followed by <b>mvn test</b> 

The scenarios have been tested using selenium web driver(<b>page object model framework and testng)</b> using java programming language.
The project has been imported to github. The results can be seen using the html file -"ExtentReportsTestNG.html" which can be accessed using the below path . 
"target\surefire-reports\ExtentReportsTestNG.html"
The testing was completed in 1.30 hrs excluding the time taken to configure the laptop as my laptop didn’t have any of the software needed to complete the task .
<b>If I had more time I would have added the code to get the screenshots of failed scenarios and would have testes negative scenarios with respect to search bars also would have re structured the code
integrated the git repository with jenkins .Also I would have migrated the test suites to cucumber (due to technical issues in my laptop ,i was unable to configure cucumber) as it would be better aligned to the scenario and step definition provided in the task and would have given  a better structure and readability to the code</b>

<br>Note: No data has been hardcoded, data has been parameterized wherever needed.


<b> Scenarios Automated</b>
<br>1.navigation() ,verifyRestaurant()  - tests the below scenario 
<br>Scenario: Search for restaurants in an area
  <br>Given I want food in "AR51 1AA"
  <br>When I search for restaurants
  <br>Then I should see some restaurants in "AR51 1AA" </p>
  
 <br>2. VerifyTabs() tests the below scenario 
 <br>Scenario:-Verify if the icons are present on top of the screen
 <br>Given I want food in "AR51 1AA"
 <br>When I search for restaurants
 <br>Then I should see the popular cuisines as tabs on the next screen</p>
 
<br>3.searchRestaurant() tests the below scenario 
 <br> Scenario: -Verify if user can search in "AR51 1AA" area
 <br>Given I want food from the listed restaurants in "AR51 1AA"
 <br>When I search for food
 <br>Then I should see the restaurants providing <food>
  <br>|<b>food</b>|
  <br>|tea| </p>
  
  <br>4.restaurantList() tests the below scenario 
  <br>Given I want to order food from a particular restaurant 
  <br>When I select the restaurant 
  <br>Then I should see the restaurant menu </p>
  
