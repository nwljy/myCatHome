package com.example.myCat.entities;
// Generated 2018-6-8 0:41:39 by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Imageupload generated by hbm2java
 */
@Entity
@Table(name = "imageupload", catalog = "spring_boot")
public class Imageupload implements java.io.Serializable {

	private int id;
	private String imageUrl;
	private Integer refId;
	private Integer imageIndex;
	private String imageDesc;
	private Double imageSize;
	private String createDate;
	private String createTime;
	private String typ;

	public Imageupload() {
	}

	public Imageupload(int id) {
		this.id = id;
	}

	public Imageupload(int id, String imageUrl, Integer refId, Integer imageIndex, String imageDesc, Double imageSize,
			String createDate, String createTime, String typ) {
		this.id = id;
		this.imageUrl = imageUrl;
		this.refId = refId;
		this.imageIndex = imageIndex;
		this.imageDesc = imageDesc;
		this.imageSize = imageSize;
		this.createDate = createDate;
		this.createTime = createTime;
		this.typ = typ;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "ImageUrl", length = 500)
	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Column(name = "Ref_Id")
	public Integer getRefId() {
		return this.refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	@Column(name = "ImageIndex")
	public Integer getImageIndex() {
		return this.imageIndex;
	}

	public void setImageIndex(Integer imageIndex) {
		this.imageIndex = imageIndex;
	}

	@Column(name = "ImageDesc")
	public String getImageDesc() {
		return this.imageDesc;
	}

	public void setImageDesc(String imageDesc) {
		this.imageDesc = imageDesc;
	}

	@Column(name = "ImageSize", precision = 50, scale = 0)
	public Double getImageSize() {
		return this.imageSize;
	}

	public void setImageSize(Double imageSize) {
		this.imageSize = imageSize;
	}

	@Column(name = "CreateDate", length = 8)
	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Column(name = "CreateTime", length = 6)
	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Column(name = "typ", length = 2)
	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

}