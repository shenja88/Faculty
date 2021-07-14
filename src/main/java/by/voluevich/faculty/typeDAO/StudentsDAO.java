package by.voluevich.faculty.typeDAO;

import by.voluevich.faculty.entity.Student;

import java.util.List;

public interface StudentsDAO {

    void addStudent(Student student);

    List<Student> getStudents();

    void updateStudent(Student student);

    void removeStudent(int id);

}
