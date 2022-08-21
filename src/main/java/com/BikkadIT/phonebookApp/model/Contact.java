package com.BikkadIT.phonebookApp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	public Integer contactId;
	public String contactName;
	public String contactNumber;
	public String contactEmail;
	public Character activeSwitch;
	public LocalDate createdDate;
	public LocalDate  updateDate;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public Character getActiveSwitch() {
		return activeSwitch;
	}
	public void setActiveSwitch(Character activeSwitch) {
		this.activeSwitch = activeSwitch;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "ContactDetails [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber="
				+ contactNumber + ", contactEmail=" + contactEmail + ", activeSwitch=" + activeSwitch + ", createdDate="
				+ createdDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
