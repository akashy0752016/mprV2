package com.ddugky.mprmis.model.tcSetup;

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

import com.ddugky.mprmis.model.master.MstConstituency;
import com.ddugky.mprmis.model.master.MstDistrict;
import com.ddugky.mprmis.model.master.MstParliamentaryConstituency;
import com.ddugky.mprmis.model.master.MstState;
import com.ddugky.mprmis.model.projectSetup.ProjectDetails;

@Entity
@Table(name = "training_center_detail")
public class TrainingCenterDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column
	public String id;
	
	@ManyToOne
	@JoinColumn(name = "project_id")
	public ProjectDetails project;
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	public MstState state;
	
	@ManyToOne
	@JoinColumn(name = "district_id")
	public MstDistrict district;
	
	@Column
	public String address;
	
	@Column(name = "pincode")
	public String pinCode;
	
	@ManyToOne
	@JoinColumn(name = "assembly_Cons")
	@NotFound(action = NotFoundAction.IGNORE)
	public MstConstituency assemblyCons;
	
	@ManyToOne
	@JoinColumn(name = "parliament_name")
	public MstParliamentaryConstituency parliament;

	@Column
	public String tcLatitude;
	
	@Column
	public String tcLongitude;
	
	@Column
	public String resiStatus;
	
	@Column(name = "incharge_name")
	public String inChargeName;
	
	@Column(name = "incharge_mobile")
	public String inChargeMobile;
	
	@Column(name = "incharge_alt_mobile")
	public String inChargeAltMobile;
	
	@Column(name = "incharge_email")
	public String inChargeEmail;
	
	@Column(name = "tc_id")
	public String tcID;
	
	@Column
	public String tcName;

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
	
	@Column(name = "tcimage")
	private String tcImage;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ProjectDetails getProject() {
		return project;
	}

	public void setProject(ProjectDetails project) {
		this.project = project;
	}

	public MstState getState() {
		return state;
	}

	public void setState(MstState state) {
		this.state = state;
	}

	public MstDistrict getDistrict() {
		return district;
	}

	public void setDistrict(MstDistrict district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public MstConstituency getAssemblyCons() {
		return assemblyCons;
	}

	public void setAssemblyCons(MstConstituency assemblyCons) {
		this.assemblyCons = assemblyCons;
	}

	public MstParliamentaryConstituency getParliament() {
		return parliament;
	}

	public void setParliament(MstParliamentaryConstituency parliament) {
		this.parliament = parliament;
	}

	public String getTcLatitude() {
		return tcLatitude;
	}

	public void setTcLatitude(String tcLatitude) {
		this.tcLatitude = tcLatitude;
	}

	public String getTcLongitude() {
		return tcLongitude;
	}

	public void setTcLongitude(String tcLongitude) {
		this.tcLongitude = tcLongitude;
	}

	public String getResiStatus() {
		return resiStatus;
	}

	public void setResiStatus(String resiStatus) {
		this.resiStatus = resiStatus;
	}

	public String getInChargeName() {
		return inChargeName;
	}

	public void setInChargeName(String inChargeName) {
		this.inChargeName = inChargeName;
	}

	public String getInChargeMobile() {
		return inChargeMobile;
	}

	public void setInChargeMobile(String inChargeMobile) {
		this.inChargeMobile = inChargeMobile;
	}

	public String getInChargeAltMobile() {
		return inChargeAltMobile;
	}

	public void setInChargeAltMobile(String inChargeAltMobile) {
		this.inChargeAltMobile = inChargeAltMobile;
	}

	public String getInChargeEmail() {
		return inChargeEmail;
	}

	public void setInChargeEmail(String inChargeEmail) {
		this.inChargeEmail = inChargeEmail;
	}

	public String getTcID() {
		return tcID;
	}

	public void setTcID(String tcID) {
		this.tcID = tcID;
	}

	public String getTcName() {
		return tcName;
	}

	public void setTcName(String tcName) {
		this.tcName = tcName;
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

	public String getTcImage() {
		return tcImage;
	}

	public void setTcImage(String tcImage) {
		this.tcImage = tcImage;
	}
}
