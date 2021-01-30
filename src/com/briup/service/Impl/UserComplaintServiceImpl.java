package com.briup.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Situation;
import com.briup.bean.UserComplaint;
import com.briup.common.util.MyBatisSqlSessionFactory;
import com.briup.dao.UserComplaintDao;
import com.briup.service.UserComplaintService;

public class UserComplaintServiceImpl implements UserComplaintService {
	@Override
	public ArrayList<UserComplaint> listAllCompl(String name) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return dao.listAllUserComplaint(name);
	}

	@Override
	public void addUserCompl(UserComplaint ucl) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		dao.addUserComplaint(ucl);
	}

	@Override
	public void deleUserCompl(String name,int id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		dao.deleUserComplaint(name,id);
	}

	@Override
	public void updateUserCompl(UserComplaint uc) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		dao.updateUserComplaint(uc);
	}

	@Override
	public ArrayList<UserComplaint> listIdCompl(String name,int id){
		// TODO Auto-generated method stub
		SqlSession  session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return 	dao.seleIdcomplaint(name,id);
		
	}

	@Override
	public ArrayList<Integer> listallComp(String name) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return dao.listallComp();
	}
	/*
	 *统计总共有多少用户 
	 */
	public  static int getCount() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao= session.getMapper(UserComplaintDao.class);
		int total=dao.findcount();
		return total;
	}
	/*	 
	 *对数据进行分页操作 
	 */
	public static  ArrayList <UserComplaint> getPageShowItems(int pageIndex,int pageItems) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("pageIndex", (pageIndex-1)*pageItems);
		map.put("pageItems", pageItems);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return dao.getPage(map);
	}

	@Override
	public ArrayList<UserComplaint> listallCompimpl(String name) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return dao.listallCompimpl(name);
	}

	@Override
	public UserComplaint listcomp(int id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return dao.listcompid(id);
	}

	@Override
	public int countCompl(String name) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return dao.countCompl(name);
	}
	/*
	 * 查询出所有的事件(事件不能重复) 
	 */
	public static int getCountComp(){
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao= session.getMapper(UserComplaintDao.class);
		return dao.getCountComp();
		
	}
	/*
	 * （对于不重复的事件，进行分页） 
	 */
	public static  ArrayList<UserComplaint> getPageShowCop(int pageIndex,int pageItems) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("pageIndex", (pageIndex-1)*pageItems);
		map.put("pageItems", pageItems);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return  dao.getPageShowCop(map);
	}
	/*
	 * 查询某个用户下，有多少投诉事件 
	 */
	/*public static int count(String comname){
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao= session.getMapper(UserComplaintDao.class);
		return dao.count(comname);
	}*/
	/*
	 *  对于某个用户下有多少用户进行分页操作
	 */
	public  ArrayList<UserComplaint> userPageEvent(String comname){
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return dao.userPageEvent(comname);
	}

	@Override
	public UserComplaint lisusenamecom(String comname,String name) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		return dao.lisusenamecom(comname, name);
	}

	@Override
	public void batDeleCompla(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserComplaintDao dao = session.getMapper(UserComplaintDao.class);
		dao.batDeleCompla(list);
	}
}
