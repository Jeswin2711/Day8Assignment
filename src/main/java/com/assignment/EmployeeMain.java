package com.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Employee Wage Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        CompanyDetails companyDetails = new CompanyDetails();
        while (true) {
            System.out.println("Enter 1 to Add a Company");
            System.out.println("Enter 2 to Exit");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    companyDetails.addCompany();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
