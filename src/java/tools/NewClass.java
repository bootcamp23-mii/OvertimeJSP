/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.EmployeeController;
import controllers.EmployeeControllerInterface;
import controllers.OvertimeController;
import controllers.OvertimeControllerInterface;
import models.Overtime;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pandu
 */
public class NewClass {
    
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        OvertimeControllerInterface oc = new OvertimeController(sessionFactory);
        EmployeeControllerInterface ec = new EmployeeController(sessionFactory);
//        
//        System.out.println(oc.insert("OVT5", "2019-03-15", "2", "Doing Test", "TSH01", "STA01"));
        /**
         * for (Overtime overtime : oc.getAll()) {
         * System.out.println(overtime.getId());
         * System.out.println(overtime.getDate());
         * System.out.println(overtime.getStatus().getId());
         * System.out.println(overtime.getKeterangan());
         * System.out.println(overtime.getTimesheet().getId()); }
         */
        System.out.println(ec.register("EMP04", "Pandu", "Jawa Timur", "1000000", "mpandugalang@gmail.com", "pandu", "DIV01", "SIT02", "EMP02"));
    }
}
