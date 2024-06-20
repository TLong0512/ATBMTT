/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Mapper.impl;

import ATTT.Mapper.RowMapper;
import ATTT.Model.AdminModel;
import java.sql.*;

/**
 *
 * @author longn
 */
public class AdminMapper implements RowMapper<AdminModel>{

    @Override
    public AdminModel mapRow(ResultSet set) {
        AdminModel adminModel = new AdminModel();
        try
       {
        adminModel.setId(set.getInt("id"));
        adminModel.setName(set.getString("name"));
        adminModel.setUsername(set.getString("username"));
        adminModel.setPassword(set.getString("password"));
       }
       catch(SQLException e)
       {
           return null;
       }
        return adminModel;
    }   
}
