package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class ShapeDB implements ShapeDAO {
	
	
	/*
	String url = "jdbc:postgresql://localhost:5433/testdb";
	String user = "user12";
	String password = "password123";
	*/
	
	private String url;
	
	private String user;
	
	private String password;
	
	
	
	PreparedStatement st;

	/* (non-Javadoc)
	 * @see dao.ShapeDAO#connect()
	 */
	@Override
	public Connection connect() throws SQLException {
        return DriverManager.getConnection(getUrl(), getUser(), getPassword());
    }
    
	/* (non-Javadoc)
	 * @see dao.ShapeDAO#insertData(int, int, java.lang.String, int)
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see dao.ShapeDAO#delete(int)
	 */
	@Override
	public void delete(int id) throws SQLException {
		
		String sql = "DELETE FROM shapes WHERE id = ?";
		st = connect().prepareStatement(sql);
		st.setInt(1, id);
		st.executeUpdate();
		st.close();	
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}  
}
