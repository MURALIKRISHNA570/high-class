package com.niit.Mhub.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Mhub.model.ProductModel;

@Repository
public class ProductDAOimpl implements ProductDAO{

	@Autowired(required=true)
	private SessionFactory sessionFactory;
	    @Transactional
		public void insertProductModel(ProductModel u)
		{
			Session s=this.sessionFactory.openSession();
			Transaction t=s.beginTransaction();
			s.save(u);
			t.commit();
		}
		@Override
		@SuppressWarnings("unchecked")
		@Transactional(propagation=Propagation.SUPPORTS)
		public List<ProductModel> getProductList() {
			// TODO Auto-generated method stub
			System.out.println("-----------  "+sessionFactory);
			Session s=sessionFactory.openSession();
			Transaction t = s.beginTransaction();
			System.out.println("In dao ");
			List<ProductModel> al=new ArrayList<ProductModel>();
					 al=s.createQuery("from ProductModel").list();
			 t.commit();
			 return al;

		}

}
