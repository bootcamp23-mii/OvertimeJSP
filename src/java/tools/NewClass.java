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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String x = "2019/02/13";
        Date dt = new Date();
//        System.out.println(oc.getById("EMP5"));
        System.out.println(oc.totOver("EMP01"));
//        System.out.println(oc.update("OVT19", dt, "2", "NGANTUK NGGA SIH", "TSH7", "STA02"));
    }
}
