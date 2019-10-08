package com.ddugky.mprmis.model.master;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "mst_parliamentaryconstituency")
public class MstParliamentaryConstituency implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private MstState stateName;
	
	@Column(name = "is_deleted")
	private boolean isdDeleted;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public MstState getStateName() {
		return stateName;
	}

	public void setStateName(MstState stateName) {
		this.stateName = stateName;
	}

	public boolean isIsdDeleted() {
		return isdDeleted;
	}

	public void setIsdDeleted(boolean isdDeleted) {
		this.isdDeleted = isdDeleted;
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
