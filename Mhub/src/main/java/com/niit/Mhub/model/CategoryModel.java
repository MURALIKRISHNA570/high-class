package com.niit.Mhub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category01")
public class CategoryModel {
	
	@Id
	@Column
	private String Catid;
	@Column
	private String Name;
	@Column
	private String Description;
	public String getCatid() {
		return Catid;
	}
	public void setCatid(String catid) {
		Catid = catid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
}
