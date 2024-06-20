/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ATTT.Mapper;
import java.sql.*;
/**
 *
 * @author longn
 */
public interface RowMapper<T> {
    T mapRow(ResultSet set);
}
