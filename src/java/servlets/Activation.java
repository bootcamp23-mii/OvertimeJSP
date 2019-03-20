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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Employee;
import tools.HibernateUtil;

/**
 *
 * @author Pandu
 */
@WebServlet(name = "Activation", urlPatterns = {"/Activation"})
public class Activation extends HttpServlet {

    EmployeeControllerInterface ec = new EmployeeController(HibernateUtil.getSessionFactory());

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
        for (Employee employee : ec.getAll()) {
            while (employee.getEmail().split("@")[0].equals(request.getParameter("nama"))) {
                String id = employee.getId();

                Employee taro = ec.getById(id);
                String aid = taro.getId();
                String anama = taro.getName();
                String aaddress = taro.getAddress();
                String asalary = taro.getSalary().toString();
                String aemail = taro.getEmail();
                String apassword = taro.getPassword();
                String adivision = taro.getDivision().getId();
                String asite = taro.getSite().getId();
                String aidmanager = taro.getJob().getId();
                String ajob = taro.getJob().getId();
                int aactive = taro.getActive();

                if (ec.insertOrUpdate(aid, anama, aaddress, asalary, aemail, apassword, adivision, asite, aidmanager, ajob, aactive).equals("GOTNEW")) {
                    
                    break;
                }
            }

        }
        processRequest(request, response);

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
