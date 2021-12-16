import java.util.*;

class Main {

  public static void main(String[] args) {

    // main data structures
    int monthDays[] = 
    { 
      31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 
    };
    String monthName[] = 
    { 
      "January", "February", "March", "April", "May", "June", "July", 
      "August", "September", "October", "November", "December" 
    };

    int maxMonth = 0;

    // create app object
    Main app = new Main();

    // main step module calls for the app

    maxMonth = app.findMaxMonth(monthDays);   

    app.countMonths(maxMonth, monthName, monthDays);

  } // end main


  int findMaxMonth(int[] monthDays) {
    // number of days in the month with shortest name

    // local variable
    int maxMonth = monthDays[0];
    int maxMonthPosition = 0;

    for (int i = 1; i < monthDays.length; i++) {
      if (monthDays[i] > maxMonth) {
        maxMonth = monthDays[i];
        maxMonthPosition = i;
      } // end if
    } // end for

    return maxMonth;

  } // end findMaxMonth 


  // countMonths module code
  void countMonths(int maxMonth, String[] monthName, int[] monthDays) {

    // initialise the count and total
    int countMonths = 0;
    int totalDays = 0;

    for (int i = 0; i < monthName.length; i++) {

      if (monthDays[i] == maxMonth) {
        countMonths++;
        // add on the days in this month to total
        totalDays = totalDays + maxMonth;
        System.out.print(monthName[i] + "\n");
      } // end if
    } // end for

    System.out.println("Number of months : " + countMonths);
    System.out.println("Number of days : " + totalDays);
  } // end countMonths

} // end class