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


    /*
        Calculate Wages till a condition of total
        working hours or days is reached for a month
     */

    double calculateWagesUsingCondition(int attendance)
    {
        int days=0;
        double wagesTotal = 0;
        int hours=0;
        int ch = 0;
        while (true)
        {

            if(attendance == 1)
            {
                ch = 1;
            }
            else
            {
                System.out.println("Employee is Absent");
                break;
            }
            switch (ch)
            {
                case 1:
                    days++;
                    hours +=8;
                    break;
                case 2:
                    days++;
                    hours +=4;
                    break;
            }
            if(days > 20 || hours >= 100){
                break;
            }
            wagesTotal = days * 8 * 20;
        }
        return wagesTotal;
    }

}
