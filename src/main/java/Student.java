import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades = new ArrayList<>();


    private Student (String name) {
        this.name = name;
    }

    private Student (String name, List<Integer> grades) {
        this.name = name;
        this.grades=grades;
    }

    public static Student createStudent(String name) {
        return new Student(name);
    }
    public static Student createStudent(String name, List<Integer> grades) {
        for (int i=0; i<grades.size()-1; i++){
            if (grades.get(i) < 2 || grades.get(i) > 5) throw new IllegalArgumentException("Grade must be between 2 and 5");
        }

        return new Student(name, grades);
    }

    public void addGrade (int grade) {
        if (grade < 2 || grade > 5) throw new IllegalArgumentException("Grade must be between 2 and 5");
        grades.add(grade);
    }
    public List<Integer> getGrades() {
        List<Integer> gradesList = new ArrayList<>(grades);
        return gradesList;
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}
