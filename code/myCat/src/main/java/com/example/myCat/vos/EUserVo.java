package com.example.myCat.vos;

import com.example.myCat.entities.UserGroup;

public class EUserVo implements java.io.Serializable {

	private Integer id;
	private UserGroup userGroup;
	private String uid;
	private String pass;
	private String name;
	private String text;
	private String createDate;
	private String modifyDate;
	private String lastLoginDate;
	private String phone;
	private String qq;
	private String email;
	private String sex;
	private Integer loginCount;
	private Integer isFocus;
	private String befrom;
	private String wechatId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UserGroup getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}
	public Integer getIsFocus() {
		return isFocus;
	}
	public void setIsFocus(Integer isFocus) {
		this.isFocus = isFocus;
	}
	public String getBefrom() {
		return befrom;
	}
	public void setBefrom(String befrom) {
		this.befrom = befrom;
	}
	public String getWechatId() {
		return wechatId;
	}
	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}
	@Override
	public String toString() {
		return "EUserVo [id=" + id + ", userGroup=" + userGroup + ", uid=" + uid + ", pass=" + pass + ", name=" + name
				+ ", text=" + text + ", createDate=" + createDate + ", modifyDate=" + modifyDate + ", lastLoginDate="
				+ lastLoginDate + ", phone=" + phone + ", qq=" + qq + ", email=" + email + ", sex=" + sex
				+ ", loginCount=" + loginCount + ", isFocus=" + isFocus + ", befrom=" + befrom + ", wechatId="
				+ wechatId + "]";
	}
	

}
