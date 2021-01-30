package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.briup.bean.UserComplaint;

public class ComNameAlls {
	 public static int getcoun(String name){
		  int total=0;
			Connection conn = GetConntion.getconn(); 
			try {
				PreparedStatement ps = conn.prepareStatement("select count(*) from usercomplaint where name=?");
				ps.setString(1, name);
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
	  public static ArrayList<UserComplaint> getPageShowComplaint(String name,int pageIndex,int pageItems){
			ArrayList<UserComplaint> list=new ArrayList<UserComplaint>();
			try {
				Connection conn = GetConntion.getconn();
				PreparedStatement ps = conn.prepareStatement("select * from usercomplaint where name=? limit ?,?");
				ps.setString(1, name);
				ps.setInt(2, (pageIndex-1)*pageItems);
				ps.setInt(3, pageItems);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
				   UserComplaint  ucl=new UserComplaint();
				   ucl.setId(rs.getInt("id"));
				   ucl.setName(rs.getString("name"));
				   ucl.setComplaint(rs.getString("complaint"));
				   ucl.setPublish(rs.getString("publish"));
				   ucl.setDob(rs.getTimestamp("dob"));
				   ucl.setContent(rs.getString("content"));
				   ucl.setComname(rs.getString("comname"));
				   list.add(ucl);
				}
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
	}
	  public UserComplaint listidcoms(int id){
		  UserComplaint  ucl=new UserComplaint();
		  Connection conn = GetConntion.getconn();
		  try {
			PreparedStatement ps = conn.prepareStatement("select * from usercomplaint where id=?");
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
				   ucl.setId(rs.getInt("id"));
				   ucl.setName(rs.getString("name"));
				   ucl.setComplaint(rs.getString("complaint"));
				   ucl.setPublish(rs.getString("publish"));
				   ucl.setDob(rs.getTimestamp("dob"));
				   ucl.setContent(rs.getString("content"));
				   ucl.setComname(rs.getString("comname"));
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return ucl;
		  
	  }
}
