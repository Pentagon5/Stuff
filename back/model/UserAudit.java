package com.verizon.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RTM_USER_AUDIT")
public class UserAudit implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AUDIT_ID")
	private int auditId;

	@Column(name = "APP_NAME")
	private String appName;

	@Column(name = "FIELD_NAME")
	private String fieldName;

	@Column(name = "OPERATION")
	private String operation;

	@Column(name = "DATE")
	private String date;

	public int getAuditId() {
		return auditId;
	}

	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	protected UserAudit() {
	}
	
	public UserAudit(String appName, String fieldName, String operation, String date) {
		super();
		this.appName = appName;
		this.fieldName = fieldName;
		this.operation = operation;
		this.date = date;
	}

	@Override
	public String toString() {
		return String.format("Audit[auditId=%d, appName='%s', fieldName='%s', operation='%s', date='%s']", auditId,
				appName, fieldName, operation, date);
	}

}