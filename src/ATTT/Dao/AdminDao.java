/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Dao;

import ATTT.Mapper.impl.AdminMapper;
import ATTT.Model.AdminModel;
import java.util.List;

/**
 *
 * @author longn
 */
public class AdminDao extends AbstractDao<AdminModel>{
    public AdminModel findByInformation(String username, String password)
    {
        String sql = "SELECT * FROM ad where username = ?";
        
        List<AdminModel> adminModels = query(sql,new AdminMapper(), username);
        if(!adminModels.isEmpty())
        {
            AdminModel adminModel = adminModels.get(0);
            if(adminModel.getPassword().equals(password))
            {
                return adminModel;
            }
            else
            {
                return null;
            }
                    
        }
        return null;
    }
}
