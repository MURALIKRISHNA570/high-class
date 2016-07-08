package com.niit.Mhub.service;

import java.util.List;

import com.niit.Mhub.model.SupplierModel;

public interface SupplierService {

	public void insertSupplierModel(SupplierModel u);
	
	List<SupplierModel> getSupplierList();
}
