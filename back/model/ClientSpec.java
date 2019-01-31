package com.verizon.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RTM_CLIENT_USAGE")
public class ClientSpec implements Serializable{
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CLIENT_USAGE_ID")
	private int clientUsageId;

	@Column(name = "CLIENT_IP")
	private String clientip;

	@Column(name = "APP_NAME")
	private String appName;

	@Column(name = "MODIFIED_DATE")
	private String modifiedDate;

	@Column(name = "COUNTER")
	private int counter;
	
	public int getClientUsageId() {
		return clientUsageId;
	}

	public void setClientUsageId(int clientUsageId) {
		this.clientUsageId = clientUsageId;
	}

	public String getClientip() {
		return clientip;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	protected ClientSpec(){
		
	}
	
	public ClientSpec(int clientUsageId, String clientip, String appName, String modifiedDate, int counter ) {
		super();
		this.clientUsageId = clientUsageId;
		this.clientip= clientip;
		this.appName = appName;
		this.modifiedDate = modifiedDate;
		this.counter = counter;
	}

	@Override
	public String toString() {
		return String.format("ClientSpecific[clientUsageId=%d, clientip='%s', appName='%s', modifiedDate='%s', counter='%d']", clientUsageId, clientip,
				appName, modifiedDate, counter);
	}

}
