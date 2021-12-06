package Task3;

import java.util.*;
import java.util.stream.Collectors;

public class Students {
    private List<Student> students;

    public Students(final List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public void addSubject(final List<Subject> subjects, final String name) {
        final Subject subject = new Subject(name);
        subjects.add(subject);

        final List<Mark> mark = new ArrayList<>(students.size());
        for (int i = 0; i < students.size(); i++) {
            final Mark mark1 = new Mark();
            mark.add(mark1);
        }
        for (int i = 0; i < students.size(); i++) {
            students.get(i).getMarks().add(mark.get(i));
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (final Student student : students) {
            res += "Student { " + "name= " + student.getName() +
                    ", surName= " + student.getSurName();
            for (final Subject subject : student.getSubject()) {
                res += ", subject= " + subject.getNameSubject() + "{ ";
                for (final Integer txt : student.getMarks().get(student.getSubject().indexOf(subject)).getMark())
                    res += txt + " ";
                res += "}";
            }
            res += " }" + '\n';
        }
        return res;
    }

    public Student bestStudentStream() {
        return students.stream()
                .reduce((a, b) -> a.averageMark() > b.averageMark() ? a : b)
                .get();
    }

    public List<Student> filterStudent() {
        return students.stream()
                .filter(e -> e.averageMark() > 3)
                .toList();
    }

    public List<Student> sortStudents() {
        return students.stream()
                .sorted((o1, o2) -> {
                    if (o1.getSurName() != o2.getSurName())
                        return o1.getSurName().compareTo(o2.getSurName());
                    else if (o1.getName()!= o2.getName())
                        return o1.getName().compareTo(o2.getName());
                    else return o1.getFatherName().compareTo(o2.getFatherName());
                }).collect(Collectors.toList());
    }

    public String printSurnameHyphen() {
        return students.stream()
                .map(Student::getSurName)
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("No");
    }
}