package com.briup.service;

import java.util.ArrayList;

import com.briup.bean.UserComplaint;

public interface UserComplaintService {
	 /*
	   * 列出投诉事件
	   */
	 public ArrayList<UserComplaint> listAllCompl(String name);
	  /*
	   * 增加投诉
	   */  
	 public void  addUserCompl(UserComplaint ucl);
	  /*
	   * 撤销投诉事件 
	   */
	 public void  deleUserCompl(String name,int id);
	  /*
	   * 更新事件 
	   */
	 public void updateUserCompl(UserComplaint uc);
	  /*
	   * 查询单阁事件
	   */
	  public ArrayList<UserComplaint> listIdCompl(String name,int id);
	 /*
	  * 查询所有事件 
	  */
	 public ArrayList<Integer> listallComp(String name);
	 /*
	  * 根据事件名称查出所有的投诉人或信息 
	  */
	 public ArrayList<UserComplaint> listallCompimpl(String name); 
	 /*
	  * 根据id查询某个事件的详细情况 
	  */
	 public UserComplaint  listcomp(int id);
	 /*
	  *  用来统计一个事件被投诉的次数
	  */
	 public int  countCompl(String name);
	 /*
	  * 由用户名和事件名称查出事件和事件受理情况 
	  */
	 public UserComplaint lisusenamecom(String comname,String name);
	 
	 public void batDeleCompla(ArrayList<Integer> list);
}
