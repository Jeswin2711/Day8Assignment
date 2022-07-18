package com.assignment;

class DailyWage
{
    /*
    funtion to Calculate the Wage of a Employee
     */
    void calculateWage(int attendance)
    {
        int fullDayWork = 8 ;
        int wagePerHour = 20 ;
        int totalWage = 0 ;
        if ( attendance == 0)
        {
            System.out.println("Employee Salary = 0 ");
        }
        else
        {
            totalWage = fullDayWork * wagePerHour ;
            System.out.println("Employee Salary = " + totalWage );
        }

    }
}
