package com.collaborative.dataProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.hibernate.Session;

import com.collaborative.domain.User;

public class DataProvider {

	public static boolean insertUser() {
		Connection conn = null;
		PreparedStatement stmt = null;
		boolean isRowsAdded = false;
		try {
			conn = DBUtils.getConnection();
			String sql = DBUtils.INSERT_RECORD;
			stmt = conn.prepareStatement(sql);
			int rowsAdded = stmt.executeUpdate();
			if(rowsAdded > 0)
				isRowsAdded = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection(conn);
			DBUtils.closeStatement(stmt);
		}
		return isRowsAdded;
	}
	
	public static void insertUserUsingHibernate() {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		User user = new User();

		user.setUserName("Meeli");
		user.setPassword("Password1");
		user.setRole("User");

		session.save(user);
		session.getTransaction().commit();
	}
}
