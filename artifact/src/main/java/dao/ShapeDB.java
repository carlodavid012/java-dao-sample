package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import entity.ShapeType;

public class ShapeDB {
	
	String url = "jdbc:postgresql://localhost:5433/testdb";
	String user = "user12";
	String password = "password123";
	PreparedStatement st;

	public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
	public void insertData(int length, int width, String shapeType, int area) throws SQLException {
		
		String sql = "INSERT INTO shapes(length, width, shapeType, area) VALUES (?,?,?,?)";
		st = connect().prepareStatement(sql);
		st.setInt(1, length);
		st.setInt(2, width);
		st.setString(3, shapeType);
		st.setInt(4, area);
		st.executeUpdate();
		st.close();	
	}
	
	public void delete(int id) throws SQLException {
		
		String sql = "DELETE FROM shapes WHERE id = ?";
		st = connect().prepareStatement(sql);
		st.setInt(1, id);
		st.executeUpdate();
		st.close();	
	}  
}
