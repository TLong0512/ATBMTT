/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Dao;

import ATTT.Dao.AbstractDao;
import ATTT.Mapper.impl.TypeMapper;
import ATTT.Model.MalwareModel;
import ATTT.Model.TypeModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author longn
 */
public class TypeDao extends AbstractDao<TypeModel>{

    public TypeDao() {
    }
    
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
    
    public int insert (TypeModel typeModel){
        int ketQua = 0;
        try {
            // Bước 1: tạo kết nối đến CSDL
            Connection con = DbConnection.getDbConnection();

            // Bước 2: tạo ra đối tượng statement
            String sql = "INSERT INTO type (typename, information) "
                            + " VALUES (?,?)";

            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, typeModel.getTypeName());
            st.setString(2, typeModel.getInformation());

            // Bước 3: thực thi câu lệnh SQL
            ketQua = st.executeUpdate();

            // Bước 4:
            System.out.println("Bạn đã thực thi: " + sql);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!");

            // Bước 5:
            DbConnection.closeConnection(con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ketQua;
    }
}
