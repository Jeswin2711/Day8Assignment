package com.assignment;

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
        int employeeAttendance = employee.getAttendance();
        employee.calculateWage(employeeAttendance);
        int partTimeEmployee = employee.getAttendance();
        employee.partTimeWage(partTimeEmployee);

    }
}
