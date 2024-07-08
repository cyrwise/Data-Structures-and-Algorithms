import java.util.ArrayList;

public class Student extends Person 
{
    private ArrayList<String> classes_taken;
    private ArrayList<Integer> grades;

    public Student(String fn, String ln, int id, ArrayList<String> classes_taken, ArrayList<Integer> grades) {
        super(fn, ln, id);
        this.classes_taken = classes_taken;
        this.grades = grades;
    }

    public ArrayList<String> getClasses_taken() { return classes_taken; }

    public ArrayList<Integer> getGrades() { return grades; }

    public void printTranscript() {
        for (int i =  0; i < classes_taken.size(); i++) {
            System.out.println(classes_taken.get(i) + ": " + grades.get(i));
        }
    }
}