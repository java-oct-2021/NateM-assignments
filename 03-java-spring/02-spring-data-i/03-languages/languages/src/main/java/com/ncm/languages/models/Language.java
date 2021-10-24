package com.ncm.languages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="languages")
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 2, max = 20)
	private String name;
	@NotNull
	@Size(min = 2, max = 20)
	private String creator;
	@NotNull
	@Min(1)
	private Integer version;
	
	public Language() {
	}
	public Language(String name, String creator, Integer version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
	}
	
	//Getters and Setters
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator() {
		return creator;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Integer getVersion() {
		return version;
	}
	
}
	

