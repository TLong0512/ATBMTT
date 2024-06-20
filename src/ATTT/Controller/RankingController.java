/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Controller;

import ATTT.Model.RankingModel;
import ATTT.Service.RankingService;
import java.util.List;

/**
 *
 * @author longn
 */
public class RankingController {
    private final RankingService rankingService = new RankingService();
    public List<RankingModel> findAll()
    {
        return rankingService.findAll();
    }
}
