package dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ShapeDAO {

	Connection connect() throws SQLException;

	void insertData(int length, int width, String shapeType, int area) throws SQLException;

	void delete(int id) throws SQLException;

}