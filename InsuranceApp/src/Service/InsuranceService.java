package Service;

import Model.Employee;
import java.util.*;

public class InsuranceService {
    private HashMap<Integer, Employee> empMap = new HashMap<>();

    // Assign insurance scheme based on salary and designation
    public String assignScheme(Employee emp) {
        String desig = emp.getDesignation().toLowerCase();
        double sal = emp.getSalary();

        if (sal < 5000 && desig.equals("clerk"))
            return "No Scheme";
        else if (sal > 5000 && sal < 20000 && desig.equals("system associate"))
            return "Scheme C";
        else if (sal >= 20000 && sal < 40000 && desig.equals("programmer"))
            return "Scheme B";
        else if (sal >= 40000 && desig.equals("manager"))
            return "Scheme A";
        else
            return "No Scheme";
    }

    // Add employee to HashMap
    public void addEmployee(Employee emp) {
        emp.setScheme(assignScheme(emp));
        empMap.put(emp.getId(), emp);
        System.out.println("Employee added successfully.");
    }

    
    public void displayByScheme(String scheme) {
        System.out.println("Employees with " + scheme + ":");

        empMap.values().stream()
            .filter(emp -> emp.getInsuranceScheme().equalsIgnoreCase(scheme))
            .forEach(System.out::println);
    }

    
    public void deleteEmployee(int id) {
        if (empMap.remove(id) != null) {
            System.out.println("Employee removed.");
        } else {
            System.out.println("Employee not found.");
        }
    }

 
    public void displaySortedBySalary() {
        System.out.println("Employees sorted by salary:");

        empMap.values().stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .forEach(System.out::println);
    }
}

