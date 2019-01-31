package com.verizon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "VAST")
public class Vast  implements Serializable{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column (name = "vast_id")
	private String vastID;
	@Column (name = "vast_applid")
	private String vastApplID;
	@Column (name="vast_app_type")
	private String vastAppType;
	@Column (name= "vast_app_name")
	private String vastAppName;
	@Column (name = "vast_acronym")
	private String vastAcronym;
	@Column (name = "vast_investment_status")
	private String vastInvestmentStatus;
	@Column (name = "vast_availability_status")
	private String vastAvailabilityStatus;
	@Column (name = "vast_business_unit")
	private String vastBusinessUnit;
	@Column (name = "vast_road_map_indicator")
	private String vastRoadMapIndicator;
	@Column(name = "vast_status")
	private String vastStatus;
	@Column (name = "vast_custodian_contact_name")
	private String vastCustodianContactName;
	@Column (name = "vast_custodian_contact_email")
	private String vastCustodianContactEmail;
	@Column (name = "vast_custodian_contact_eid")
	private String vastCustodianContactEid;
	@Column (name = "vast_tier_three_contact_name")
	private String vastTierThreeContactName;
	@Column (name = "vast_tier_three_contact_email")
	private String vastTierThreeContactEmail;
	@Column (name = "vast_tier_three_contact_eid")
	private String vastTierThreeContactEid;
	@Column (name = "vast_tier_four_contact_name")
	private String vastTierFourContactName;
	@Column (name = "vast_tier_four_contact_email")
	private String vastTierFourContactEmail;
	@Column (name = "vast_tier_four_contact_eid")
	private String vastTierFourContactEid;
	@Column (name = "vast_tier_five_contact_name")
	private String vastTierFiveContactName;
	@Column  (name = "vast_tier_five_contact_email")
	private String vastTierFiveContactEmail;
	@Column (name = "vast_tier_five_contact_eid")
	private String vastTierFiveContactEid;
	@Column (name = "vast_tier_six_contact_name")
	private String vastTierSixContactName;
	@Column  (name = "vast_tier_six_contact_email")
	private String vastTierSixContactEmail;
	@Column (name = "vast_tier_six_contact_eid")
	private String vastTierSixContactEid;
	@Column (name = "vast_tier_seven_contact_name")
	private String vastTierSevenContactName;
	@Column  (name = "vast_tier_seven_contact_email")
	private String vastTierSevenContactEmail;
	@Column (name = "vast_tier_seven_contact_eid")
	private String vastTierSevenContactEid;
	
	public String getVastID() {
		return vastID;
	}
	public void setVastID(String vastID) {
		this.vastID = vastID;
	}
	
	public String getVastApplID() {
		return vastApplID;
	}
	public void setVastApplID(String vastApplID) {
		this.vastApplID = vastApplID;
	}
	public String getVastAppType() {
		return vastAppType;
	}
	public void setVastAppType(String vastAppType) {
		this.vastAppType = vastAppType;
	}
	public String getVastAppName() {
		return vastAppName;
	}
	public void setVastAppName(String vastAppName) {
		this.vastAppName = vastAppName;
	}
	public String getVastInvestmentStatus() {
		return vastInvestmentStatus;
	}
	public void setVastInvestmentStatus(String vastInvestmentStatus) {
		this.vastInvestmentStatus = vastInvestmentStatus;
	}
	public String getVastCustodianContactEmail() {
		return vastCustodianContactEmail;
	}
	public void setVastCustodianContactEmail(String vastCustodianContactEmail) {
		this.vastCustodianContactEmail = vastCustodianContactEmail;
	}
	public String getVastAcronym() {
		return vastAcronym;
	}
	public void setVastAcronym(String vastAcronym) {
		this.vastAcronym = vastAcronym;
	}
	public String getVastAvailabilityStatus() {
		return vastAvailabilityStatus;
	}
	public void setVastAvailabilityStatus(String vastAvailabilityStatus) {
		this.vastAvailabilityStatus = vastAvailabilityStatus;
	}
	public String getVastBusinessUnit() {
		return vastBusinessUnit;
	}
	public void setVastBusinessUnit(String vastBusinessUnit) {
		this.vastBusinessUnit = vastBusinessUnit;
	}
	public String getVastRoadMapIndicator() {
		return vastRoadMapIndicator;
	}
	public void setVastRoadMapIndicator(String vastRoadMapIndicator) {
		this.vastRoadMapIndicator = vastRoadMapIndicator;
	}
	public String getVastStatus() {
		return vastStatus;
	}
	public void setVastStatus(String vastStatus) {
		this.vastStatus = vastStatus;
	}
	public String getVastCustodianContactName() {
		return vastCustodianContactName;
	}
	public void setVastCustodianContactName(String vastCustodianContactName) {
		this.vastCustodianContactName = vastCustodianContactName;
	}
	public String getVastCustodianContactEid() {
		return vastCustodianContactEid;
	}
	public void setVastCustodianContactEid(String vastCustodianContactEid) {
		this.vastCustodianContactEid = vastCustodianContactEid;
	}
	public String getVastTierThreeContactName() {
		return vastTierThreeContactName;
	}
	public void setVastTierThreeContactName(String vastTierThreeContactName) {
		this.vastTierThreeContactName = vastTierThreeContactName;
	}
	public String getVastTierThreeContactEmail() {
		return vastTierThreeContactEmail;
	}
	public void setVastTierThreeContactEmail(String vastTierThreeContactEmail) {
		this.vastTierThreeContactEmail = vastTierThreeContactEmail;
	}
	public String getVastTierThreeContactEid() {
		return vastTierThreeContactEid;
	}
	public void setVastTierThreeContactEid(String vastTierThreeContactEid) {
		this.vastTierThreeContactEid = vastTierThreeContactEid;
	}
	public String getVastTierFourContactName() {
		return vastTierFourContactName;
	}
	public void setVastTierFourContactName(String vastTierFourContactName) {
		this.vastTierFourContactName = vastTierFourContactName;
	}
	public String getVastTierFiveContactEid() {
		return vastTierFiveContactEid;
	}
	public void setVastTierFiveContactEid(String vastTierFiveContactEid) {
		this.vastTierFiveContactEid = vastTierFiveContactEid;
	}
	public String getVastTierFiveContactEmail() {
		return vastTierFiveContactEmail;
	}
	public void setVastTierFiveContactEmail(String vastTierFiveContactEmail) {
		this.vastTierFiveContactEmail = vastTierFiveContactEmail;
	}
	public String getVastTierFourContactEid() {
		return vastTierFourContactEid;
	}
	public void setVastTierFourContactEid(String vastTierFourContactEid) {
		this.vastTierFourContactEid = vastTierFourContactEid;
	}
	public String getVastTierFourContactEmail() {
		return vastTierFourContactEmail;
	}
	public void setVastTierFourContactEmail(String vastTierFourContactEmail) {
		this.vastTierFourContactEmail = vastTierFourContactEmail;
	}
	public String getVastTierFiveContactName() {
		return vastTierFiveContactName;
	}
	public void setVastTierFiveContactName(String vastTierFiveContactName) {
		this.vastTierFiveContactName = vastTierFiveContactName;
	}
	public String getVastTierSixContactName() {
		return vastTierSixContactName;
	}
	public void setVastTierSixContactName(String vastTierSixContactName) {
		this.vastTierSixContactName = vastTierSixContactName;
	}
	public String getVastTierSixContactEmail() {
		return vastTierSixContactEmail;
	}
	public void setVastTierSixContactEmail(String vastTierSixContactEmail) {
		this.vastTierSixContactEmail = vastTierSixContactEmail;
	}
	public String getVastTierSixContactEid() {
		return vastTierSixContactEid;
	}
	public void setVastTierSixContactEid(String vastTierSixContactEid) {
		this.vastTierSixContactEid = vastTierSixContactEid;
	}
	public String getVastTierSevenContactName() {
		return vastTierSevenContactName;
	}
	public void setVastTierSevenContactName(String vastTierSevenContactName) {
		this.vastTierSevenContactName = vastTierSevenContactName;
	}
	public String getVastTierSevenContactEmail() {
		return vastTierSevenContactEmail;
	}
	public void setVastTierSevenContactEmail(String vastTierSevenContactEmail) {
		this.vastTierSevenContactEmail = vastTierSevenContactEmail;
	}
	public String getVastTierSevenContactEid() {
		return vastTierSevenContactEid;
	}
	public void setVastTierSevenContactEid(String vastTierSevenContactEid) {
		this.vastTierSevenContactEid = vastTierSevenContactEid;
	}
	
}
