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
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
import models.Employee;
import models.Overtime;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pandu
 */
public class NewClass {

    public static void main(String[] args) {
//        String x = "akuakuakaukau@aju@ghvsc@56789";
//        String y = x.split("@")[3];
//        System.out.println(y);
//
//        String x = "pandu";
//        String y = "$2a$10$Ed2/hFSTzxX7KETl/dAkHuZae1.j5ob1o1Tzo2HjQQ2exsA0wjDcG";
//        String saltew = y.split(".")[0];
//        System.out.println(saltew);
//        BCrypt.hashpw(y, salt);
//        System.out.println(BCrypt.hashpw(y, salt));
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        //        OvertimeControllerInterface oc = new OvertimeController(sessionFactory);
//        EmployeeControllerInterface ec = new EmployeeController(sessionFactory);
        //        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //

//        String xyz = "malinapa";
//        for (Employee employee : ec.getAll()) {
//            while (employee.getEmail().split("@")[0].equals(xyz)) {
//                System.out.println(employee.getId());
//                break;
//            }
//        }

//            while (!xyz.equals(employee.getEmail().split("@")[0])) {
//                System.out.println(employee.getId());
        //        String x = "2019/02/13";
        //        Date dt = new Date();
                String password = "galang";
//                String password2 = "galangs";
                String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
                System.out.println(passwordHash);
                String passwordHash2 = BCrypt.hashpw(password, BCrypt.gensalt());
                System.out.println(passwordHash2);
                boolean bobo=passwordHash.equals(passwordHash2);
                System.out.println(bobo);
        //        System.out.println(BCrypt.checkpw(password2, passwordHash));
        //        System.out.println(BCrypt.checkpw(password, passwordHash2));
        //        byte[] array = new byte[7]; // length is bounded by 7
        //        new Random().nextBytes(array);
        //        String generatedString = new String(array, Charset.forName("UTF-8"));
        //        System.out.println(generatedString);
        //      
        //        System.out.println(oc.getById("EMP5"));
        //        System.out.println(oc.totOver("EMP01"));
        //        System.out.println(oc.update("OVT19", dt, "2", "NGANTUK NGGA SIH", "TSH7", "STA02"));
    }
}
