package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyDetails implements CompanyFunctions
{
    DailyWage dailyWage = new DailyWage();
    Scanner scanner = new Scanner(System.in);
    Company company = new Company();
    List<Object> companyList = new ArrayList<>();
    @Override
    public void addCompany()
    {
        System.out.println("Enter Company Name");
        String companyName = scanner.next();
        System.out.println("Enter Employee of the Company Hours of Works Per Day");
        int workingHours = scanner.nextInt();
        System.out.println("Enter Employee of the Company Wages Per Hour");
        int wagePerHour = scanner.nextInt();
        System.out.println("Enter Company Total Working Days for a Month");
        int totalDays = scanner.nextInt();
        int dayWage = dailyWage.calculateWage(workingHours,wagePerHour);
        int monthlyWage = dailyWage.monthlyWage(workingHours,wagePerHour,totalDays);
        Company company = new Company(companyName,workingHours,wagePerHour,totalDays,dayWage,monthlyWage);
        companyList.add(company);
        System.out.println("Company Added " + company);
    }
}
