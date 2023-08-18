package dao;

import model.Student;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImpl implements StudentDao {


    public void addStudent(Student student) {
        Connection connection = DBUtils.getConnection();
        String query = "Insert Into student_info(name,phone,email,gender,class) values (?,?,?,?,?) ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getPhone());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getGender());
            preparedStatement.setString(5, student.getClassName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void updateStudent(Student student) {
        Connection connection = DBUtils.getConnection();
        String query = "update student_info set name=?, phone=?, email=?, gender=?, class=? where id=? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getPhone());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getGender());
            preparedStatement.setString(5, student.getClassName());
            preparedStatement.setInt(6, student.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void deleteStudent(int id) {
        Connection connection = DBUtils.getConnection();
        String query = "DELETE FROM student_info WHERE id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public Student getStudentDetails(int id) {
        Student student = new Student();
        Connection connection = DBUtils.getConnection();
        String query = "SELECT * FROM student_info WHERE id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                String gender = resultSet.getString("gender");
                String aClass = resultSet.getString("class");
                student.setId(id1);
                student.setName(name);
                student.setPhone(phone);
                student.setEmail(email);
                student.setGender(gender);
                student.setClassName(aClass);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return student;

    }
}
