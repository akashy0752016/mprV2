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
@Table(name = "mst_state")
public class MstState implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue
	private String stateId;
	
	@Column
	private String stateCode;
	
	@Column
	private String stateName;
	
	@Column
	private String stateShortName;
	
	@Column
	private String latitutde;
	
	@Column
	private String longitude;
	
	@Column(name = "Center_Share")
	private Integer centerShare;
	
	@Column(name = "State_Share")
	private Integer stateShare;
	
	
	@Column(name = "scst_percentage")
	private Integer sc_st;
	
	@Column(name = "minority_percentage")
	private Integer miniority;
	
	@Column(name = "women_percentage")
	private Integer women;
	
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
	
	@ManyToOne
	@JoinColumn(name = "ctsa_type", nullable = true)
	@NotFound(action=NotFoundAction.IGNORE)
	private MstState ctsa;

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateShortName() {
		return stateShortName;
	}

	public void setStateShortName(String stateShortName) {
		this.stateShortName = stateShortName;
	}

	public String getLatitutde() {
		return latitutde;
	}

	public void setLatitutde(String latitutde) {
		this.latitutde = latitutde;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getCenterShare() {
		return centerShare;
	}

	public void setCenterShare(Integer centerShare) {
		this.centerShare = centerShare;
	}

	public Integer getStateShare() {
		return stateShare;
	}

	public void setStateShare(Integer stateShare) {
		this.stateShare = stateShare;
	}

	public Integer getSc_st() {
		return sc_st;
	}

	public void setSc_st(Integer sc_st) {
		this.sc_st = sc_st;
	}

	public Integer getMiniority() {
		return miniority;
	}

	public void setMiniority(Integer miniority) {
		this.miniority = miniority;
	}

	public Integer getWomen() {
		return women;
	}

	public void setWomen(Integer women) {
		this.women = women;
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

	public MstState getCtsa() {
		return ctsa;
	}

	public void setCtsa(MstState ctsa) {
		this.ctsa = ctsa;
	}

}
