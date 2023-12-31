package com.employeewage;

public class Day3_EmployeeWage {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    public EmpWageBuilder(String company, int empRatePerHour,
                          int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        private int numOfCompany=0;
        private CompanyEmpWage[] companyEmpWageArray;
    public Day3_EmployeeWage () {
            companyEmpWageArray=new CompanyEmpWage[5];
        }
        public void computeEmpWage() {
            private void addCompanyEmpWage (String company,int empRatePerHour, int numOfWorkingDays,
            int maxHoursPerMonth){
                companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
                numOfCompany++;
            }
            private void computeEmpWage () {
                for (int i = 0; i < numOfCompany; i++) {
                    companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
                    System.out.println(companyEmpWageArray[i]);
                }
            }
            private int computeEmpWage (CompanyEmpWage companyEmpWage){
                // Variables
                int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;
                //Computation
                while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
                    while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
                        totalWorkingDays++;
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        //Math.floor rounds off the values like 2.333 to 2
                        switch (empCheck) {
                            case IS_PART_TIME:
                                empHrs = 4;
                                break;
                            case IS_FULL_TIME:
                                empHrs = 8;
                                break;
                            default:
                                empHrs = 0;
                                break;
                        }
                        totalEmpHrs += empHrs;
                        System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
                    }
                    totalEmpWage = totalEmpHrs * empRatePerHour;
                }
                public String toString () {
                    return "Total emp wage for company: " + company + " is: " + totalEmpWage;
                    return totalEmpHrs * companyEmpWage.empRatePerHour;
                }
                public static void main (String[]args){
                    Day3_EmployeeWage  dMart = new Day3_EmployeeWage ("DMart", 20, 2, 10);
                    Day3_EmployeeWage  reliance = new Day3_EmployeeWage ("Reliance", 10, 4, 20);
                    dMart.computeEmpWage();
                    System.out.println(dMart);
                    reliance.computeEmpWage();
                    System.out.println(reliance);
                    Day3_EmployeeWage  emp = new Day3_EmployeeWage();
                    emp.addCompanyEmpWage("DMart", 20, 2, 10);
                    emp.addCompanyEmpWage("Reliance", 10, 4, 20);
                    emp.computeEmpWage();
                }
            }
        }



