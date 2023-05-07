public class Test {

    public static void main(String[] args) {

        Professor professor = new Professor(1001, "John Smith", 80000.0, "Computer Science");
        Administrator administrator = new Administrator(2001, "Jane Doe", 60000.0, "Student Affairs");
        SupportStaff supportStaff = new SupportStaff(3001, "Bob Johnson", 40000.0, "Receptionist");

        // Print out the details of each employee
        System.out.println(professor.toString());
        System.out.println(administrator.toString());
        System.out.println(supportStaff.toString());

        // Create an array of employees
        Employee[] employees = {professor, administrator, supportStaff};

        // Calculate the total salary of all employees
        double totalSalary = Employee.totalSalary(employees);
        System.out.println("Total Salary: " + totalSalary);
    }
}
