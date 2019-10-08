package com.ddugky.mprmis.model.user;

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

import com.ddugky.mprmis.model.master.BlockMaster;
import com.ddugky.mprmis.model.master.MstCtsa;
import com.ddugky.mprmis.model.master.MstDistrict;
import com.ddugky.mprmis.model.master.MstState;

@Entity
@Table(name = "user_master")
public class UserMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", updatable = false, nullable = false)
	@GeneratedValue
	private String id;
	
	@Column(name = "login_id", nullable = false, unique = true)
	private String loginId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column
	private String emailId;
	
	@Column
	private String loginStatus;
	
	@Column
	private int loginAttempt;
	
	@Column
	private String mobileNo;
	
	@Column
	private String activeFlag;
	
	@Column
	private String roleId;
	
	@Column(name="passwordchange_flag")
	private String passwordchangeFlag;
	
	@Column(name="sdms_Registered")
	private String sdmsRegistered;
	
	@Column(name="sdms_submitflag")
	private String sdmsSubmitflag;
	
	@Column
	private String sdmsTpId;
	
	@Column
	private String sdmsTpName;
	
	@ManyToOne
	@JoinColumn(name = "state_id", nullable = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private MstState state;
	
	@ManyToOne
	@JoinColumn(name = "ctsa_id", nullable = false)
	@NotFound(action = NotFoundAction.IGNORE)
	private MstCtsa ctsa;
	
	@ManyToOne
	@JoinColumn(name = "block_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private BlockMaster block;
	
	@ManyToOne
	@JoinColumn(name = "district_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private MstDistrict district;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name = "created_on")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name = "last_modified_by")
	private String updatedBy;
	
	@Column(name = "last_modified_on")
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSdmsTpId() {
		return sdmsTpId;
	}

	public void setSdmsTpId(String sdmsTpId) {
		this.sdmsTpId = sdmsTpId;
	}

	public String getSdmsTpName() {
		return sdmsTpName;
	}

	public void setSdmsTpName(String sdmsTpName) {
		this.sdmsTpName = sdmsTpName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public int getLoginAttempt() {
		return loginAttempt;
	}

	public void setLoginAttempt(int loginAttempt) {
		this.loginAttempt = loginAttempt;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getSdmsRegistered() {
		return sdmsRegistered;
	}

	public void setSdmsRegistered(String sdmsRegistered) {
		this.sdmsRegistered = sdmsRegistered;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public MstState getState() {
		return state;
	}

	public void setState(MstState state) {
		this.state = state;
	}

	public MstCtsa getCtsa() {
		return ctsa;
	}

	public void setCtsa(MstCtsa ctsa) {
		this.ctsa = ctsa;
	}

	public BlockMaster getBlock() {
		return block;
	}

	public void setBlock(BlockMaster block) {
		this.block = block;
	}

	public MstDistrict getDistrict() {
		return district;
	}

	public void setDistrict(MstDistrict district) {
		this.district = district;
	}

	public String getPasswordchangeFlag() {
		return passwordchangeFlag;
	}

	public void setPasswordchangeFlag(String passwordchangeFlag) {
		this.passwordchangeFlag = passwordchangeFlag;
	}

	public String getSdmsSubmitflag() {
		return sdmsSubmitflag;
	}

	public void setSdmsSubmitflag(String sdmsSubmitflag) {
		this.sdmsSubmitflag = sdmsSubmitflag;
	}
	
}
