package by.voluevich.faculty.application.utils.menu.buttons.mainMenuButtons;

import by.voluevich.faculty.application.utils.Dependencies;
import by.voluevich.faculty.application.utils.Input;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.controllers.StudentsController;
import by.voluevich.faculty.entity.Student;
import by.voluevich.faculty.exceptions.DuplicatedStudentsException;

import java.time.LocalDate;

public class AddStudentButton implements ButtonAction {

    @Override
    public String name() {
        return "Add student.";
    }

    @Override
    public void tap() {
        StudentsController studentsController = Dependencies.studentsController;
        try {
            studentsController.addStudent(new Student(
                    Input.getInt("Enter ID student."),
                    Input.getString("Enter first name student."),
                    Input.getString("Enter last name student."),
                    LocalDate.of(
                            Input.getInt("Enter the year of birth."),
                            Input.getInt("Enter the month of birth."),
                            Input.getInt("Enter the day of birth."))));
        } catch (DuplicatedStudentsException e) {
            System.out.println(e.getMessage());
        }
    }
}
