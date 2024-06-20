/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Service;

import ATTT.Dao.AdminDao;
import ATTT.Model.AdminModel;

/**
 *
 * @author longn
 */
public class AdminService {
    private final AdminDao adminDao = new AdminDao();
    public AdminModel findByInformation(String username, String password)
    {
        return adminDao.findByInformation(username, password);
    }
    
}
