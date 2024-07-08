import java.util.ArrayList;

public class Q3tester {
    public static void main(String[] args)
    {
        // FulltimeEmployee
        FulltimeEmployee fulltimeEmployee = new FulltimeEmployee("John", "Doe",1049,  "Engineering",  50000.00);
        System.out.println("Fulltime Employee Details:");
        System.out.println("Total Hours: " + fulltimeEmployee.getTotalHours());
        System.out.println("Average Hours Per Week: " + fulltimeEmployee.getAverageHoursPerWeek());
        System.out.println("Total salary this month: " + fulltimeEmployee.getTotalWages());

        // HourlyEmployee
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane", "Smith", 2039,  "Sales",  20,  160);
        System.out.println("\nHourly Employee Details:");
        System.out.println("Total Hours: " + hourlyEmployee.getTotalHours());
        System.out.println("Average Hours Per Week: " + hourlyEmployee.getAverageHoursPerWeek());
        System.out.println("Total salary this month: " + hourlyEmployee.getTotalWages());

        // Student
        ArrayList<String> classesTaken = new ArrayList<>();
        classesTaken.add("Math");
        classesTaken.add("English");
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        Student student = new Student("Alice", "Johnson",  3, classesTaken, grades);
        System.out.println("\nStudent Transcript:");
        student.printTranscript();
    }
}