package by.voluevich.faculty.application.utils.menu.buttons.mainMenuButtons;

import by.voluevich.faculty.application.utils.Dependencies;
import by.voluevich.faculty.application.utils.Input;
import by.voluevich.faculty.application.utils.menu.buttons.ButtonAction;
import by.voluevich.faculty.entity.Student;

import java.util.List;

public class SearchStudentsButton implements ButtonAction {

    @Override
    public void tap() {
        List<Student> students = Dependencies.studentsController.getStudents();
        String lastNameStudent = Input.getString("Enter the student's last name");
        for (Student student : students) {
            if (student.getLastName().equals(lastNameStudent)) {
                System.out.println("ID " + student.getId() + ", first name " + student.getFirstName()
                        + ", last name " + student.getLastName() + ", age " + student.getAgeStudent());
            }
        }
    }

    @Override
    public String name() {
        return "Searching for a student by last name";
    }
}
