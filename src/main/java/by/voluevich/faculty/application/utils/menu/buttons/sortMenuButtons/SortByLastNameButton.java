package by.voluevich.faculty.application.utils.menu.buttons.sortMenuButtons;

import by.voluevich.faculty.application.utils.Dependencies;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.entity.Student;

import java.util.Comparator;
import java.util.List;

public class SortByLastNameButton implements ButtonAction {

    @Override
    public void tap() {
        List<Student> students = Dependencies.studentsController.getStudents();
        students
                .stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .forEach(System.out::println);
    }

    @Override
    public String name() {
        return "Sort students by last name.";
    }
}
