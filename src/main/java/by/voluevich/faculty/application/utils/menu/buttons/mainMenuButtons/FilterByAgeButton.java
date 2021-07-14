package by.voluevich.faculty.application.utils.menu.buttons.mainMenuButtons;

import by.voluevich.faculty.application.utils.Dependencies;
import by.voluevich.faculty.application.utils.Input;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.entity.Student;

import java.util.List;

public class FilterByAgeButton implements ButtonAction {
    private String name;

    public FilterByAgeButton(String name) {
        this.name = name;
    }

    public FilterByAgeButton() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void tap() {
        List<Student> students = Dependencies.studentsController.getStudents();
        students
                .stream()
                .filter((x) -> x.getAgeStudent() < Input.getInt("Enter age for filter."))
                .forEach(System.out::println);
    }

    @Override
    public String name() {
        return name;
    }
}
