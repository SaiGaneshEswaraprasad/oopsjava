import java.util.*;

class Employee {
    String name;
    String id;
    int baseSalary;
    int overtimeRate;
    int leaveBalance;
    int overtimeHours;
    int salaryLoss;

    void requestLeave(Scanner scanner) {
        System.out.println("Enter the number of days for leave:");
        int days = scanner.nextInt();

        if (days > leaveBalance) {
            // Prompt user for salary loss per day of leave
            System.out.println("Enter the salary loss per day of leave:");
            int salaryLossPerDay = scanner.nextInt();

            // Calculate salary loss for the difference in days
            int additionalDays = days - leaveBalance;
            int salaryLoss = additionalDays * salaryLossPerDay;

            System.out.println(name + " has requested " + days + " days leave.");
            System.out.println("Salary loss for leave: $" + salaryLoss);
        } else {
            System.out.println(name + " has requested " + days + " days leave.");
            System.out.println("No salary loss for leave as it does not exceed the leave balance.");
        }

        leaveBalance -= days;
    }

    void recordOvertime(Scanner scanner) {
        System.out.println("Enter the number of overtime hours worked:");
        int hours = scanner.nextInt();
        overtimeHours += hours;
        System.out.println(name + " has recorded " + hours + " hours of overtime.");
    }

    void calculateSalary() {
        int totalSalary = baseSalary + (overtimeRate * overtimeHours) - salaryLoss;
        System.out.println(name + "'s total salary for the month is: $" + totalSalary);
    }
}

public class payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an employee
        Employee employee1 = new Employee();
        System.out.println("Enter employee name:");
        employee1.name = scanner.nextLine();
        System.out.println("Enter employee ID:");
        employee1.id = scanner.nextLine();
        System.out.println("Enter base salary:");
        employee1.baseSalary = scanner.nextInt();
        System.out.println("Enter overtime rate:");
        employee1.overtimeRate = scanner.nextInt();
        System.out.println("Enter initial leave balance:");
        employee1.leaveBalance = scanner.nextInt();

        // Interaction with the employee
        System.out.println("\nEmployee Information:\n" + employee1.name + " - " + employee1.id);

        // Requesting leave
        employee1.requestLeave(scanner);
        
        // Recording overtime
        employee1.recordOvertime(scanner);

        // Calculating salary
        employee1.calculateSalary();
    }
}
