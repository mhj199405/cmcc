package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.briup.bean.UserComplaint;

public class LikeAllCom {
	 public static int getLikeCount(String name){
		  int total=0;
			Connection conn = GetConntion.getconn(); 
			try {
				PreparedStatement ps = conn.prepareStatement("select count(distinct name) from usercomplaint where name like ?");
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
	  public static ArrayList<UserComplaint> likecom(String name,int pageIndex,int pageItems ){
		  ArrayList<UserComplaint> list=new ArrayList<UserComplaint>();
		  try {
			Connection conn = GetConntion.getconn();
			  PreparedStatement ps = conn.prepareStatement("select distinct name from usercomplaint where name like ? limit ?,?");
		      ps.setString(1,name);
		  	ps.setInt(2, (pageIndex-1)*pageItems);
			ps.setInt(3, pageItems);
		      ResultSet rs = ps.executeQuery();
		      while(rs.next()){
		    	  UserComplaint  ucl=new UserComplaint();
				   ucl.setName(rs.getString("name"));
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
