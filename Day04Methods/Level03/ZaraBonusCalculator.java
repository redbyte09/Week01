public class ZaraBonusCalculator {

    // Method to generate random salary 
    //and method for generating years of service for each employee
    public static int[][] generateEmployeeData() {
        int[][] employeeData = new int[10][2]; 

        for (int i = 0; i < 10; i++) {
            // Generating random 5-digit salary (between 10000 and 99999)
            employeeData[i][0] = (int) (Math.random() * (99999 - 10000 + 1) + 10000);
            // Generating random years of service (between 1 and 10 years)
            employeeData[i][1] = (int) (Math.random() * 10) + 1;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] updatedData = new double[10][3]; 

        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonusAmount;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // Method to calculate and display the total sum of old salary, new salary, and total bonus
    public static void displaySummary(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonusAmount = 0;

        System.out.println("Employee\tOld Salary\tBonus Amount\tNew Salary");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonusAmount += updatedData[i][1];
            totalNewSalary += updatedData[i][2];

            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",
                    (i + 1), updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("Total\t\t%.2f\t\t%.2f\t\t%.2f\n",
                totalOldSalary, totalBonusAmount, totalNewSalary);
    }

    public static void main(String[] args) {
        // Generate employee data
        int[][] employeeData = generateEmployeeData();

        // Calculate new salary and bonus
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);

        // Display the summary
        displaySummary(updatedData);
    }
}
