package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.briup.bean.UserComplaint;

public class MyinfoComPage {
  public static int getcount(String comname){
	  int total=0;
	Connection conn = GetConntion.getconn(); 
	try {
		PreparedStatement ps = conn.prepareStatement("select count(*) from usercomplaint where comname=?");
		ps.setString(1, comname);
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
  public static ArrayList<UserComplaint> getPageShowComplaint(String comname,int pageIndex,int pageItems){
	ArrayList<UserComplaint> list=new ArrayList<UserComplaint>();
	try {
		Connection conn = GetConntion.getconn();
		PreparedStatement ps = conn.prepareStatement("select * from usercomplaint  where comname=? order by dob desc limit ?,?");
		ps.setString(1,comname);
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
		   ucl.setComname(comname);
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
}

