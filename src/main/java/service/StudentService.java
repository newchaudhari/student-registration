package service;

import model.Student;

public interface StudentService {
    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);

    Student getStudentDetails(int id);
}
