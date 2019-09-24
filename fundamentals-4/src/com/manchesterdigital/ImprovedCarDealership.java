package com.manchesterdigital;

public class ImprovedCarDealership {

    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary = 20000;
        int numberOfsales = 1000;
        double commissionRate = 3.0;

        calcSalary(taxYearEnded, numberOfsales, baseSalary, commissionRate);

        numberOfsales = 300;
        baseSalary = 250000;
        commissionRate = 2.0;

        calcSalary(taxYearEnded, numberOfsales, baseSalary, commissionRate);
    }

    private static void calcSalary(boolean taxYearEnded, int numberOfSales, double baseSalary, double commissionRate){
        if(taxYearEnded){
            int bonus = 1000;
            double totalSalary = baseSalary;

            if(numberOfSales > 500){
                totalSalary = baseSalary + (numberOfSales * commissionRate);
                totalSalary += bonus;
            }

            System.out.println("Total salary is: " + totalSalary);
        }
    }
}
