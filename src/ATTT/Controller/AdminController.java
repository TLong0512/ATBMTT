/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Controller;

import ATTT.Model.AdminModel;
import ATTT.Service.AdminService;

/**
 *
 * @author longn
 */
public class AdminController {
    private final AdminService adminService = new AdminService();
    public AdminModel findByInformation(String username, String password)
    {
        return adminService.findByInformation(username, password);
    }
}
