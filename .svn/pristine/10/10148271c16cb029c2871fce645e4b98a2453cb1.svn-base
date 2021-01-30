package com.briup.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConntion {
 public static Connection getconn(){
	   Connection con=null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				try {
			     con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/root","root","root");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		return con; 
 }
}
