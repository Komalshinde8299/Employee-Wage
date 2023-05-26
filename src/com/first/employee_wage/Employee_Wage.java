package com.first.employee_wage;

import java.util.Random;

public class Employee_Wage {
    public static void main(String[] args) {
        System.out.println("* Welcome to Employee Wage Computation Program *");
        Random random = new Random();
        int random_num = random.nextInt(2);
        System.out.println("Random no genrated is : " +random_num);
        if(random_num == 0){
            System.out.println("Employee is absent");
        } else if (random_num == 1) {
            System.out.println("Employee is present");

        }


    }
}
