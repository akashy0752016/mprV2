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
@Table(name = "mst_special_area")
public class MstSpecialSrea implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue
	private String specialAreaId;
	
	@Column
	private String specialAreaCode;
	
	@Column
	private String specialAreaName;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	
	@Column
	private String createdBy;
	
	@Column(name = "modifed_by")
	private String updateBy;
	
	@Column(name = "modified_on")
	@Temporal(TemporalType.DATE)
	private Date updatedOn;

	public String getSpecialAreaId() {
		return specialAreaId;
	}

	public void setSpecialAreaId(String specialAreaId) {
		this.specialAreaId = specialAreaId;
	}

	public String getSpecialAreaCode() {
		return specialAreaCode;
	}

	public void setSpecialAreaCode(String specialAreaCode) {
		this.specialAreaCode = specialAreaCode;
	}

	public String getSpecialAreaName() {
		return specialAreaName;
	}

	public void setSpecialAreaName(String specialAreaName) {
		this.specialAreaName = specialAreaName;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
}
