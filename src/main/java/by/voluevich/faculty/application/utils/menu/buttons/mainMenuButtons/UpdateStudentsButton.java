package by.voluevich.faculty.application.utils.menu.buttons.mainMenuButtons;

import by.voluevich.faculty.application.utils.Dependencies;
import by.voluevich.faculty.application.utils.Input;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.controllers.StudentsController;
import by.voluevich.faculty.entity.Student;

import java.time.LocalDate;

public class UpdateStudentsButton implements ButtonAction {

    @Override
    public void tap() {
        StudentsController studentsController = Dependencies.studentsController;
        studentsController.updateStudent(new Student(
                Input.getInt("Enter ID."),
                Input.getString("Enter first name."),
                Input.getString("Enter last name."),
                LocalDate.of(
                        Input.getInt("Enter the year of birth."),
                        Input.getInt("Enter the month of birth."),
                        Input.getInt("Enter the day of birth."))));
    }

    @Override
    public String name() {
        return "Update student.";
    }
}
