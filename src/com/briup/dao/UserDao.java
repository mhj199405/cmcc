package com.briup.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.briup.bean.User;

public interface UserDao {
	/*
	 * 用户注册
	 */
	public void saveUser(User user);
	/*
	 * 用户登录
	 */
	public User loginUser(String name);
	/*
	 *删除用户 
	 */
    public  void  deleUser(String name);
    /*
     * 查询单个用户信息  
     */
    public User seleUser(String name);
    /*
     * 修改用户信息 
     */
    public void updateUser(User user);
	/*
	 *统计有多少学生 
	 */
	public int findcount();
    /*
     * 用来对学生数进行分页 
     */
	public ArrayList<User> getPage(HashMap<String, Integer> map);
	/*
	 * 查询所有的学生账户 
	 */
	public ArrayList<User> listallUser();
}
