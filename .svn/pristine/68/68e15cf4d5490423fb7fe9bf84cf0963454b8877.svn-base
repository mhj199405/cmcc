package com.briup.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.briup.bean.Notice;
public interface UserNoticeDao {
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
 public void deleNotice(long id);
  /*
   * 更新公告
   */
 public void updaNotice(Notice noti);
  /*
   * 根据id值查看公告详细内容
   */
 public  Notice lookidNotice(long id);
    
 public int findcount();
 /*
  * 用来对学生数进行分页 
  */
	public ArrayList<Notice> getPage(HashMap<String, Integer> map);
	public ArrayList<Notice>  listcom(String name);
	public int getItem(String name);
	public void delByids(List<Long> list); 
}
