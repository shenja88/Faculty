package by.voluevich.faculty.controllers;

import by.voluevich.faculty.entity.Student;
import by.voluevich.faculty.exceptions.DuplicatedStudentsException;

import java.util.List;

public interface StudentsController {

    void addStudent(Student student) throws DuplicatedStudentsException;

    List<Student> getStudents();

    void updateStudent(Student student);

    void removeStudent(int idStudent);
}
