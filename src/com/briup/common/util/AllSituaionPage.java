package com.briup.common.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.briup.bean.Situation;


public class AllSituaionPage {
	 public static int getcoun(){
		  int total=0;
			Connection conn = GetConntion.getconn(); 
			try {
				PreparedStatement ps = conn.prepareStatement("select count(*) from situations");
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
	 public static ArrayList<Situation> getPageShowComplaint(int pageIndex,int pageItems){
			ArrayList<Situation> list=new ArrayList<Situation>();
			try {
				Connection conn = GetConntion.getconn();
				PreparedStatement ps = conn.prepareStatement("select * from situations limit ?,?");
				ps.setInt(1, (pageIndex-1)*pageItems);
				ps.setInt(2, pageItems);
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					Situation  stt=new Situation();
				     stt.setUcpname(rs.getString("ucpname"));
				     stt.setReason(rs.getString("reason"));
				     stt.setSitutime(rs.getTimestamp("situtime"));
				     stt.setSitupeople(rs.getString("situpeople"));
				     stt.setSituevidence(rs.getString("situevidence"));
				     stt.setAccsituation(rs.getString("accsituation"));
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
