/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Dao;

import ATTT.Dao.AbstractDao;
import ATTT.Mapper.impl.TypeMapper;
import ATTT.Model.TypeModel;
import java.util.List;

/**
 *
 * @author longn
 */
public class TypeDao extends AbstractDao<TypeModel>{
    public List<TypeModel> findAll()
    {
        String sql = "Select * from type";
        return query(sql, new TypeMapper());
    }
    public TypeModel findById(Integer id)
    {
        String sql = "SELECT * FROM type WHERE id = ?";
        return query(sql, new TypeMapper(), id).get(0);
    }
    public List<Integer> findListTypeIdbByMalwareId(Integer malwareId)
    {
        String sql = "SELECT type_id from malware_type where malware_id = ?";
        return findListId(sql,malwareId);
    }
}
