package com.assignment;

import java.util.Scanner;

public class EmployeeWages extends EmployeeAttendance
{
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
                }
                break;
        }
    }
}
