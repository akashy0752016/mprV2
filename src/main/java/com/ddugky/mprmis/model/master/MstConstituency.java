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
import javax.persistence.Transient;

@Entity
@Table(name = "mst_constituency")
public class MstConstituency implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private String constituencyId;	
	
	@Transient
	private String editId;
	
	@Column
	private String assemblyConstituencyCode;
	
	@Column
	private String assemblyConstituencyName;
	
	@ManyToOne
	@JoinColumn(name = "district_id")
	private MstDistrict district;
	
	@ManyToOne
	@JoinColumn(name = "parliamentary_constituency_Name")
	private MstParliamentaryConstituency parliamentaryConstituencyName;
	
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

	public String getConstituencyId() {
		return constituencyId;
	}

	public void setConstituencyId(String constituencyId) {
		this.constituencyId = constituencyId;
	}

	public String getEditId() {
		return editId;
	}

	public void setEditId(String editId) {
		this.editId = editId;
	}

	public String getAssemblyConstituencyCode() {
		return assemblyConstituencyCode;
	}

	public void setAssemblyConstituencyCode(String assemblyConstituencyCode) {
		this.assemblyConstituencyCode = assemblyConstituencyCode;
	}

	public String getAssemblyConstituencyName() {
		return assemblyConstituencyName;
	}

	public void setAssemblyConstituencyName(String assemblyConstituencyName) {
		this.assemblyConstituencyName = assemblyConstituencyName;
	}

	public MstDistrict getDistrict() {
		return district;
	}

	public void setDistrict(MstDistrict district) {
		this.district = district;
	}

	public MstParliamentaryConstituency getParliamentaryConstituencyName() {
		return parliamentaryConstituencyName;
	}

	public void setParliamentaryConstituencyName(MstParliamentaryConstituency parliamentaryConstituencyName) {
		this.parliamentaryConstituencyName = parliamentaryConstituencyName;
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
