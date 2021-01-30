package com.briup.service;


import java.util.ArrayList;

import com.briup.bean.Situation;

public interface UserSituationService {
       /*
        * 表示开始受理事件
        */
	 public  void  addSituation(Situation stt);
	   /*
	    *  查询单个事件的受理情况 
	    */
	 public Situation listSituations(String ucpname);
	   /*
	    *  表示老师对已经处理过的事件进行更新处理
	    */
	 public void  updateSituations(Situation stt);
	 /*
	  * 老师在进行事件受理时要知道此事件被受理
	  */
	 public Situation lookSituations(String ucpname);
	 /*
	  * 查询所有已经处理过的事件的名称，是为了防止其他受理者对于已经处理的事件进行处理 
	  */
	 public ArrayList<Situation>  allsitucomname();
}
