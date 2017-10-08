package edu.uan.fis.jeesample.dao.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Base class for DAO creation.
 * 
 */
public class BaseJdbcDao {

	/**
	 * Return a new database connection.
	 * 
	 * @return New connection
	 * @throws SQLException 
	 */
	protected Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			// Database connection data for a heroku database
			String dbEnvUrl = System.getenv("DATABASE_URL");
			URI dbUri = new URI((dbEnvUrl!=null)?dbEnvUrl:"postgres://sample:sample@localhost:5432/productsdb");
			String username = dbUri.getUserInfo().split(":")[0];
			String password = dbUri.getUserInfo().split(":")[1];
			String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath();

			conn = DriverManager.getConnection(dbUrl, username, password);
		} catch (URISyntaxException e) {
			Logger.getLogger(BaseJdbcDao.class.getName()).log(Level.SEVERE, null, e);
		}
		return conn;
	}

	protected void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			Logger.getLogger(BaseJdbcDao.class.getName()).log(Level.WARNING, "Error closing the connection", e);
		}
	}

	protected void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			Logger.getLogger(BaseJdbcDao.class.getName()).log(Level.WARNING, "Error closing the statement", e);
		}
	}

	protected void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			Logger.getLogger(BaseJdbcDao.class.getName()).log(Level.WARNING, "Error closing the result set", e);
		}
	}

}
