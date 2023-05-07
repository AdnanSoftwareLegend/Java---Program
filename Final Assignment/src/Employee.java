public class Employee {
    private int employeeID;
    private String name;

    private double salary;


    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }
    public int getEmployeeId() {
        return employeeID;
    }
    public String getName() {
        return name;
    }
    public double getSalary(){
        return salary ;
    }


    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + name + ", Salary: " + salary;
    }



}