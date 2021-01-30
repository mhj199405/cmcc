package com.briup.service;


import java.util.ArrayList;

import com.briup.bean.User;
import com.briup.common.exception.UserException;

public interface UserAdmissibilityService {
  //老师注册
	public void registerUser(User user);
  //老师登录
  public  User loginUser(String name, String password) throws UserException;
  /**
	 * 删除的老师 
	 */
  public void deleUser(String name);
  /**
   *  查询出一个用户信息 
   */
  public User  seleUser(String name); 
  /**
   * 更新用户信息 
   */
  public void updateUser(User user);
  /**
   * 列出所有老师的账户名，为的是老师进行账户注册时保证账户的唯一性
 * @throws UserException 
   */
  public ArrayList<String> listallUser();
}
