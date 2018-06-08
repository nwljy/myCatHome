package com.example.myCat.entities;
// Generated 2018-6-8 0:41:39 by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ECategory generated by hbm2java
 */
@Entity
@Table(name = "e_category", catalog = "spring_boot")
public class ECategory implements java.io.Serializable {

	private Integer id;
	private EVblog EVblog;
	private String name;
	private String createDate;
	private String text;

	public ECategory() {
	}

	public ECategory(EVblog EVblog) {
		this.EVblog = EVblog;
	}

	public ECategory(EVblog EVblog, String name, String createDate, String text) {
		this.EVblog = EVblog;
		this.name = name;
		this.createDate = createDate;
		this.text = text;
	}

	@GenericGenerator(name = "com.example.myCat.entities.ECategoryIdGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "EVblog"))
	@Id
	@GeneratedValue(generator = "com.example.myCat.entities.ECategoryIdGenerator")

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public EVblog getEVblog() {
		return this.EVblog;
	}

	public void setEVblog(EVblog EVblog) {
		this.EVblog = EVblog;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "create_date", length = 14)
	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Column(name = "text")
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

}