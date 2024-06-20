/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Controller;

import ATTT.Model.MalwareModel;
import ATTT.Model.TypeModel;
import ATTT.Service.MalwareService;
import ATTT.Service.TypeService;
import java.util.List;

/**
 *
 * @author longn
 */
public class TypeController {
    private final TypeService typeService = new TypeService();
    private final MalwareService malwareService = new MalwareService();
    public List<TypeModel> findAll()
    {
//        System.out.print(typeService.findAll());
        return typeService.findAll();
    }

}
