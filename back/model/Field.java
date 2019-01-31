package com.verizon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "RTM_SENSITIVE_FIELDS")
public class Field implements Serializable {
 
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name="FIELD_ID")
	private int fieldId;
 
	@Column(name = "FIELD_NAME")
	private String fieldName;
	
	@Column(name = "FIELD_TYPE")
	private String fieldType;
	
	@Column(name = "APP_NAME")
	private String appName;
	
	public long getFieldId() {
		return fieldId;
	}


	public void setFieldId(int fieldId) {
		this.fieldId = fieldId;
	}


	public String getFieldName() {
		return fieldName;
	}


	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	

	public String getFieldType() {
		return fieldType;
	}


	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}


	public String getAppName() {
		return appName;
	}


	public void setAppName(String appName) {
		this.appName = appName;
	}


	protected Field() {
	}

	
	public Field( String fieldName, String fieldType, String appName ) {
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.appName = appName;
	}
 
	@Override
	public String toString() {
		return String.format("Field[fieldId=%d, fieldName='%s']", fieldId, fieldName);
	}
}