package controller;

import model.Student;
import service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get")
public class GetStudentDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String id = req.getParameter("id");
        int i = Integer.parseInt(id);
        StudentServiceImpl studentService = new StudentServiceImpl();
        Student studentDetails = studentService.getStudentDetails(i);

        writer.println("<h1>Student Details</h1>");
        writer.print("<table border=\"1\"; style=\"text-align: center;\">");
        writer.println("<tr>" +
                "                <th>Name</th>" +
                "                <th>Phone</th>" +
                "                <th>Email</th>" +
                "                <th>Gender</th>" +
                "                <th>Class Name</th>" +
                "            </tr>");

        writer.println("<tr>" + "<td>" + studentDetails.getName() + "</td>"
                + "<td>" + studentDetails.getPhone() + "</td>"
                + "<td>" + studentDetails.getEmail() + "</td>"
                + "<td>" + studentDetails.getGender() + "</td>"
                + "<td>" + studentDetails.getClassName() + "</td>" + "</tr>");
        writer.println("</table>");

        writer.println("<br>");
        writer.println("<a href=\"index.jsp\">Registration Form</a>");


    }


}
