package com.assignment;


import java.text.DecimalFormat;

/*
Class to return Employee Attendance
 */


class EmployeeAttendance
{
    private int attendance;

    int getAttendance()
    {
        DecimalFormat df = new DecimalFormat("#");
        attendance = Integer.parseInt(df.format(Math.floor(Math.random() * 1000 % 2)));
        if (attendance == 0 )
        {
            System.out.println("Employee is Absent");
        }
        else
        {
            System.out.println("Employee is Present");
        }
        return attendance;
    }
}

