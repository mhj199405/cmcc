package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.briup.bean.Myinfo;

public class ListAllId {
	 public  static Myinfo listallid(String stuid){
		 Myinfo info=new Myinfo();
		 Connection conn = GetConntion.getconn();
		 try {
			PreparedStatement ps = conn.prepareStatement("select * from myinfo where stuid=?");
				ps.setString(1, stuid);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
				 info.setStuname(rs.getString("stuname"));
				 info.setStuid(rs.getString("stuid"));
				 info.setStusex(rs.getString("stusex"));
				 info.setStunation(rs.getString("stunation"));
				 info.setStubirth(rs.getString("stubirth"));
				 info.setStatus(rs.getString("status"));
				 info.setFaculty(rs.getString("faculty"));
				 info.setStuclass(rs.getString("stuclass"));
				 info.setPhone(rs.getString("phone"));
				 info.setEmail(rs.getString("email"));
				 info.setQq(rs.getString("qq"));
				 info.setIdcard(rs.getString("idcard"));
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return info;
	 }
}
