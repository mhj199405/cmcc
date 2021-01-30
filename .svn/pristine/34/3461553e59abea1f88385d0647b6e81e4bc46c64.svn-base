package com.briup.service;

import java.util.ArrayList;

import com.briup.bean.User;
import com.briup.common.exception.UserException;

public interface UserService {
	/**
	 * 注册
	 */
	public void registerUser(User user);
	/**
	 * 登陆
	 * @throws UserException 
	 * */
	public  User loginUser(String name, String password) throws UserException;
	/**
	 * 删除的学生 
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
     *  查处表中所有的用户，为的是在注册用户保证用户名唯一
     * @throws UserException 
     */
     public ArrayList<User> listallUser();
}
