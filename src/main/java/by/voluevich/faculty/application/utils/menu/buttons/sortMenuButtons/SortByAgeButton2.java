package by.voluevich.faculty.application.utils.menu.buttons.sortMenuButtons;

import by.voluevich.faculty.application.utils.Dependencies;
import by.voluevich.faculty.application.utils.Input;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.entity.Student;

import java.util.Comparator;
import java.util.List;

public class SortByAgeButton2 implements ButtonAction {

    @Override
    public void tap() {
        List<Student> students = Dependencies.studentsController.getStudents();
        int ageFilter = Input.getInt("Enter age for filter.");
        students
                .stream()
                .sorted(Comparator.comparing(Student::getBirthDate))
                .filter((x) -> x.getAgeStudent() < ageFilter)
                .forEach(System.out::println);
    }
    @Override
    public String name() {
        return "Sort students by age with filter.";
    }
}
