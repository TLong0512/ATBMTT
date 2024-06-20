/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Service;

import ATTT.Dao.RankingDao;
import ATTT.Model.RankingModel;
import java.util.List;

/**
 *
 * @author longn
 */
public class RankingService {
    private final RankingDao rankingDao = new RankingDao();
    public List<RankingModel> findAll()
    {
        return rankingDao.findAll();
    }
}
