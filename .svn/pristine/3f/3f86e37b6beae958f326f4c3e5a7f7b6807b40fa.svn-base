package com.briup.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.briup.bean.User;

public interface UserAdmissibilityDao {
/*
 * 教师登录
 */
public User  findUser(String name); 
/*
 * 用户注册
 */
public void saveUser(User user);
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
  * 查询出所有的老师账户，就是为了注册时保证账户的唯一性 
  */
public ArrayList<String> listallUser();
}
