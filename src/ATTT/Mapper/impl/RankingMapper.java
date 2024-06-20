/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Mapper.impl;

import ATTT.Mapper.RowMapper;
import ATTT.Model.RankingModel;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author longn
 */
public class RankingMapper implements RowMapper<RankingModel>{

    @Override
    public RankingModel mapRow(ResultSet set) {
       RankingModel rankingModel = new RankingModel();
       try
       {
        rankingModel.setId(set.getInt("id"));
       rankingModel.setRanking(set.getInt("ranking"));
       rankingModel.setDescription(set.getString("description"));   
       }
       catch(SQLException e)
       {
           return null;
       }
       return rankingModel;
    }
    
    
}
