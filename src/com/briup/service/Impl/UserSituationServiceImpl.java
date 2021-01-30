package com.briup.service.Impl;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Situation;
import com.briup.common.util.MyBatisSqlSessionFactory;
import com.briup.dao.UserSituationDao;
import com.briup.service.UserSituationService;
public class UserSituationServiceImpl implements UserSituationService{
	@Override
	public void addSituation(Situation stt) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserSituationDao dao = session.getMapper(UserSituationDao.class);
		dao.addSituation(stt);
	}
	@Override
	public Situation listSituations(String ucpname) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserSituationDao dao = session.getMapper(UserSituationDao.class);
		return dao.listSituations(ucpname);
	}
	@Override
	public void updateSituations(Situation stt) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserSituationDao dao = session.getMapper(UserSituationDao.class);
		dao.updateSituations(stt);
	}
	@Override
	public Situation lookSituations(String ucpname) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserSituationDao dao = session.getMapper(UserSituationDao.class);
		return dao.listSituations(ucpname);
	}
	
	// 查询出所有的事件(已经受理) 
	 
	public static int getCountComp(){
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserSituationDao dao = session.getMapper(UserSituationDao.class);
		return dao.getCountComp();
	}
	
	 //（对于不重复的事件，进行分页） (已经受理) 
	 
	public static  ArrayList <Situation> getPageShowCop(int pageIndex,int pageItems) {
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("pageIndex", (pageIndex-1)*pageItems);
		map.put("pageItems", pageItems);
		UserSituationDao dao=session.getMapper(UserSituationDao.class);
		return dao.getPageShowCop(map);
	}
	@Override
	public ArrayList<Situation> allsitucomname() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserSituationDao dao = session.getMapper(UserSituationDao.class);
		return dao.allsitucomname();
	}

}
