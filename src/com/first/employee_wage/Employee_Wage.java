package com.first.employee_wage;

import java.util.Random;

public class Employee_Wage {
    public static void main(String[] args) {
        int totalSalary = 0;
        int salary = 0;
        int empHr = 0;
        int ratePerHr = 20;

        for(int i = 0; i<=20; i++ ) {
            Random random = new Random();
            int random_num = random.nextInt(3);

            if (random_num == 1) {
                empHr = 8;

            } else if (random_num == 2) {
                empHr = 4;
            } else {
                empHr = 0;
            }
            salary = empHr * ratePerHr;
            totalSalary = salary + totalSalary;
        }
        System.out.println("20 days employee wage is : " + totalSalary);

    }
}
