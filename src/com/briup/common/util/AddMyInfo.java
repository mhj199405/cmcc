package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddMyInfo {
	public static void  addmyinfo(String stuid){
		try {
			Connection conn = GetConntion.getconn();
			PreparedStatement ps = conn.prepareStatement("insert into myinfo values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,null);
			ps.setString(2,null);
			ps.setString(3,stuid);
			ps.setString(4,null);
			ps.setString(5,null);
			ps.setString(6,null);
			ps.setString(7,null);
			ps.setString(8,null);
			ps.setString(9,null);
			ps.setString(10,null);
			ps.setString(11,null);
			ps.setString(12,null);
			ps.execute();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
