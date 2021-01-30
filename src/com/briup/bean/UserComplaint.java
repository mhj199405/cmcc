package com.briup.bean;

import java.util.Date;

public class UserComplaint {
    /*
	 * 用户名 (为了和用户投诉的事件关联起来)
	 */
  private String comname;
	/*
	 * 投诉事件号，有mysql数据库自动维护 
	 */
  private int  id;
  /*
   * 投诉的事件的名字
   */
  private String name;
	/*
	 * 被投诉者 
	 */
  private String complaint;
    /*
     * 何故事件
     */
  private String publish;
    /*
     * 事件发生的时间(精确到分秒)
     */
  private Date dob;
  /*
   * 事件的内容
   */
  private String content;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getComplaint() {
	return complaint;
}
public void setComplaint(String complaint) {
	this.complaint = complaint;
}
public String getPublish() {
	return publish;
}
public void setPublish(String publish) {
	this.publish = publish;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getComname() {
	return comname;
}
public void setComname(String comname) {
	this.comname = comname;
}
@Override
public String toString() {
	return "UserComplaint [comname=" + comname + ", id=" + id + ", name="
			+ name + ", complaint=" + complaint + ", publish=" + publish
			+ ", dob=" + dob + ", content=" + content + "]";
}

}