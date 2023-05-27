package com.first.employee_wage;

import java.util.Random;

public class Employee_Wage {
    public static void main(String[] args) {
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalSalary = 0;
        int salary = 0;
        int empHr = 0;
        int ratePerHr = 20;

            while(totalEmpHrs < 100 || totalWorkingDays < 20){
            Random random = new Random();
            int random_num = random.nextInt(3);

            if (random_num == 1) {
                empHr = 8;

            } else if (random_num == 2) {
                empHr = 4;
            } else {
                empHr = 0;
            }
            totalWorkingDays++;
            totalEmpHrs = empHr + totalEmpHrs;

            salary = empHr * ratePerHr;
            totalSalary = salary + totalSalary;
        }
        System.out.println("Total working days : " + totalWorkingDays);
        System.out.println("Total working Hrs : " + totalEmpHrs);
        System.out.println("20 days employee wage is : " + totalSalary);

    }
}
