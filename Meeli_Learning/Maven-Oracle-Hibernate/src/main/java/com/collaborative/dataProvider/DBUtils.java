package com.collaborative.dataProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

	// Add the Oracle JDBC Jars in your build path
	public static final String ORA_DB_DRIVER =  "oracle.jdbc.OracleDriver";

	// Connection URL - jdbc:oracle:thin:@//<HOST_NAME>:<PORT_NUMBER>/<SID>
	protected static final String DB_CONNECTION_URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	
	// Specify the User Name and Password of the selected Connection
	protected static final String DB_USERNAME = "dbuser";
	protected static final String DB_PASSWORD = "dbuser";

	// Query for Account
	public static final String INSERT_RECORD = "INSERT INTO LOGIN (USERID, USERNAME, PASSWORD, ROLE) VALUES (2, 'q', 'q', 'User')";

	public static void closeConnection(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeStatement(Statement stmt) {
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBUtils.ORA_DB_DRIVER).newInstance();
			conn = DriverManager.getConnection(DBUtils.DB_CONNECTION_URL, DBUtils.DB_USERNAME, DBUtils.DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
