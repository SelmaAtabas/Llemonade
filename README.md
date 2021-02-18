# Llemonade

This is a Cucumber BDD framework with using Gherkin language

### Instructions ###

1- To run this test , install Java 8 or above versions.

 https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
 
 2-Install Intellij 2020.3.2
 https://www.jetbrains.com/idea/download/#section=windows
 
 3- Clone from repository 
 By HTTP:
          https://github.com/SelmaAtabas/Llemonade.git
          
 4- By default, all the scenarios will be run as per the configuration provided by the test runner:
 '''com/llemonade/runners/cukesrunner'''
 
   You can also execute it filtering the features using tag in the parameter 
 '''tag="", tag="@wip"..'''
 
 5- Test Report : You can see them the directory set in the runner:
 '''target/cucumber-html-reports'''
 
 4- Failed Scenarios: In case of any failed scenario,you can execute  it again using '''com/llemonade/runners/FiledTestrunner'''
 
 5- The testsuite is configured for Chrome, Firefox and  Chrome-headless browsers.For seting the browser, change the value in the properties file
 '''src/configuration.properties'''
  'browser=chrome'
  'browser=firefox'
  
  6- For Api tests you can run with @test Annotations
  
  7- The testsuite is also combatible with the operating systems: MAC OSX, Window , Linux.
  
   ###Test contents###
It is desingned based on Page Object Model with singleton pattern
1- Checking search button
2- Changing language
3- Checking contents type

Api package is build with using Junit
 1- No photo is returned for a date in the future
 2- using date 2019-6-3 the 4th photo has ID 675839
 3- 403 status code is returned if no api_key is passed.
