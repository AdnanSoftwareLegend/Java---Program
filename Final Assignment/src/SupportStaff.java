public class SupportStaff extends  Employee{


    private String jobTitle;

    public SupportStaff(int employeeID, String name, double salary) {
        super(employeeID, name, salary);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String toString() {
        return super.toString() + ", Job Title: " + jobTitle;
    }


}
