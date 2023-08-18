package controller;

import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String aClass = req.getParameter("class");

        Student student = new Student();
        student.setName(name);
        student.setPhone(phone);
        student.setEmail(email);
        student.setGender(gender);
        student.setClassName(aClass);

        StudentService service = new StudentServiceImpl();
        service.addStudent(student);

        writer.print("Added Successfully");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome");
        requestDispatcher.forward(req, resp);


    }
}
