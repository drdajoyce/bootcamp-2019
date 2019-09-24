package com.manchesterdigital;

public class CarDealershipRewards {
    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary = 20000;
        int numberOfsales = 1000;
        double commissionRate = 3.0;
        int bonus = 1000;

        if(taxYearEnded){
            double totalSalary = baseSalary + (numberOfsales * commissionRate);

            if(numberOfsales > 500){
                totalSalary += bonus;

                System.out.println("Total salary is (after bonus: " + totalSalary);
            }
        }

        numberOfsales = 300;
        baseSalary = 250000;
        commissionRate = 2.0;

        if(taxYearEnded){
            double totalSalary = baseSalary + (numberOfsales * commissionRate);
            System.out.println("Total salary is: " + totalSalary);
        }
    }
}
