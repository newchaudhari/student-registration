package service;

import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao = new StudentDaoImpl();

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }

    public Student getStudentDetails(int id) {
        return studentDao.getStudentDetails(id);
    }
}
