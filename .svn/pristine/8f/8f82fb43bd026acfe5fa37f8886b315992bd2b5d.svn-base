package com.briup.service.Impl;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.Sys;
import com.briup.common.util.MyBatisSqlSessionFactory;
import com.briup.dao.UserSysDao;
import com.briup.service.UserSysService;

public class UserSysServiceImpl implements UserSysService{

	@Override
	public ArrayList<Sys> listAllsys() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserSysDao dao = session.getMapper(UserSysDao.class);
		return dao.listAllsys();
	}

}
