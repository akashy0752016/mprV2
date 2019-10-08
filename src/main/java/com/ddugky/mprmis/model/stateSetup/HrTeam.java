package com.ddugky.mprmis.model.stateSetup;

import static org.mockito.Mockito.CALLS_REAL_METHODS;

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
}
