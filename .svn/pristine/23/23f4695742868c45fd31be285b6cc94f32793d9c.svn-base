package com.briup.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.User;
import com.briup.common.exception.UserException;
import com.briup.common.util.MD5;
import com.briup.common.util.MyBatisSqlSessionFactory;
import com.briup.dao.UserDao;
import com.briup.service.UserService;

public class UserServiceImpl implements UserService{
    /**
     *用户的注册 
	 */
	 public void registerUser(User user){
		    user.setPassword(MD5.getMD5Str(user.getPassword()));
		    SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		    UserDao dao = session.getMapper(UserDao.class);
			dao.saveUser(user);	
		}
	/**
	*   用户的登录
	 * @throws UserException 
	*/
	@Override
	public User loginUser(String name, String password) throws UserException {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserDao dao = session.getMapper(UserDao.class);
		User user = dao.loginUser(name);
		if(user!=null){
			//user.getPassword()表示查出来的密码---->password表示输入的密码
			if(user.getPassword().equals(MD5.getMD5Str(password))){
			   return user;
			}else{
				throw new UserException("密码错误");
			}
		}else{
		  throw new UserException("用户不存在");
		}
	}
	/*
	 *删除用户 
	 * 
	 */
	@Override
	public void deleUser(String name) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserDao dao = session.getMapper(UserDao.class);
		dao.deleUser(name);	
	}
	@Override
	public User seleUser(String name) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserDao dao = session.getMapper(UserDao.class);
		return  dao.seleUser(name);
	}
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserDao dao = session.getMapper(UserDao.class);
		user.setPassword(MD5.getMD5Str(user.getPassword()));
		dao.updateUser(user);
	}
	/*
	 *统计总共有多少用户 
	 */
	public  static int getCount() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserDao dao= session.getMapper(UserDao.class);
		 int total = dao.findcount();
		return total;
	}
	/*	 
	 *对数据进行分页操作 
	 */
	public static  ArrayList <User> getPageShowItems(int pageIndex,int pageItems) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("pageIndex", (pageIndex-1)*pageItems);
		map.put("pageItems", pageItems);
		UserDao dao = session.getMapper(UserDao.class);
		return  dao.getPage(map);
	}
	@Override
	public ArrayList<User> listallUser(){
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserDao dao = session.getMapper(UserDao.class);
		return dao.listallUser();
	}
}
