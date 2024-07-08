public class HourlyEmployee extends Employee 
{
    private double hourly_rate;
    private int hourly_worked;

    public HourlyEmployee(String fn, String ln, int id, String department, double hourly_rate, int hourly_worked) {
        super(fn, ln, id, department);
        this.hourly_rate = hourly_rate;
        this.hourly_worked = hourly_worked;
    }

    public double getHourly_rate() { return hourly_rate; }

    public int getHourly_worked() { return hourly_worked; }

    @Override public double getTotalHours() { return hourly_worked; }

    @Override public double getAverageHoursPerWeek() { return (double) hourly_worked /  4; } // Assuming  4 weeks

    @Override public double getTotalWages() { return hourly_rate * hourly_worked; }

}