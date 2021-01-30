package com.briup.service.Impl;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.CopyRight;
import com.briup.common.util.MyBatisSqlSessionFactory;
import com.briup.dao.UserCopyDao;
import com.briup.service.UserCopyService;

public class UserCopyServiceImpl implements UserCopyService {

	@Override
	public ArrayList<CopyRight> listAllcopy() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserCopyDao dao = session.getMapper(UserCopyDao.class);
		return dao.listAllcopy();
	}

}
