# Orbita
A java package for DATE and TIME operations/manipulations.

##  Getting started..
 - paste the **orbita** package folder in your project source folder.
 - import the orbita package in your current working class.
 - create a new instance of the Dater or Timer object using the format:
   ```java
   //for date 
   Dater variable = new Dater();
   
   //for time 
   Timer variable = new Timer();
   ```
  
##  Operations/Manipulations..
 - the Dater class has the following date operations/manipulatrions:
  ```java
  //get date range from date(dd-MM-yyyy) argument [string]
  variable.dateRangeFrom(argument);
  
  //get current date in the format yyyy-MM-dd [string]
  variable.getDate();
  
  //get current weekday [string]
  variable.getDay();
  
  //get current day date [int]
  variable.getDayNum();
  
  //get current month [string]
  variable.getMonth();
  
  //get current month [int]
  variable.getMonthNum();
  
  //get current week [int]
  variable.getWeek();
  
  //get current year [int]
  variable.getYear();
  ```
  - the Timer class has the following time operations/manipulations:
  ```java
  //get current time in the format HH:mm (24 hrs) [string]
  variable.getTime();
  
  //get current hour [int]
  variable.getHour();
  
  //get current minute [int]
  variable.getMin();
  
  //get current second [int]
  variable.getSec();
  
  //get time range from time(HH:mm) argument [string] 
  variable.TimeRangeFrom(time);
  ```
  
##  License
**orbita** is released under the [MIT License](https://github.com/dev-charles15531/Orbita/blob/master/LICENSE.md).

Created by **[Charles Paul](https://github.com/dev-charles15531)**
