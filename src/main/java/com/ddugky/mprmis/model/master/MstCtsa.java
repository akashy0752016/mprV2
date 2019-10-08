package com.ddugky.mprmis.model.master;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "mst_ctsa")
public class MstCtsa implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ctsa_id")
	@GeneratedValue
	private String id;
	
	@Column
	private String ctsaName;
	
	@Column
	private String ctsaCode;
	
	@Column
	private boolean isDeleted;
	
	@Column
	private String createdBy;
	
	@Column(name = "last_modified_by")
	private String updatedBy;
	
	@Column(name = "created_on")
	@Temporal(TemporalType.DATE)
	private Date createdOnDate;
	
	@Column(name = "last_modified_on")
	@Temporal(TemporalType.DATE)
	private Date updatedOnDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCtsaName() {
		return ctsaName;
	}

	public void setCtsaName(String ctsaName) {
		this.ctsaName = ctsaName;
	}

	public String getCtsaCode() {
		return ctsaCode;
	}

	public void setCtsaCode(String ctsaCode) {
		this.ctsaCode = ctsaCode;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedOnDate() {
		return createdOnDate;
	}

	public void setCreatedOnDate(Date createdOnDate) {
		this.createdOnDate = createdOnDate;
	}

	public Date getUpdatedOnDate() {
		return updatedOnDate;
	}

	public void setUpdatedOnDate(Date updatedOnDate) {
		this.updatedOnDate = updatedOnDate;
	}
}
