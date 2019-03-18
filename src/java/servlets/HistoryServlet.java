/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import controllers.OvertimeController;
import controllers.OvertimeControllerInterface;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Overtime;
import tools.HibernateUtil;

/**
 *
 * @author Pandu
 */
@WebServlet(name = "HistoryServlet", urlPatterns = {"/HistoryServlet"})
public class HistoryServlet extends HttpServlet {

    OvertimeControllerInterface oc = new OvertimeController(HibernateUtil.getSessionFactory());
    List<Overtime> data = null;
    List<Overtime> all = null;
    List<Overtime> history = null;
//    List<Overtime> dato = null;

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

            String x = String.valueOf(request.getSession().getAttribute("login"));
            
            data    = oc.empOvertime(x);
            all     = oc.getByMang(x);
            history = oc.empOvertime(x);

            request.getSession().setAttribute("history", history);
            request.getSession().setAttribute("data", data);
            request.getSession().setAttribute("all", all);

            response.sendRedirect("index.jsp");
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
        String action = request.getParameter("action");
        if (action != null) {
            if (action.equalsIgnoreCase("delete")) {
                oc.delete(request.getParameter("otId"));
            } else if (action.equalsIgnoreCase("update")) {
                Overtime ot = oc.getById(request.getParameter("id"));
                request.getSession().setAttribute("otId", ot.getId());
                request.getSession().setAttribute("otdate", ot.getDate());
                request.getSession().setAttribute("otduration", ot.getTimeduration());
                request.getSession().setAttribute("otdesc", ot.getKeterangan());
                request.getSession().setAttribute("otstatus", ot.getStatus().getStatus());
                request.getSession().setAttribute("timesheet", ot.getTimesheet().getId());
            }
        }
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
        if (oc.update(request.getParameter("otId"), request.getParameter("otdate"),
                request.getParameter("otduration"), request.getParameter("otdesc"),
                request.getParameter("timesheet"), request.getParameter("otstatus")) != null) {
            processRequest(request, response);
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
