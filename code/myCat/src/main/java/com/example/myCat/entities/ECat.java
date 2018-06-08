package com.example.myCat.entities;
// Generated 2018-6-8 0:41:39 by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ECat generated by hbm2java
 */
@Entity
@Table(name = "e_cat", catalog = "spring_boot")
public class ECat implements java.io.Serializable {

	private Integer id;
	private String name;
	private String text;
	private String createDate;
	private Integer isLive;
	private Integer indexId;
	private String point;
	private Set<EUserCatRef> EUserCatRefs = new HashSet<EUserCatRef>(0);

	public ECat() {
	}

	public ECat(String name, String text, String createDate, Integer isLive, Integer indexId, String point,
			Set<EUserCatRef> EUserCatRefs) {
		this.name = name;
		this.text = text;
		this.createDate = createDate;
		this.isLive = isLive;
		this.indexId = indexId;
		this.point = point;
		this.EUserCatRefs = EUserCatRefs;
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

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Column(name = "isLive")
	public Integer getIsLive() {
		return this.isLive;
	}

	public void setIsLive(Integer isLive) {
		this.isLive = isLive;
	}

	@Column(name = "indexID")
	public Integer getIndexId() {
		return this.indexId;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	@Column(name = "Point")
	public String getPoint() {
		return this.point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ECat")
	public Set<EUserCatRef> getEUserCatRefs() {
		return this.EUserCatRefs;
	}

	public void setEUserCatRefs(Set<EUserCatRef> EUserCatRefs) {
		this.EUserCatRefs = EUserCatRefs;
	}

}