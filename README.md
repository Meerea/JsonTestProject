# JsonTestProject


Tech Stack :
-------------
* Java 11
* intelliJ IDEA
* Maven
* TestNG
* JSON-Simple

Project creation steps:
--------------------------
Created new Maven Project as "JsonTestProject"
Added dependencies in POM.xml 
  * testng - version 6.14.3 
  * json-simple - version 1.1.1
  
Project Structure details:
---------------------------
Under src/main/java->'utils' package-> Class 'GetJsonData' baseClass with methods to get Json inputs 
  * GetJsonData(String inputFile) - Read the JSON file,parse and get JSONObject
  * getData() - Method to get the data from JSON Array
  
Under src/test/java->'testCases' package-> Class 'TeamRCBTest' having testmethods to run the testcases
  * fileSetUp()- Calls the Read and fetch methods of input JSON file
  * test1_verifyCountOfForeignPlayers() - test Method to check the Foreign Players Count
  * test1_verifyCountOfWicketKeeper() - test Method to check the Wicket-Keeper Count
  
Under src/main/resources/testData-> 'TeamRCB.json' Input file

Steps to Run:
--------------
* Under testng folder->'testRunner.xml' - right click the xml file and click run
* Check the results in console 


