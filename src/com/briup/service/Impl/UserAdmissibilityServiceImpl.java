package com.briup.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.User;
import com.briup.common.exception.UserException;
import com.briup.common.util.MD5;
import com.briup.common.util.MyBatisSqlSessionFactory;
import com.briup.dao.UserAdmissibilityDao;
import com.briup.service.UserAdmissibilityService;

public class UserAdmissibilityServiceImpl implements UserAdmissibilityService{

	@Override
	public User loginUser(String name, String password) throws UserException {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserAdmissibilityDao dao = session.getMapper(UserAdmissibilityDao.class);
		User user = dao.findUser(name);
		if(user!=null){
			if(user.getPassword().equals(MD5.getMD5Str(password))){
				 return user;
			}else{
				throw new UserException("密码错误");
			}
		}else{
		  throw new UserException("用户不存在");
		}
	}
	/**
     *用户的注册 
	 */
	 public void registerUser(User user){
		    user.setPassword(MD5.getMD5Str(user.getPassword()));
		    SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		    UserAdmissibilityDao dao = session.getMapper(UserAdmissibilityDao.class);
			dao.saveUser(user);	
		}
		/*
		 *删除用户 
		 * 
		 */
		@Override
		public void deleUser(String name) {
			// TODO Auto-generated method stub
			SqlSession session = MyBatisSqlSessionFactory.openSession(true);
			UserAdmissibilityDao dao = session.getMapper(UserAdmissibilityDao.class);
			dao.deleUser(name);	
		}
		@Override
		public User seleUser(String name) {
			// TODO Auto-generated method stub
			SqlSession session = MyBatisSqlSessionFactory.openSession(true);
			UserAdmissibilityDao dao = session.getMapper(UserAdmissibilityDao.class);
			User user = dao.seleUser(name);
			String password=MD5.getMD5Str((user.getPassword()));
			user.setPassword(password);
			return user;
		}
		@Override
		public void updateUser(User user) {
			// TODO Auto-generated method stub
			SqlSession session = MyBatisSqlSessionFactory.openSession(true);
			UserAdmissibilityDao dao = session.getMapper(UserAdmissibilityDao.class);
			user.setPassword(MD5.getMD5Str(user.getPassword()));
			dao.updateUser(user);
		}
		/*
		 *统计总共有多少用户 
		 */
		public  static int getCount() {
			// TODO Auto-generated method stub
			SqlSession session = MyBatisSqlSessionFactory.openSession(true);
			UserAdmissibilityDao dao= session.getMapper(UserAdmissibilityDao.class);
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
			UserAdmissibilityDao dao = session.getMapper(UserAdmissibilityDao.class);
			return  dao.getPage(map);
		}
		@Override
		public ArrayList<String> listallUser() {
			// TODO Auto-generated method stub
			SqlSession session = MyBatisSqlSessionFactory.openSession(true);
			UserAdmissibilityDao dao = session.getMapper(UserAdmissibilityDao.class);
			return dao.listallUser();
		}
}
