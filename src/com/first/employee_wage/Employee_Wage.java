package com.first.employee_wage;

import java.util.Random;

public class Employee_Wage {
    public static void main(String[] args) {
        int empHr = 0;
        int ratePerHr = 20;
        Random random = new Random();
        int random_num = random.nextInt(3);
        System.out.println("Random no genrated is : " +random_num);

        switch (random_num){
            case 1 :
                empHr = 8;
                System.out.println("Employee is present full time");
                break;
            case 2 :
                System.out.println("Employee is present part time");
                empHr = 4;
                break;
            default:
                System.out.println("Employee is absent");
        }
        System.out.println("Daily employee wage is : " + empHr * ratePerHr);

    }
}
