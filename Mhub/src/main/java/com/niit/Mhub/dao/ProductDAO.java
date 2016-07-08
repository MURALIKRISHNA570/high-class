package com.niit.Mhub.dao;

import java.util.List;

import com.niit.Mhub.model.ProductModel;

public interface ProductDAO {

	public void insertProductModel(ProductModel u);
	
	public List<ProductModel> getProductList();

}
