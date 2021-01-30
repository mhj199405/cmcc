package com.briup.bean;

public class Myinfo {
	private String idcard;
	 private String stuname;
	 private String stuid;
	 private String stusex;
	 private String stunation;
	 private String stubirth;
	 private String status;
	 private String faculty;
	 private String stuclass;
	 private String phone;
	 private String email;
	 private String qq;
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getStusex() {
		return stusex;
	}
	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
	public String getStunation() {
		return stunation;
	}
	public void setStunation(String stunation) {
		this.stunation = stunation;
	}
	public String getStubirth() {
		return stubirth;
	}
	public void setStubirth(String stubirth) {
		this.stubirth = stubirth;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getStuclass() {
		return stuclass;
	}
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
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
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	@Override
	public String toString() {
		return "Myinfo [email=" + email + ", faculty=" + faculty + ", idcard="
				+ idcard + ", phone=" + phone + ", qq=" + qq + ", status=" + status
				+ ", stubirth=" + stubirth + ", stuclass=" + stuclass + ", stuid="
				+ stuid + ", stuname=" + stuname + ", stunation=" + stunation
				+ ", stusex=" + stusex + "]";
	}

}
