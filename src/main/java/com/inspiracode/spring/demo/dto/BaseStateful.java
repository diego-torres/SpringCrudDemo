package com.inspiracode.spring.demo.dto;

public abstract class BaseStateful extends BaseTrackable {
	private String entityStatus;
	private boolean locked;
	
	public String getEntityStatus() {
		return entityStatus;
	}
	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
}
