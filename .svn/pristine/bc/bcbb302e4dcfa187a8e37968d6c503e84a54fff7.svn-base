package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.briup.bean.UserComplaint;

public class AllComPage {
  public static int getcoun(){
	  int total=0;
		Connection conn = GetConntion.getconn(); 
		try {
			PreparedStatement ps = conn.prepareStatement("select count(*) from usercomplaint");
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
  public static ArrayList<UserComplaint> getPageShowComplaint(int pageIndex,int pageItems){
		ArrayList<UserComplaint> list=new ArrayList<UserComplaint>();
		try {
			Connection conn = GetConntion.getconn();
			PreparedStatement ps = conn.prepareStatement("select * from usercomplaint limit ?,?");
			ps.setInt(1, (pageIndex-1)*pageItems);
			ps.setInt(2, pageItems);
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
  public static int getcoun1(){
	  int total=0;
	  Connection conn = GetConntion.getconn(); 
	  try {
		  PreparedStatement ps = conn.prepareStatement("select count(distinct name) from usercomplaint");
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
  public static ArrayList<UserComplaint> getPageShowComplaint1(int pageIndex,int pageItems){
	  ArrayList<UserComplaint > list=new ArrayList<UserComplaint>();
	  try {
		  Connection conn = GetConntion.getconn();
		  PreparedStatement ps = conn.prepareStatement("select distinct name from usercomplaint limit ?,?");
		  ps.setInt(1, (pageIndex-1)*pageItems);
		  ps.setInt(2, pageItems);
		  ResultSet rs = ps.executeQuery();
		  while(rs.next()){
			UserComplaint s=new UserComplaint();
			 s.setName(rs.getString("name"));
			 list.add(s);
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