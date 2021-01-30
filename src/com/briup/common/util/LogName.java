package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LogName {
	public static String logname(String stuid){
		String logname=null;
		Connection conn = GetConntion.getconn();
		try {
			PreparedStatement ps = conn.prepareStatement("select stuname from myinfo where stuid=?");
			ps.setString(1,stuid);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
			logname=rs.getString("stuname");
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		return logname;
	}
}
