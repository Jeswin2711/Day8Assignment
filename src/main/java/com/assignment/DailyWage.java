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

    /*
    A function to add a part-time Employee and Wage
     */
    void partTimeWage(int attendance)
    {
        int fullDayWork = 4 ;
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
