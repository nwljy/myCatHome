package com.example.myCat.entities;
// Generated 2018-6-8 0:41:39 by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EInformation generated by hbm2java
 */
@Entity
@Table(name = "e_information", catalog = "spring_boot")
public class EInformation implements java.io.Serializable {

	private Integer id;
	private EUser EUser;
	private String title;
	private String text;
	private String createDate;
	private String image;
	private String url;

	public EInformation() {
	}

	public EInformation(EUser EUser, String title, String text, String createDate, String image, String url) {
		this.EUser = EUser;
		this.title = title;
		this.text = text;
		this.createDate = createDate;
		this.image = image;
		this.url = url;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_Id")
	public EUser getEUser() {
		return this.EUser;
	}

	public void setEUser(EUser EUser) {
		this.EUser = EUser;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "text")
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "create_date", length = 14)
	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Column(name = "image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
