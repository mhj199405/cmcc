package com.briup.bean;

import java.util.Date;



public class User {
/*
 * 用户名 
 **/
private String username;
/*
 * 用户密码
 **/
private String password;
/*
 * 联系方式
 **/
private String phone;
/*
 * 电子邮箱
 **/
private String email;
/*
 *注册时间 
 */
private Date  dob; 
public int indexPage;
public int pageItems;

public User() {
}
public User(String username, String password) {
	this.username = username;
	this.password = password;
}

public int getIndexPage() {
	return indexPage;
}
public void setIndexPage(int indexPage) {
	this.indexPage = indexPage;
}
public int getPageItems() {
	return pageItems;
}
public void setPageItems(int pageItems) {
	this.pageItems = pageItems;
}
public String getUsername() {
	return username;
}
public void setUsername(String username){
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
}
