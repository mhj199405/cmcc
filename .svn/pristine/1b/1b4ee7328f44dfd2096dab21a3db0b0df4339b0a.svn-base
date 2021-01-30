package com.briup.dao;
import java.util.ArrayList;
import java.util.HashMap;

import com.briup.bean.Situation;
import com.briup.bean.UserComplaint;


public interface UserSituationDao {
	/*
	 *  受理事件(分为 已处理和未处理)
	 */
  public  void  addSituation(Situation stt);
   /*
    *  (学生和老师)均查询单个事件的受理情况 
    */
  public Situation listSituations(String ucpname);
    /*
     * (老师)对于之前受理的事件更新 
     */
  public void updateSituations(Situation stt);
    /*
     * 在受理事件之前，看这件事情是否受理
     */
  public Situation Situations(String ucpname); 
  /*
	 * 查询出所有事件(已经受理)
	 */
	public int  getCountComp();
	/*
	 * 对于不重复的事件进行分页 (已经受理)
	 */
	public ArrayList<Situation> getPageShowCop(HashMap<String,Integer> map);
	 public ArrayList<Situation>  allsitucomname();
}
