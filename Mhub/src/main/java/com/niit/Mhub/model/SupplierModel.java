package com.niit.Mhub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="suppliers01")
public class SupplierModel {
	
	@Id
	@Column
	private String Supid;
	@Column
	private String Name;
	@Column
	private String Address;
	public String getSupid() {
		return Supid;
	}
	public void setSupid(String supid) {
		Supid = supid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
