package by.voluevich.faculty.application.utils;

import by.voluevich.faculty.controllers.StudentsController;
import by.voluevich.faculty.controllers.StudentsControllerImpl;

public class Dependencies {
    public static StudentsController studentsController = new StudentsControllerImpl();
}
