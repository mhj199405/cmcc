package com.briup.dao;
import java.util.ArrayList;
import java.util.HashMap;
import com.briup.bean.UserComplaint;
 public interface UserComplaintDao {
  /*
   * 列出投诉事件
   */
 public ArrayList<UserComplaint> listAllUserComplaint(String name);
  /*
   * 增加投诉
   */  
 public void  addUserComplaint(UserComplaint ucl);
  /*
   * 撤销投诉事件 
   */
 public void  deleUserComplaint(String name,int id);
  /*
   * 更新事件 
   */
 public void updateUserComplaint(UserComplaint uc);
 /*
  * 查询单个事件
  */
 public ArrayList<UserComplaint> seleIdcomplaint(String name,int id);
 public ArrayList<Integer> listallComp();
 /*
	 *统计有多少学生 
	 */
	public int findcount();
 /*
  * 用来对学生数进行分页 
  */
	public ArrayList<UserComplaint> getPage(HashMap<String, Integer> map);
	/*
	 * 主要是用来在老师端看某件事件有多少用户投诉 
	 */
	public ArrayList<UserComplaint> listallCompimpl(String name); 
	/*
	 * 查看某件事件的投诉的详细内容(id) 
	 */
	public UserComplaint listcompid(int id);
	/*
	 *   统计一件事情被投诉的次数
	 */
	public int countCompl(String name);
	/*
	 * 查询出所有事件(事件不能重复)
	 */
	public int  getCountComp();
	/*
	 * 对于不重复的事件进行分页 
	 */
	public ArrayList<UserComplaint> getPageShowCop(HashMap<String,Integer> map);
	/*
	 * 查询某个用户下，有多少投诉事件 
	 */
	/*public  int count(String comname);*/
	/*
	 *  对于某个用户下有多少用户进行分页操作
	 */
	public ArrayList<UserComplaint> userPageEvent(String name);
	
	/*
	 * 由用户名和事件名称查出事件的详细信 
	 */
	 public UserComplaint lisusenamecom(String comname,String name);
	 
	 public void batDeleCompla(ArrayList<Integer> list);
		
}
