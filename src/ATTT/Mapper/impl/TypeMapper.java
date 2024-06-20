/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Mapper.impl;


import ATTT.Mapper.RowMapper;

import ATTT.Model.TypeModel;
import ATTT.Service.MalwareService;

import java.sql.*;



/**
 *
 * @author longn
 */
public class TypeMapper implements RowMapper<TypeModel> {

    @Override
    public TypeModel mapRow(ResultSet set) {
        TypeModel item = new TypeModel();
        MalwareService mal = new MalwareService();
        try {
            item.setId(set.getInt("id"));
            item.setTypeName(set.getString("typename"));
            item.setInformation(set.getString("information"));
        } catch (SQLException e) {
            return null;
        }
        return item;
    }

}
