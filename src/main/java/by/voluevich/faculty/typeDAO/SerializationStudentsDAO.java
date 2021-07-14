package by.voluevich.faculty.typeDAO;

import by.voluevich.faculty.entity.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationStudentsDAO implements StudentsDAO {
    private static final String DATA = "StudentsList.bin";

    @Override
    public void addStudent(Student student) {
        List<Student> list = getStudents();
        list.add(student);
        saveListStudents(list);
    }

    @Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DATA))) {
            students = (List<Student>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void updateStudent(Student student) {
        List<Student> list = getStudents();
        int idx = list.indexOf(student);
        if (idx != -1) {
            list.set(idx, student);
            saveListStudents(list);
        } else {
            System.out.printf("No student with ID %s.\n Repeat entry ID.\n", idx);
        }
    }

    @Override
    public void removeStudent(int id) {
        List<Student> list = getStudents();
        if (list.contains(new Student(id))) {
            list.remove(new Student(id));
            saveListStudents(list);
        } else {
            System.out.printf("No student with ID %s.\n Repeat entry ID.", id);
        }
    }

    private void saveListStudents(List<Student> studentList) {
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(DATA))) {
            ous.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
