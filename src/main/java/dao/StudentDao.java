package dao;

import model.Student;

public interface StudentDao {
    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);

    Student getStudentDetails(int id);
}
