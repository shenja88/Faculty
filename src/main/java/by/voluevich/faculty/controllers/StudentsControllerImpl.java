package by.voluevich.faculty.controllers;

import by.voluevich.faculty.typeDAO.SerializationStudentsDAO;
import by.voluevich.faculty.typeDAO.StudentsDAO;
import by.voluevich.faculty.entity.Student;
import by.voluevich.faculty.exceptions.DuplicatedStudentsException;

import java.util.List;

public class StudentsControllerImpl implements StudentsController{
    private final StudentsDAO data = new SerializationStudentsDAO();
//    private final StudentsDAO dataBase = new DBPStudentsDAO();

    @Override
    public void addStudent(Student student) throws DuplicatedStudentsException{
        if(data.getStudents().contains(student)) {
           throw new DuplicatedStudentsException(student.getId());
        } else{
            data.addStudent(student);
        }
    }

    @Override
    public List<Student> getStudents() {
        return data.getStudents();
    }

    @Override
    public void updateStudent(Student student) {
        data.updateStudent(student);
    }

    @Override
    public void removeStudent(int idStudent) {
    data.removeStudent(idStudent);
    }
}
