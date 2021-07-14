package by.voluevich.faculty.application.utils.menu.buttons.mainMenuButtons;

import by.voluevich.faculty.application.utils.Dependencies;
import by.voluevich.faculty.application.utils.Input;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.controllers.StudentsController;

public class RemoveStudentButton implements ButtonAction {

    @Override
    public void tap() {
        StudentsController studentsController = Dependencies.studentsController;
        studentsController.removeStudent(Input.getInt("Enter ID of student"));
    }

    @Override
    public String name() {
        return "Remove student.";
    }
}
