package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.briup.bean.Notice;

public class Notclassification {
	 public static int getcoun(String type){
		  int total=0;
			Connection conn = GetConntion.getconn(); 
			try {
				PreparedStatement ps = conn.prepareStatement("select count(*) from notice where type=?");
				ps.setString(1,type);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					total = rs.getInt(1);
				}
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return total;
	  }
	 public static ArrayList<Notice> getPageShowComplaint(String type,int pageIndex,int pageItems){
			ArrayList<Notice> list=new ArrayList<Notice>();
			try {
				Connection conn = GetConntion.getconn();
				PreparedStatement ps = conn.prepareStatement("select * from notice where type=? limit ?,?");
				ps.setString(1,type);
				ps.setInt(2, (pageIndex-1)*pageItems);
				ps.setInt(3, pageItems);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					Notice  stt=new Notice();
				     stt.setId(rs.getLong("id"));
				     stt.setName(rs.getString("name"));
				     stt.setTime(rs.getTimestamp("time"));
				     stt.setContent(rs.getString("content"));
				     stt.setPeople(rs.getString("people"));
				     stt.setType(rs.getString("type"));
				     list.add(stt);
				}
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
	}
}
