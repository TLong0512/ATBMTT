/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Service;

import ATTT.Dao.TypeDao;
import ATTT.Model.TypeModel;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author longn
 */
public class TypeService {
    private final TypeDao typeDao = new TypeDao();
    public List<TypeModel> findAll()
    {
        return typeDao.findAll();
    }
    public TypeModel findById(Integer id)
    {
        return typeDao.findById(id);
    }
    public List<TypeModel> findListTypeByMalwareId(Integer malwareId)
    {
        List<Integer> typeIds = typeDao.findListTypeIdbByMalwareId(malwareId);
       
        List<TypeModel> typeModels = new ArrayList<>();
        for(Integer id : typeIds)
        {
            
            typeModels.add(typeDao.findById(id));
        }
 
        return typeModels;
    }
}
