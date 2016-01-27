package com.inspiracode.spring.demo.dto;

import java.util.Date;

public abstract class BaseTrackable extends GenericDTO {
	private String entityKind;
	private long userCreatedBy;
	private Date dateCreatedOn;
	private Date dateEditedOn;
	private Date dateRemovedOn;
	private long userLastEditedBy;
	private long userAssignedTo;
	private long userAssignedBy;
	private String transactionAction;
	
	public String getEntityKind() {
		return entityKind;
	}
	public void setEntityKind(String entityKind) {
		this.entityKind = entityKind;
	}
	public long getUserCreatedBy() {
		return userCreatedBy;
	}
	public void setUserCreatedBy(long userCreatedBy) {
		this.userCreatedBy = userCreatedBy;
	}
	public Date getDateCreatedOn() {
		return dateCreatedOn;
	}
	public void setDateCreatedOn(Date dateCreatedOn) {
		this.dateCreatedOn = dateCreatedOn;
	}
	public Date getDateEditedOn() {
		return dateEditedOn;
	}
	public void setDateEditedOn(Date dateEditedOn) {
		this.dateEditedOn = dateEditedOn;
	}
	public Date getDateRemovedOn() {
		return dateRemovedOn;
	}
	public void setDateRemovedOn(Date dateRemovedOn) {
		this.dateRemovedOn = dateRemovedOn;
	}
	public long getUserLastEditedBy() {
		return userLastEditedBy;
	}
	public void setUserLastEditedBy(long userLastEditedBy) {
		this.userLastEditedBy = userLastEditedBy;
	}
	public long getUserAssignedTo() {
		return userAssignedTo;
	}
	public void setUserAssignedTo(long userAssignedTo) {
		this.userAssignedTo = userAssignedTo;
	}
	public long getUserAssignedBy() {
		return userAssignedBy;
	}
	public void setUserAssignedBy(long userAssignedBy) {
		this.userAssignedBy = userAssignedBy;
	}
	public String getTransactionAction() {
		return transactionAction;
	}
	public void setTransactionAction(String transactionAction) {
		this.transactionAction = transactionAction;
	}
}
