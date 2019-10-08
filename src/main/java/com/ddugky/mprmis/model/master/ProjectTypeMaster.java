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
import javax.persistence.Transient;

@Entity
@Table(name = "project_type_master")
public class ProjectTypeMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column
	private String projectTypeId;
	
	@Transient
	private String editId;
	
	@Column(name = "project_type_code")
	private String projectTypCode;
	
	@Column
	private String projectTypeName;
	
	@Column
 	private String createdBy;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	
	@Column(name = "last_modified_by")
	private String updatedBy;
	
	@Column(name = "last_modified_on")
	@Temporal(TemporalType.DATE)
	private Date updatedOn;

	public String getProjectTypeId() {
		return projectTypeId;
	}

	public void setProjectTypeId(String projectTypeId) {
		this.projectTypeId = projectTypeId;
	}

	public String getEditId() {
		return editId;
	}

	public void setEditId(String editId) {
		this.editId = editId;
	}

	public String getProjectTypCode() {
		return projectTypCode;
	}

	public void setProjectTypCode(String projectTypCode) {
		this.projectTypCode = projectTypCode;
	}

	public String getProjectTypeName() {
		return projectTypeName;
	}

	public void setProjectTypeName(String projectTypeName) {
		this.projectTypeName = projectTypeName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
