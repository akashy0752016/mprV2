package com.ddugky.mprmis.model.master;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "block_master")
public class BlockMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "block_id")
	@GeneratedValue
	private String id;
	
	@Column(name = "block_Code")
	private String blockCode;
	
	@Column
	private String blockName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "districtid")
	private MstDistrict districtId;
	
	@Column
	private String createdBy;

	@Column
	@Temporal(TemporalType.DATE)
	private Date createdOn;
	
	@Column
	private String updatedBy;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date updatedOn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public MstDistrict getDistrictId() {
		return districtId;
	}

	public void setDistrictId(MstDistrict districtId) {
		this.districtId = districtId;
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
