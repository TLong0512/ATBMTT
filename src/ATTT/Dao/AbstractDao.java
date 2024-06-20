/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATTT.Dao;

import ATTT.Mapper.RowMapper;
import java.sql.Timestamp;
import java.sql.Types;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author longn
 */
public class AbstractDao<T> {


    
    private void setParameters(PreparedStatement statement, Object... parameters) {
        try {
            for (int i = 0; i < parameters.length; ++i) {
                Object parameter = parameters[i];
                if (parameter instanceof Long) {
                    statement.setLong(i + 1, (long) parameter);
                } else if (parameter instanceof Integer) {
                    statement.setInt(i + 1, (Integer) parameter);
                } else if (parameter instanceof String) {
                    statement.setString(i + 1, (String) parameter);
                } else if (parameter instanceof Timestamp) {
                    statement.setTimestamp(i + 1, (Timestamp) parameter);
                } else if (parameter == null) {
                    statement.setNull(i + 1, Types.NULL);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
        List<T> result = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet set = null;
        try {
            connection = DbConnection.getDbConnection();
            statement = connection.prepareStatement(sql);
            //
            setParameters(statement, parameters);
            set = statement.executeQuery();
            while (set.next()) {
                result.add(rowMapper.mapRow(set));
            }
        } catch (SQLException e) {
            return null;}

        return result;
    }
    public List<Integer> findListId(String sql, Object... parameters)
    {
        List<Integer> result =new ArrayList<>(); 
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet set = null;
        try {
            connection = DbConnection.getDbConnection();
            statement = connection.prepareStatement(sql);
            setParameters(statement, parameters);
            set = statement.executeQuery();
            while (set.next()) {
                result.add(set.getInt(1));
            }
        } catch (SQLException e) {
            return null;}
        return result;
    }
    public void update(String sql, Object... parameters) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DbConnection.getDbConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql);
            setParameters(statement, parameters);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e2) {
                    e2.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e1) {

                e1.printStackTrace();
            }
        }

    }

    public Long insert(String sql, Object... parameters) {
        ResultSet resultSet = null;
        Long id = null;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DbConnection.getDbConnection();
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            setParameters(statement, parameters);
            statement.executeUpdate();
            resultSet = statement.getGeneratedKeys();
            connection.commit();
            if (resultSet.next()) {
                id = resultSet.getLong(1);
                return id;
            }
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
            return null;
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                return null;
            }
        }
        return null;
    }

}
