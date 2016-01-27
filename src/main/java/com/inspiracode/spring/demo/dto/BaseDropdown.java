package com.inspiracode.spring.demo.dto;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class BaseDropdown extends GenericDTO {

	@Column
	private String rawValue;
	
	public String getRawValue() {
		return rawValue;
	}
	public void setRawValue(String rawValue) {
		this.rawValue = rawValue;
	}
}
