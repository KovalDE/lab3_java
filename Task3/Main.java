package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {

        final Subject english = new Subject("English");
        final Subject proga = new Subject("Programming");
        final Subject math = new Subject("Math");

        final List<Subject> subjects = new ArrayList<>();
        subjects.add(english);
        subjects.add(proga);
        subjects.add(math);

        final Student stud1 = new Student("Evgen", "Koval", "Evgenievich", subjects);
        final Student stud2 = new Student("Dmytro", "Koval", "Evgenievich", subjects);
        final Student stud3 = new Student("Larisa", "Koval", "Vyacheslavivna", subjects);

        final List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);

        final StudentSimple studentSimples = new StudentSimple();
        studentSimples.transformationList(students);

        students.get(0).addMark(2, "English");
        students.get(0).addMark(1, "English");
        students.get(0).addMark(3, "English");

        students.get(1).addMark(5, "English");
        students.get(2).addMark(4, "English");

        students.get(0).addMark(1, "Programming");
        students.get(1).addMark(5, "Programming");
        students.get(2).addMark(4, "Programming");

        students.get(0).addMark(1, "Math");
        students.get(1).addMark(5, "Math");
        students.get(2).addMark(4, "Math");

        final Students studStream = new Students(students);
        studStream.addSubject(subjects,"Сircuitry");

        System.out.println("The best stundent : "+studStream.bestStudentStream());
        System.out.println("Sorted students : "+studStream.sortStudents());
        System.out.println("Filtred students with average mark >3 : "+studStream.filterStudent());



        students.get(0).addMark(2, "Сircuitry");
        students.get(1).addMark(5, "Сircuitry");
        students.get(2).addMark(4, "Сircuitry");
        System.out.println(studStream.printSurnameHyphen());

    }
}