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
@Table(name = "mst_district")
public class MstDistrict implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue
	private String districtId;
	
	@Column
	private String districtCode;
	
	@Column
	private String districtName;
	
	@Column
	private String specialArea;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	private MstState state;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "special_area_id")
	@NotFound(action = NotFoundAction.IGNORE)
	private MstSpecialSrea typeSpecialArea;
	
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
	
}
