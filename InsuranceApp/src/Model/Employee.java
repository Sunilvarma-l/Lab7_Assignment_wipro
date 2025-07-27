package Model;

public class Employee {
    private String designation;
    private String name;
    private String insuranceScheme;
    private int id;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

   
    public String getDesignation() {
        return designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    
    public void setScheme(String scheme) {
        this.insuranceScheme = scheme;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Designation: " + designation +
               ", Salary: " + salary +
               ", Insurance Scheme: " + insuranceScheme;
    }
}


