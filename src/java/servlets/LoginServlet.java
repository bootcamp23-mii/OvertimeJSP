/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controllers.EmployeeController;
import controllers.EmployeeControllerInterface;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Employee;
import models.LoginSession;
import sun.security.pkcs11.wrapper.Functions;
import tools.HibernateUtil;

/**
 *
 * @author milhamafemi
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

//    EmployeeControllerInterface eci = new EmployeeController(tools.HibernateUtil.getSessionFactory());
    EmployeeControllerInterface ec = new EmployeeController(HibernateUtil.getSessionFactory());
//    List<Employee> data = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            response.sendRedirect("login.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (ec.login(request.getParameter("usernameLogin"), request.getParameter("passwordLogin"))) {
            LoginSession.setIdUsername(request.getParameter("usernameLogin"));
            String data = request.getParameter("usernameLogin");

//            for (Employee employee : (List<Employee>) ec.getById(data)) {
            Employee employee = ec.getById(data);
            request.getSession().setAttribute("empid", employee.getId());
            request.getSession().setAttribute("empname", employee.getName());
            request.getSession().setAttribute("empaddress", employee.getAddress());
            request.getSession().setAttribute("empsalary", employee.getSalary());
            request.getSession().setAttribute("empemail", employee.getEmail());
            request.getSession().setAttribute("empdivision", employee.getDivision().getName());
            request.getSession().setAttribute("empsite", employee.getSite().getName());
            request.getSession().setAttribute("empmanager", employee.getManager().getName());

//            }
            request.getSession().setAttribute("login", data);

            response.sendRedirect("index.jsp");
        } else {
            processRequest(request, response);
//            response.sendRedirect("index.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
