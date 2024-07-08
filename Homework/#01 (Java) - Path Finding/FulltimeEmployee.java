public class FulltimeEmployee extends Employee 
{
    private double salary;

    public FulltimeEmployee(String fn, String ln, int id, String department, double salary) 
    {
        super(fn, ln, id, department);
        this.salary = salary;
    }

    public double getSalary() { return salary; }

    @Override public double getTotalHours() { return  40 *  4; } // Assuming  40 hours per week for  4 weeks

    @Override public double getAverageHoursPerWeek() { return  40; } // Assuming  40 hours per week

    @Override public double getTotalWages() { return salary *  4; } // Salary for  4 weeks
    
}