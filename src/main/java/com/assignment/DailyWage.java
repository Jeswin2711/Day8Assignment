package com.assignment;

class DailyWage
{
    int fullDayWork = 8 ;
    int wagePerHour = 20 ;
    int totalDays = 20 ;
    /*
    funtion to Calculate the Wage of a Employee
     */
    void calculateWage(int attendance , int employee)
    {
        if(employee == 0)
        {
            fullDayWork = 4;
        }
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
    Function to Calculate Monthly Wage
     */

    void monthlyWage()
    {
        int monthSalary = 0 ;
        monthSalary = fullDayWork * wagePerHour * totalDays;
        System.out.println("Monthly Salary = " + monthSalary);
    }

}
