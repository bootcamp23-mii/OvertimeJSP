/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Overtime;
import models.Status;
import models.TimeSheet;
import org.hibernate.SessionFactory;

/**
 *
 * @author AdhityaWP
 */
public class OvertimeController implements OvertimeControllerInterface {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private final DAOInterface<Overtime> dao;

    public OvertimeController(SessionFactory sessionFactory) {
        dao = new GeneralDAO<>(sessionFactory, Overtime.class);
    }

    @Override
    public String insert(String id, String date, String timeDuration, String keterangan, String timeSheet, String status) {
        try {
            if (dao.saveOrDelete(new Overtime(id, sdf.parse(date), Integer.valueOf(timeDuration), keterangan, new TimeSheet(timeSheet), new Status(status)), true)) {
                return " Selamat data berhasil disimpan";
            }
        } catch (ParseException ex) {
            Logger.getLogger(OvertimeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Maaf coba lagi";
    }

    @Override
    public String update(String id, String date, String timeDuration, String keterangan, String timeSheet, String status) {
        try {
            if (dao.saveOrDelete(new Overtime(id, sdf.parse(date), Integer.valueOf(timeDuration), keterangan, new TimeSheet(timeSheet), new Status(status)), true)) {
                return " Selamat data berhasil diubah";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Maaf coba lagi";
    }

    @Override
    public String delete(String id) {
        if (dao.saveOrDelete(new Overtime(id), false)) {
            return " Data telah dihapus!";
        } else {
            return "Maaf coba lagi";
        }
    }

    @Override
    public Overtime getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Overtime> getData(String key) {
        return dao.getData(key);
    }

    public Overtime first() {
        return dao.last("");
    }

    @Override
    public List<Overtime> getAll() {
        return dao.getData("");
    }
    
    @Override
    public List<Overtime> getByMang(String key) {
        return dao.getByMang(key);
    }

    public Overtime last() {
        return dao.last("");
    }

    @Override
    public List<Overtime> empOvertime(String id) {
        return dao.empOvertime(id);
    }

}
