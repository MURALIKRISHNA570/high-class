package com.niit.Mhub.dao;

import java.util.List;

import com.niit.Mhub.model.ProductModel;
import com.niit.Mhub.model.SupplierModel;

public interface SupplierDAO {

	public void insertSupplierModel(SupplierModel u);
	
	public List<SupplierModel> getSupplierList();

}
