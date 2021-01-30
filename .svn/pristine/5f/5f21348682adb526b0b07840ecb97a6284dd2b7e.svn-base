package com.briup.service.Impl;

import org.apache.ibatis.session.SqlSession;

import com.briup.bean.User;
import com.briup.common.exception.UserException;
import com.briup.common.util.MD5;
import com.briup.common.util.MyBatisSqlSessionFactory;
import com.briup.dao.UserAdminDao;
import com.briup.service.UserAdminService;

public class UserAdminServiceImpl implements UserAdminService{
  /**
   *这是管理员登录的方式 
 * @throws UserException 
   */
	@Override
	public User loginUser(String name, String password) throws UserException {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisSqlSessionFactory.openSession(true);
		UserAdminDao dao = session.getMapper(UserAdminDao.class);
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
@Override
public User seleUser(String name) {
	// TODO Auto-generated method stub
	SqlSession session = MyBatisSqlSessionFactory.openSession(true);
	UserAdminDao dao = session.getMapper(UserAdminDao.class);
	return dao.findUser(name);
}
}
