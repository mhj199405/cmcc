package com.briup.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.briup.bean.Notice;

public interface UserNoticeServer {
	 /*
	   * 列出公告 
	   */
	 public ArrayList<Notice> listallNotice();
	  /*
	   * 添加公告
	   */
	 public void addNotice(Notice noti);
	  /*
	   * 删除一条公告 
	   */
	 public void deleNotice(long  id);
	  /*
	   * 更新公告
	   */
	 public void updaNotice(Notice noti);
	  /*
	   * 根据id值查看公告详细内容
	   */
	 public Notice lookidNotice(long id);
	 public void batchDelByids(List<Long> list);
}
