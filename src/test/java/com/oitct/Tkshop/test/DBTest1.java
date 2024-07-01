package com.oitct.Tkshop.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DBTest1 {

	// MariaDB Test
	
		private static final String DRIVER = "org.mariadb.jdbc.Driver";
		private static final String URL = "jdbc:mariadb://152.70.91.210:3306/BODADM";
		private static final String USER = "BODUSER"; // DB 사용자명
		private static final String PW = "BODUSER11!"; // DB 사용자 비밀번호
		
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