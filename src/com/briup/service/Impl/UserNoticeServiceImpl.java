package com.briup.service.Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Notice;
import com.briup.common.util.MyBatisSqlSessionFactory;
import com.briup.dao.UserNoticeDao;
import com.briup.service.UserNoticeServer;
public class UserNoticeServiceImpl implements UserNoticeServer {
	@Override
	public ArrayList<Notice> listallNotice() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao= session.getMapper(UserNoticeDao.class);
		return dao.listallNotice();
	}
	@Override
	public void addNotice(Notice noti) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao = session.getMapper(UserNoticeDao.class);
		dao.addNotice(noti);
	}
	@Override
	public void deleNotice(long id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao = session.getMapper(UserNoticeDao.class);
		dao.deleNotice(id);
	}
	@Override
	public void updaNotice(Notice noti) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao = session.getMapper(UserNoticeDao.class);
		dao.updaNotice(noti);
	}
	@Override
	public Notice lookidNotice(long id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao = session.getMapper(UserNoticeDao.class);
		return dao.lookidNotice(id);
	}
	public  static int getCount() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao= session.getMapper(UserNoticeDao.class);
		 int total = dao.findcount();
		return total;
	}
	/*	
	 *对数据进行分页操作 
	 */
	public static  ArrayList <Notice> getPageShowItems(int pageIndex,int pageItems) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("pageIndex", (pageIndex-1)*pageItems);
		map.put("pageItems", pageItems);
		UserNoticeDao dao = session.getMapper(UserNoticeDao.class);
		return  dao.getPage(map);
	}
	public ArrayList<Notice> listcom(String name){
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao = session.getMapper(UserNoticeDao.class);
		return dao.listcom(name);
	}
	public int getItem(String name){
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao = session.getMapper(UserNoticeDao.class);
		return dao.getItem(name);
	}
	@Override
	public void batchDelByids(List<Long> list) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserNoticeDao dao = session.getMapper(UserNoticeDao.class);
		dao.delByids(list);
	}
	
}