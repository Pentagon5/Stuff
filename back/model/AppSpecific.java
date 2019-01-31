package com.verizon.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RTM_APP_USAGE")
public class AppSpecific implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "APP_USAGE_ID")
	private int appUsageId;

	@Column(name = "APP_NAME")
	private String appName;

	@Column(name = "MODIFIED_DATE")
	private String modifiedDate;

	@Column(name = "COUNTER")
	private int counter;
	
	public int getAppUsageId() {
		return appUsageId;
	}

	public void setAppUsageId(int appUsageId) {
		this.appUsageId = appUsageId;
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
	
	protected AppSpecific() {
	}
	
	public AppSpecific(int appUsageId, String appName, String modifiedDate, int counter ) {
		super();
		this.appUsageId = appUsageId;
		this.appName = appName;
		this.modifiedDate = modifiedDate;
		this.counter = counter;
	}
	
	@Override
	public String toString() {
		return String.format("ApplicationSpecific[appUsageId=%d, appName='%s', modifiedDate='%s', counter='%d']", appUsageId,
				appName, modifiedDate, counter);
	}
}
