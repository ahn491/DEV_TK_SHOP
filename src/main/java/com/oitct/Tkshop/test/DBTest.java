package com.oitct.Tkshop.test;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DBTest { // DB Test용 Class
	
	// MariaDB Test
	
	private static final String DRIVER = "net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
	private static final String URL = "jdbc:log4jdbc:mariadb://localhost:3307/bodadm";
	private static final String USER = "root"; // DB 사용자명
	private static final String PW = "observe7@"; // DB 사용자 비밀번호
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("성공");
			System.out.println(con);
		
		} catch(Exception e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}
	}
}
