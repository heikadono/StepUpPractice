import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //7.3 Студент
        // Лист создан для инициализации первоначального списка оценок (если требуется), при инициализации из параметра подобным методом лист не модифицируем
        List<Integer> grades = new ArrayList<>(Arrays.asList(3, 2, 3));

        Student studentNikita = Student.createStudent("Никита");
        Student studentVlad = Student.createStudent("Vlad", grades);
        System.out.println(studentVlad);
        System.out.println(studentNikita);
        System.out.println(studentVlad.getGrades());
        studentNikita.addGrade(5);
        System.out.println(studentNikita);
        studentVlad.addGrade(4);
        studentVlad.addGrade(2);
        studentVlad.addGrade(5);
        System.out.println(studentVlad);
        studentNikita.addGrade(4);
        studentNikita.addGrade(2);
        studentNikita.addGrade(5);
        System.out.println(studentNikita);




    }
}
