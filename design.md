# calendar design

The names of the 12 months and the number od days in each month are stored in 2 parallel arrays
* the program has to find the longest number of days in a month and then count the number of months of that length. 
* The names of the months should also be displayed and the total number of days overall.

```
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
```

## top level
```
1. find the longest number of days in a month IN: monthDays[], OUT: maxDays
2. count & display months with the most days, also total days IN: maxDays, monthDays[], monthName[]
```
---

## refinement 1
find longest days in a month IN: monthDays[], OUT: maxDays
```
1. set minMonth to first value in monthDays;
2. set minMonthPosition to 0;

3. loop with index from 1 to number of months
4.   if value at index position of monthDays > maxMonth {
5.     maxMonth = value at index position of monthDays
6.     set maxMonthPosition to index;
7.   end if
8. end for

9. return maxMonth;
```

---

## refinment 2
count & display months with the most days, and total days IN: maxDays, monthDays[], monthName[]
```
 1. set countMonths to 0
 2. set totalDays to 0

 3. loop with index from 0 to number of months

 4. if value at index position of monthDays = maxMonth)
 5.   add 1 to countMonths
 6.    add maxMonth to totalDays
 7.    display month at index position of monthName[]
 8.  end if
 9. end for

10. display "Number of months" with countMonths
11. display "Number of days" with totalDays

```

---