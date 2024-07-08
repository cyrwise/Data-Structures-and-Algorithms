public class Employee extends Person 
{
    protected String department;

    public Employee(String fn, String ln, int id, String department) 
    {
        super(fn, ln, id);
        this.department = department;
    }

    public String getDepartment() { return department; }

    // Methods to be overridden by subclasses
    public double getTotalHours() { return  0; }

    public double getAverageHoursPerWeek() { return  0; }

    public double getTotalWages() { return  0; }

}