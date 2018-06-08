package com.example.myCat.entities;
// Generated 2018-6-8 0:41:39 by Hibernate Tools 5.2.10.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Menu generated by hbm2java
 */
@Entity
@Table(name = "menu", catalog = "spring_boot")
public class Menu implements java.io.Serializable {

	private String CId;
	private UserGroup userGroup;
	private String CMenuurl;
	private String CParentid;
	private BigDecimal IOrder;
	private String CIconurl;
	private String CLevel;
	private String CRooturl;
	private String CNote;
	private Character CVisible;

	public Menu() {
	}

	public Menu(String CId) {
		this.CId = CId;
	}

	public Menu(String CId, UserGroup userGroup, String CMenuurl, String CParentid, BigDecimal IOrder, String CIconurl,
			String CLevel, String CRooturl, String CNote, Character CVisible) {
		this.CId = CId;
		this.userGroup = userGroup;
		this.CMenuurl = CMenuurl;
		this.CParentid = CParentid;
		this.IOrder = IOrder;
		this.CIconurl = CIconurl;
		this.CLevel = CLevel;
		this.CRooturl = CRooturl;
		this.CNote = CNote;
		this.CVisible = CVisible;
	}

	@Id

	@Column(name = "C_ID", unique = true, nullable = false, length = 32)
	public String getCId() {
		return this.CId;
	}

	public void setCId(String CId) {
		this.CId = CId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Group_id")
	public UserGroup getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(UserGroup userGroup) {
		this.userGroup = userGroup;
	}

	@Column(name = "C_MENUURL", length = 400)
	public String getCMenuurl() {
		return this.CMenuurl;
	}

	public void setCMenuurl(String CMenuurl) {
		this.CMenuurl = CMenuurl;
	}

	@Column(name = "C_PARENTID", length = 64)
	public String getCParentid() {
		return this.CParentid;
	}

	public void setCParentid(String CParentid) {
		this.CParentid = CParentid;
	}

	@Column(name = "I_ORDER", precision = 22, scale = 0)
	public BigDecimal getIOrder() {
		return this.IOrder;
	}

	public void setIOrder(BigDecimal IOrder) {
		this.IOrder = IOrder;
	}

	@Column(name = "C_ICONURL", length = 400)
	public String getCIconurl() {
		return this.CIconurl;
	}

	public void setCIconurl(String CIconurl) {
		this.CIconurl = CIconurl;
	}

	@Column(name = "C_LEVEL", length = 200)
	public String getCLevel() {
		return this.CLevel;
	}

	public void setCLevel(String CLevel) {
		this.CLevel = CLevel;
	}

	@Column(name = "C_ROOTURL", length = 200)
	public String getCRooturl() {
		return this.CRooturl;
	}

	public void setCRooturl(String CRooturl) {
		this.CRooturl = CRooturl;
	}

	@Column(name = "C_NOTE")
	public String getCNote() {
		return this.CNote;
	}

	public void setCNote(String CNote) {
		this.CNote = CNote;
	}

	@Column(name = "C_VISIBLE", length = 1)
	public Character getCVisible() {
		return this.CVisible;
	}

	public void setCVisible(Character CVisible) {
		this.CVisible = CVisible;
	}

}
