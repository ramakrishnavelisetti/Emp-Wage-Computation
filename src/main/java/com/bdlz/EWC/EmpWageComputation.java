package com.bdlz.EWC;

public class EmpWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int totalempWage = 0;
        for (int day = 1; day<=NO_OF_WORKING_DAYS; day++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalempWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage: " + totalempWage);
    }
}