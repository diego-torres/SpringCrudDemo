package com.inspiracode.spring.demo.dto.ctrl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.inspiracode.spring.demo.dto.BaseStateful;
import com.inspiracode.spring.demo.dto.cat.SIFPriority;

@Entity
@Table(name="ctrl_sif")
public class SIF extends BaseStateful {
	
	@Column
	private String applicationProgram;
	
	@OneToOne
	private SIFPriority priority;
	
	public String getApplicationProgram() {
		return applicationProgram;
	}

	public void setApplicationProgram(String applicationProgram) {
		this.applicationProgram = applicationProgram;
	}
}
