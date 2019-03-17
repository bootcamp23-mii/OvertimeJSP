/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.Role;
import org.hibernate.SessionFactory;

/**
 *
 * @author milhamafemi
 */
public class RoleController implements RoleControllerInterface{
    private DAOInterface<Role> dao;
    
    public RoleController(SessionFactory factory) {
        dao=new GeneralDAO<>(factory, Role.class);
    }
    
    @Override
    public List<Role> getRoleJob(String jobs){
        return dao.empJob(jobs);
    }
    
}
