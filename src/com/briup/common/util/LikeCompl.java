package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.briup.bean.UserComplaint;

public class LikeCompl {
  public static int getLikeCount(String name,String comname){
	  int total=0;
		Connection conn = GetConntion.getconn(); 
		try {
			PreparedStatement ps = conn.prepareStatement("select count(*) from usercomplaint where name like ? and comname=?");
			ps.setString(1, name);
			ps.setString(2, comname);
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
  public ArrayList<UserComplaint> likecom(String name,String comname,int pageIndex,int pageItems ){
	  ArrayList<UserComplaint> list=new ArrayList<UserComplaint>();
	  try {
		Connection conn = GetConntion.getconn();
		  PreparedStatement ps = conn.prepareStatement("select * from usercomplaint where name like ? and comname=? limit ?,?");
	      ps.setString(1,name);
	      ps.setString(2, comname);
	  	ps.setInt(3, (pageIndex-1)*pageItems);
		ps.setInt(4, pageItems);
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
