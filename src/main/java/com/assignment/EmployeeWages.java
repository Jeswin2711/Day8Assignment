package com.assignment;

import java.util.Scanner;

public class EmployeeWages extends EmployeeAttendance
{
    /*
    Static Class Variables To Calculate Employee Wages Using Class Methods
     */
    static int fullDayWork = 8 ;
    static int wagePerHour = 20 ;
    static int totalWage = 0 ;
    /*
    Main Class to create Objects and access Class function
     */
    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Computation Program");
        System.out.println("--------------------------------------------");
        EmployeeAttendance employee = new EmployeeAttendance();
        System.out.println("Employee Role");
        System.out.println("Enter 0 For PART-TIME OR Enter 1 for FULL-TIME");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        switch (ch)
        {
            case 0 :
                System.out.println("---- PART TIME EMPLOYEE ----");
                int partTimeEmp = employee.getAttendance();
                employee.calculateWage(partTimeEmp , 0);
                break;
            case 1 :
                System.out.println("---- FULL TIME EMPLOYEE ----");
                int fullTimeEmp = employee.getAttendance();
                employee.calculateWage(fullTimeEmp , 1);
                if ( fullTimeEmp != 0 )
                {
                    employee.monthlyWage();
                    System.out.println("Employee Wages Using Condition " + employee.calculateWagesUsingCondition(fullTimeEmp));
                }
                break;
        }

        System.out.println("\n --------Calculating Wage Inside the Main Class--------");
        int attendance = employee.getAttendance();
        calculateWage(attendance);
    }

    /*
    Refactor the Code to write a Class Method to Compute Employee Wage
     */
    static void calculateWage( int attendance)
    {

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
