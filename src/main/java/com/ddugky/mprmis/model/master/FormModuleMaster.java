package com.ddugky.mprmis.model.master;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "form_module_master")
public class FormModuleMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private String id;
	
	@Column
	private String formName;
	
	@Column
	private String moduleName;
	
	@Column
	private String url;
	
	@Column(name = "order_no")
	private int formOrderNo;
	
	@Column
	private String help;
	
	@Column
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

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public int getFormOrderNo() {
		return formOrderNo;
	}

	public void setFormOrderNo(int formOrderNo) {
		this.formOrderNo = formOrderNo;
	}

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
