package com.ddugky.mprmis.model.stateSetup;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.ddugky.mprmis.model.master.MstCtsa;
import com.ddugky.mprmis.model.master.MstDesignation;
import com.ddugky.mprmis.model.master.MstDistrict;
import com.ddugky.mprmis.model.master.MstState;
import com.ddugky.mprmis.model.master.ProjectTypeMaster;
import com.ddugky.mprmis.model.tcSetup.TrainingCenterDetail;


public class HrTeam implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column
	private String id;
	
	@Column
	private String personName;
	
	@Column
	private String location;
	
	@ManyToOne
	@JoinColumn(name = "designation_id")
	private MstDesignation designation;
	
	@ManyToOne
	@JoinColumn(name = "district_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private MstDistrict district;
	
	@Column
	@Temporal(TemporalType.DATE)
	public Date  joiningDate ;
	
	@Column
	private String  email ;
	
	@Column
	private String  officeNo ;
	
	@Column
	private String  mobileNo ;
	
	@Column(name = "eSop_cert_req")
	private String  eSopCertReq ;
	
	@Column(name = "eSop_cert_level")
	private String  eSopCertLevel ;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date  certificationDate ;
	
	@Column
	private String  isActive ;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "training_cente")
	@NotFound(action = NotFoundAction.IGNORE)
	private TrainingCenterDetail  trainingcente ;
	
	@Column(name = "dateOfLeaving")
	@Temporal(TemporalType.DATE)
	private Date dateOfLeaving;
	
	@ManyToOne
	@JoinColumn(name = "state_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private MstState state;
	
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
	
	@Column(name = "eSop_cert_No")
	private String CertNo;
	
	@ManyToOne
	@JoinColumn(name = "project_type_name")
	@NotFound(action = NotFoundAction.IGNORE)
	private ProjectTypeMaster thematic;
	
	@ManyToOne
	@JoinColumn(name = "ctsa_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private MstCtsa ctsaMaster;
	
	@Column
	public String  empType ;
	
	@Column
	public String ifsc_code ;
	
	@Column
	public String account_number;
	
	@Column
	private String bankName;
	
	@Column
	public double salary;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public MstDesignation getDesignation() {
		return designation;
	}

	public void setDesignation(MstDesignation designation) {
		this.designation = designation;
	}

	public MstDistrict getDistrict() {
		return district;
	}

	public void setDistrict(MstDistrict district) {
		this.district = district;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficeNo() {
		return officeNo;
	}

	public void setOfficeNo(String officeNo) {
		this.officeNo = officeNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String geteSopCertReq() {
		return eSopCertReq;
	}

	public void seteSopCertReq(String eSopCertReq) {
		this.eSopCertReq = eSopCertReq;
	}

	public String geteSopCertLevel() {
		return eSopCertLevel;
	}

	public void seteSopCertLevel(String eSopCertLevel) {
		this.eSopCertLevel = eSopCertLevel;
	}

	public Date getCertificationDate() {
		return certificationDate;
	}

	public void setCertificationDate(Date certificationDate) {
		this.certificationDate = certificationDate;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public TrainingCenterDetail getTrainingcente() {
		return trainingcente;
	}

	public void setTrainingcente(TrainingCenterDetail trainingcente) {
		this.trainingcente = trainingcente;
	}

	public Date getDateOfLeaving() {
		return dateOfLeaving;
	}

	public void setDateOfLeaving(Date dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}

	public MstState getState() {
		return state;
	}

	public void setState(MstState state) {
		this.state = state;
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

	public String getCertNo() {
		return CertNo;
	}

	public void setCertNo(String certNo) {
		CertNo = certNo;
	}

	public ProjectTypeMaster getThematic() {
		return thematic;
	}

	public void setThematic(ProjectTypeMaster thematic) {
		this.thematic = thematic;
	}

	public MstCtsa getCtsaMaster() {
		return ctsaMaster;
	}

	public void setCtsaMaster(MstCtsa ctsaMaster) {
		this.ctsaMaster = ctsaMaster;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
