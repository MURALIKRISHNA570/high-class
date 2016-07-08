package com.niit.Mhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.Mhub.dao.CategoryDAO;
import com.niit.Mhub.model.CategoryModel;

@Service
public class CategoryServiceimpl implements CategoryService{

	@Autowired
	CategoryDAO categoryDAO;
	public void insertCategoryModel(CategoryModel u)
	{
		categoryDAO.insertCategoryModel(u);
	}

}
