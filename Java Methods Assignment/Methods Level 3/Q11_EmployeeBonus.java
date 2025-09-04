import java.util.*;
public class Q11_EmployeeBonus {
    public static void main(String[] args) {
        int n = 10; 
        int[][] employeeData = generateEmployeeData(n);
        double[][] salaryData = calculateBonus(employeeData);
        displayTable(employeeData, salaryData);
    }
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); 
            int years = 1 + rand.nextInt(10);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        int n = data.length;
        double[][] result = new double[n][3];

        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; 
            } else {
                bonus = salary * 0.02; 
            }

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }
    public static void displayTable(int[][] employeeData, double[][] salaryData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-12s %-12s %-12s\n",
                "EmpID", "Years", "Old Salary", "Bonus", "New Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int years = employeeData[i][1];
            double oldSalary = salaryData[i][0];
            double bonus = salaryData[i][1];
            double newSalary = salaryData[i][2];

            totalOld += oldSalary;
            totalBonus += bonus;
            totalNew += newSalary;

            System.out.printf("%-10d %-10d %-12.2f %-12.2f %-12.2f\n",
                    (i + 1), years, oldSalary, bonus, newSalary);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-21s %-12.2f %-12.2f %-12.2f\n",
                "TOTAL", totalOld, totalBonus, totalNew);
        System.out.println("-------------------------------------------------------------");
    }

}
