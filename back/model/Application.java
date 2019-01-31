package com.verizon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity
@Table(name = "RTM_APP_DETAILS" , 
uniqueConstraints = {@UniqueConstraint(columnNames = {"APP_VAST_ID", "APPNAME"})})
public class Application implements Serializable {
 
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name="APP_DETAIL_ID")
	private int appDetId;
 
	@Column(name = "APP_VAST_ID" , unique = true)
	private String appVastId;
 
	@Column(name = "APPNAME")
	private String appName;
 
	@Column(name = "CONTENT_TYPE")
	private String contentType;
	
	@Column(name = "STATUS")
	private String status;
	
	
	public int getAppDetId() {
		return appDetId;
	}

	public void setAppDetId(int appDetId) {
		this.appDetId = appDetId;
	}

	public String getAppVastId() {
		return appVastId;
	}

	public void setAppVastId(String appVastId) {
		this.appVastId = appVastId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	protected Application() {
	}

	
	public Application(String appName, String appVastId, String contentType, String status ) {
		this.appName = appName;
		this.appVastId = appVastId;
		this.contentType = contentType;
		this.status = status;
	}
 
	@Override
	public String toString() {
		return String.format("Application[appDetId=%d, appName='%s', appVastId='%s', baseURI='%s', contentType='%s' ]", appDetId, appName, appVastId, contentType);
	}
}