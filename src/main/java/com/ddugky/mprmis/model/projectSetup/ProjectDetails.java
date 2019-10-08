package com.ddugky.mprmis.model.projectSetup;

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

import com.ddugky.mprmis.model.master.MstCtsa;
import com.ddugky.mprmis.model.master.MstState;
import com.ddugky.mprmis.model.user.UserMaster;

@Entity
@Table(name = "project_details")
public class ProjectDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	public String id;
	
	@Column
	public String fileNumber;
	
	@ManyToOne
	@JoinColumn(name = "pia_prn", nullable = false)
	private UserMaster piaPrn;
	
	@Column
	private String projectScheme;
	
	@ManyToOne
	@JoinColumn(name = "ctsa_type", nullable = true)
	@NotFound(action=NotFoundAction.IGNORE)
	private MstCtsa ctsaMaster;
	
	@Column(name = "project_id")
	private String projectID;
	
	@Column
	private long totalProjectCost;
	
	@Column(name = "bg_amount")
	private String bgamount;
	
	@Column(name = "bg_number")
	private String bgnumber;
	
	@Column
	private String centralShare;
	
	@Column
	private String stateShare;
	
	@Column
	private long programCost;
	
	@Column
	private Integer welfareCost;
	
	@Column
	private String consortium;
	
	@ManyToOne
	@JoinColumn(name = "consortium_prn")
	@NotFound(action = NotFoundAction.IGNORE)
	private UserMaster prnOfConsortiumPartner;
	
	@Column
	private String partnerApplicantPiaSame;
	
	@Column(name = "date_of_pac")
	@Temporal(TemporalType.DATE)
	private Date dateOfPAC;
	
	@Column(name = "date_of_ec")
	@Temporal(TemporalType.DATE)
	private Date dateOfEc;
	
	@Column
	private String sanctioned;	
	
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
	
	@ManyToOne
	@JoinColumn(name = "state_id", nullable = false)
	private MstState state;
	
	@Column(name = "is_champion_project")
	private Boolean is_champion_project;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}

	public UserMaster getPiaPrn() {
		return piaPrn;
	}

	public void setPiaPrn(UserMaster piaPrn) {
		this.piaPrn = piaPrn;
	}

	public String getProjectScheme() {
		return projectScheme;
	}

	public void setProjectScheme(String projectScheme) {
		this.projectScheme = projectScheme;
	}

	public MstCtsa getCtsaMaster() {
		return ctsaMaster;
	}

	public void setCtsaMaster(MstCtsa ctsaMaster) {
		this.ctsaMaster = ctsaMaster;
	}

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public long getTotalProjectCost() {
		return totalProjectCost;
	}

	public void setTotalProjectCost(long totalProjectCost) {
		this.totalProjectCost = totalProjectCost;
	}

	public String getBgamount() {
		return bgamount;
	}

	public void setBgamount(String bgamount) {
		this.bgamount = bgamount;
	}

	public String getBgnumber() {
		return bgnumber;
	}

	public void setBgnumber(String bgnumber) {
		this.bgnumber = bgnumber;
	}

	public String getCentralShare() {
		return centralShare;
	}

	public void setCentralShare(String centralShare) {
		this.centralShare = centralShare;
	}

	public String getStateShare() {
		return stateShare;
	}

	public void setStateShare(String stateShare) {
		this.stateShare = stateShare;
	}

	public long getProgramCost() {
		return programCost;
	}

	public void setProgramCost(long programCost) {
		this.programCost = programCost;
	}

	public Integer getWelfareCost() {
		return welfareCost;
	}

	public void setWelfareCost(Integer welfareCost) {
		this.welfareCost = welfareCost;
	}

	public String getConsortium() {
		return consortium;
	}

	public void setConsortium(String consortium) {
		this.consortium = consortium;
	}

	public UserMaster getPrnOfConsortiumPartner() {
		return prnOfConsortiumPartner;
	}

	public void setPrnOfConsortiumPartner(UserMaster prnOfConsortiumPartner) {
		this.prnOfConsortiumPartner = prnOfConsortiumPartner;
	}

	public String getPartnerApplicantPiaSame() {
		return partnerApplicantPiaSame;
	}

	public void setPartnerApplicantPiaSame(String partnerApplicantPiaSame) {
		this.partnerApplicantPiaSame = partnerApplicantPiaSame;
	}

	public Date getDateOfPAC() {
		return dateOfPAC;
	}

	public void setDateOfPAC(Date dateOfPAC) {
		this.dateOfPAC = dateOfPAC;
	}

	public Date getDateOfEc() {
		return dateOfEc;
	}

	public void setDateOfEc(Date dateOfEc) {
		this.dateOfEc = dateOfEc;
	}

	public String getSanctioned() {
		return sanctioned;
	}

	public void setSanctioned(String sanctioned) {
		this.sanctioned = sanctioned;
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

	public MstState getState() {
		return state;
	}

	public void setState(MstState state) {
		this.state = state;
	}

	public Boolean getIs_champion_project() {
		return is_champion_project;
	}

	public void setIs_champion_project(Boolean is_champion_project) {
		this.is_champion_project = is_champion_project;
	}
}
