package Client;

import Model.Employee;
import Service.InsuranceService;
import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsuranceService service = new InsuranceService();

        while (true) {
            System.out.println("\n--- Insurance Scheme App ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display by Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Sort by Salary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, designation, salary);
                    service.addEmployee(emp);
                }

                case 2 -> {
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Scheme to search: ");
                    String scheme = sc.nextLine();
                    service.displayByScheme(scheme);
                }

                case 3 -> {
                    System.out.print("Enter Employee ID to delete: ");
                    int id = sc.nextInt();
                    service.deleteEmployee(id);
                }

                case 4 -> service.displaySortedBySalary(); // ✅ Corrected method name

                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
