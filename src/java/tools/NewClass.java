/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

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
//        System.out.println(oc.getAll());
//        
        for (Overtime overtime : oc.getAll()) {
            System.out.println(overtime.getId());
            System.out.println(overtime.getDate());
            System.out.println(overtime.getStatus().getId());
            System.out.println(overtime.getKeterangan());
            System.out.println(overtime.getTimesheet().getId());
        }
    }
}
