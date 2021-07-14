package by.voluevich.faculty.exceptions;

public class DuplicatedStudentsException extends Exception{
    private final int idStudents;

    public DuplicatedStudentsException(int idStudents) {
        this.idStudents = idStudents;
    }
    @Override
    public String getMessage() {
        return "A student with ID ( " + idStudents + " ) already exists in the Faculty.";
    }
}
