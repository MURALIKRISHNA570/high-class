package com.niit.Mhub.service;

import java.util.List;

import com.niit.Mhub.model.ProductModel;

public interface ProductService {

	public void insertProductModel(ProductModel u);

	List<ProductModel> getProductList();


}
