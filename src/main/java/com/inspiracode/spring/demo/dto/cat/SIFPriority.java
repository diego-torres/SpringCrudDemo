package com.inspiracode.spring.demo.dto.cat;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.inspiracode.spring.demo.dto.BaseDropdown;

@Entity
@Table(name="cat_priority")
@AttributeOverrides({@AttributeOverride(name="id", column = @Column), @AttributeOverride(name="rawValue", column = @Column)})
public class SIFPriority extends BaseDropdown {
	
}
