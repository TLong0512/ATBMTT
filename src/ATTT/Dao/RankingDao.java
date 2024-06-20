/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Dao;

import ATTT.Dao.AbstractDao;
import ATTT.Mapper.impl.RankingMapper;
import ATTT.Model.RankingModel;
import java.util.List;

/**
 *
 * @author longn
 */
public class RankingDao extends AbstractDao<RankingModel>{
    public RankingModel findRankById(Integer id)
    {
        String sql = "Select * from ranking where id = ?";
        return query(sql, new RankingMapper(), id).get(0);
    };
    public List<RankingModel> findAll()
    {
        String sql = "select * from ranking";
        return query(sql, new RankingMapper());
    }
}
