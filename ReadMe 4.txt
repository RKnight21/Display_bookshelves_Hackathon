
Problem Statement : Display Bookshelves
Website           : "https://www.urbanladder.com/"
---------------------------------------------------------------------

1. Search for "BookShelves" with price below Rs. 15000, Category any one (like Wall Shelves / Kid Bookshelves / Study Tables, etc) &  exclude out of stock. Sort by price "High to Low", fetch the top 3 items & print all details in console output.

2. From Living, retrieve all items under any one of sub-menu items like  "Seating & Chairs" or "Living Storage". Also print the same in console output.

3. Under "Gift cards", choose "Birthday/Anniversay"; Fill "Customize your gift card" with valid price & date and click "Next" button; Fill "To" & "From" details under "who is this lucky person" with any one email id invalid (example: without @ symbol) and click "Submit"; Capture & display the error message in console output. Then give valid email id & validate all the given details in the "Confirm Details" section

 



Steps of the Procedure:
----------------------------------------------------------------------

1)  Launch any browser (In this code we have used Chrome browser and Microsoft Edge browser). 
2)  Goto “https://www.urbanladder.com/”. 
3)  Scroll the page and click on ‘Bookshelves’ option. (It will take user to ‘Bookshelves’ page).
4) Select the ‘Exclude Out Of Stock’ checkbox field.
5)  Drag and drop the ‘price’ slider to Rs.15000.
6)  Hover around "SortBy" And Click "High to Low".
7)  Take the list of first 3 bookshelves and print it on the console.
8)  Hover around "Living" nav bar and print all the items in console from one of it's sub categories
9) Scroll the page up and click on ‘Gift Cards’ Option. (It will take user to ‘Gift Cards’ page).
10) Click on the ‘Birthday/Anniversary’ option.
11) In the ‘Amount’ textbox, enter the amount as ‘1500’.
12) Click ‘NEXT’ Button.
13) Fill all the mandatory fields except ‘Recipient’s Email’ textbox.
14) Enter invalid value in the ‘Recipient’s Email’ textbox.
15) Click ‘CONFIRM’ Button.
16) Check whether error message is displayed.
17) Display the error message on the console.
18) Verify again with correct credentials and take a screeshot 

Folders
----------------------------------------------------------------------

1) src/test/java
       i)   PageObjects
            -BasePage.java
            -HomePage.java
            -SecondPage.java
            -ThirdPagejava.
       ii)  TestBase
            -BaseClass.java
       iii) TestCases
            -TC_001_FindDetailsOfBookShelves.java
            -TC_002_ItemsUnderLiving.java
            -TC_003_GiftCards
       
       iv)  Utilities
            -ExcelUtility.java
            -ExtentReportManager.java
            -TakeScreenshot.java

2) Drivers
   i)  chromedriver.exe
   ii) msedgedriver.exe

3) reports- (extent report saved here)
      
4) ScreenRecording
     
5) Screenshot



Data Driven Concepts
-----------------------------------------------------------------------
1) Properties File (Reading Data)

   * (Config.properties)- This properties file is present in        
   * This file conists of  URL value.

2) JSON File (Reading data)
    
   * (GiftCardInput.json)- This JSON file is present in      
   * This file conists of values to be entered in 'Gift Cards' form.These include values of
     -> Amount 
     -> Recipient's Name
     -> Recipient's Email
     -> Your Name
     -> Your Email
     -> Your Mobile
     -> Message

3) Excel File (Writing data)

   1.TestData.xlsx - This file is present in TestData folder.In this file 


Key Automation Scope
-------------------------------------------------------------------------

-> Using drag & drop
-> Locating elements precisely.
-> Using appropriate synchronization technique.
-> Extracting menu items & store in collections
-> Scrolling up and down in web page
-> Filling form (in different objects in web page)
-> Capture warning message   
-> Taking Screenshots
-> Recorder


Technology/Automation Tools Used
-------------------------------------------------------------------------
1) Selenium Webdriver and it's concepts.
2) Maven
3) TestNG framework and it's concepts.
4) Data Driven approach
5) Page Object Model
6) Extent Report/ TestNG Report
7) Excel, and Property file concepts
8) Multiple Browser testing concepts
9) Java Concepts


                                  
## Author Information
 
- *Rajarshi Gangopadhyay(2303540)*

## Disclaimer
 
This project is intended for educational and testing purposes only. The authors are not responsible for any unauthorized use or modification of the code. Use at your own risk.
 
     

   