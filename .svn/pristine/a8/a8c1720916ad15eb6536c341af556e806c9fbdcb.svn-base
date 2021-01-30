package com.briup.common.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
   private static SqlSessionFactory sqlSessionFactory;
   public static SqlSessionFactory getSqlSessionFactory(){
  if(sqlSessionFactory==null){
	 synchronized (MyBatisSqlSessionFactory.class) {
	 if(sqlSessionFactory==null){
		 InputStream  is=null;
		try {
		  is=Resources.getResourceAsStream("mybatis-config.xml");
		  sqlSessionFactory= new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 
	 }  
    } 
  }
	return sqlSessionFactory;   
   }
   public static SqlSession openSession(){
	   //false表示手动提交(默认)
	return getSqlSessionFactory().openSession();   
   }
   public static SqlSession openSession(boolean autoCommit){
	   return getSqlSessionFactory().openSession(autoCommit);   
   }
}
