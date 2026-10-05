import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private static final ArrayList<Employee> employees = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    updateEmployee();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    searchEmployee();
                    break;
                case 5:
                    listEmployees();
                    break;
                case 6:
                    showHighestSalary();
                    break;
                case 7:
                    showAverageSalary();
                    break;
                case 8:
                    filterByDepartment();
                    break;
                case 9:
                    running = false;
                    System.out.println("Exiting Employee Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 9.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Search Employee");
        System.out.println("5. List Employees");
        System.out.println("6. Highest Salary");
        System.out.println("7. Average Salary");
        System.out.println("8. Department Filter");
        System.out.println("9. Exit");
    }

    private static void addEmployee() {
        int id = readInt("Enter employee ID: ");
        if (findEmployeeById(id) != null) {
            System.out.println("An employee with that ID already exists.");
            return;
        }

        String name = readRequiredText("Enter employee name: ");
        String department = readRequiredText("Enter department: ");
        double salary = readSalary();
        employees.add(new Employee(id, name, department, salary));
        System.out.println("Employee added successfully.");
    }

    private static void updateEmployee() {
        int id = readInt("Enter employee ID to update: ");
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        employee.setName(readRequiredText("Enter new name: "));
        employee.setDepartment(readRequiredText("Enter new department: "));
        employee.setSalary(readSalary());
        System.out.println("Employee updated successfully.");
    }

    private static void deleteEmployee() {
        int id = readInt("Enter employee ID to delete: ");
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee not found. No employee was deleted.");
            return;
        }

        employees.remove(employee);
        System.out.println("Employee deleted successfully.");
    }

    private static void searchEmployee() {
        int id = readInt("Enter employee ID to search: ");
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        employee.displayDetails();
    }

    private static void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees to display.");
            return;
        }

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }

    private static void showHighestSalary() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees to compare.");
            return;
        }

        Employee highestPaid = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getSalary() > highestPaid.getSalary()) {
                highestPaid = employee;
            }
        }

        System.out.println("Employee with the highest salary:");
        highestPaid.displayDetails();
    }

    private static void showAverageSalary() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees to calculate an average.");
            return;
        }

        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        System.out.printf("Average salary: %.2f%n", totalSalary / employees.size());
    }

    private static void filterByDepartment() {
        String department = readRequiredText("Enter department to search: ");
        boolean found = false;

        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                employee.displayDetails();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found in that department.");
        }
    }

    private static Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Invalid input. Please enter a whole number.");
            }
        }
    }

    private static double readSalary() {
        while (true) {
            System.out.print("Enter salary: ");
            String input = scanner.nextLine().trim();
            try {
                double salary = Double.parseDouble(input);
                if (Double.isFinite(salary) && salary >= 0) {
                    return salary;
                }
                System.out.println("Salary must be a finite, non-negative number.");
            } catch (NumberFormatException exception) {
                System.out.println("Invalid input. Please enter a number for salary.");
            }
        }
    }

    private static String readRequiredText(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be blank.");
        }
    }
}