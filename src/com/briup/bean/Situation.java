package com.briup.bean;
import java.util.Date;
public class Situation {
	/*
	 * 受理事件
	 */
   private String  ucpname;
    /*
     *  受理原因 
     */
   private String reason;
    /*
     *  受理时间
     */
   private Date situtime;
    /*
     *  受理人
     */
   private String situpeople;
    /*
     *  受理的证据
     */
   private String situevidence;
    /*
     *  表示已受理
     */
   private String accsituation;
public String getUcpname() {
	return ucpname;
}
public void setUcpname(String ucpname) {
	this.ucpname = ucpname;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public Date getSitutime() {
	return situtime;
}
public void setSitutime(Date situtime) {
	this.situtime = situtime;
}
public String getSitupeople() {
	return situpeople;
}
public void setSitupeople(String situpeople) {
	this.situpeople = situpeople;
}
public String getSituevidence() {
	return situevidence;
}
public void setSituevidence(String situevidence) {
	this.situevidence = situevidence;
  }
public String getAccsituation() {
	return accsituation;
}
public void setAccsituation(String accsituation) {
	this.accsituation = accsituation;
}
@Override
public String toString() {
	return "Situation [ucpname=" + ucpname + ", reason=" + reason
			+ ", situtime=" + situtime + ", situpeople=" + situpeople
			+ ", situevidence=" + situevidence + ", accsituation="
			+ accsituation + "]";
}

} 
