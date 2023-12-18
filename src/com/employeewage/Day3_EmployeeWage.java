package com.employeewage;

public class Day3_EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;

    private final int maxHoursPerMonth;

    private int totalEmpWage;

    public Day3_EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays,
                             int maxHoursPerMonth) {

            this.company=company;
            this.empRatePerHour=empRatePerHour;
            this.numOfWorkingDays=numOfWorkingDays;
            this.maxHoursPerMonth = maxHoursPerMonth;

    public void computeEmpWage() {

    int empHrs, totalEmpHrs = 0, totalWorkingDays = 0;
    while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {

    totalWorkingDays++;

    int empCheck= (int) Math.floor(Math.random()*10) % 3;
    switch (empCheck) {
            case IS_PART_TIME:
                empHrs 4;
                break;
                case IS_FULL_TIME:
                    empHrs 8:
                    break;
        default:
            empHrs 0;
    }

    totalEmpHrs+=empHrs;
    System.out.println("Day:"+totalWorkingDays +"Emp Hr:" + empHrs);
        }

    totalEmpwage=totalEmpHrs*empRatePerHour;

} @verride

public String toString() {

        return "Total Emp Wage for Company:"+company+ "is:"+totalEmpwage;
}
    public static void main(String[] args) {

        Day3_EmployeeWage dMart = new Day3_EmployeeWage("DMart", 20, 2, 10);

        Day3_EmployeeWage reliance new Day3_EmployeeWage("Reliance, 10, 4, 20);

                dMart.computeEmpWage();

        System.out.println(dMart);
        reliance.computeEmpwage();

        System.out.println(reliance);
    }
}



