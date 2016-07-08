package com.niit.Mhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.Mhub.model.CategoryModel;
import com.niit.Mhub.model.ProductModel;
import com.niit.Mhub.model.SignupModel;
import com.niit.Mhub.model.SupplierModel;
import com.niit.Mhub.service.CategoryService;
import com.niit.Mhub.service.ProductService;
import com.niit.Mhub.service.SupplierService;
import com.niit.Mhub.service.UserService;

@Controller
public class HomeController {
	@Autowired
	UserService us;
	@Autowired
	CategoryService cs;
	@Autowired
	SupplierService ss;
	@Autowired
	ProductService ps;

	
	@RequestMapping("/")
	public ModelAndView getHomePage() {

	
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/signup")
	public ModelAndView signup() {
        //us.insertSignupModel(sm);
		
		return new ModelAndView("signup","command",new SignupModel());
	}
	@RequestMapping("/addcustomer")
		public ModelAndView addCustomer(@ModelAttribute("SignupModel") SignupModel sm ) {
		System.out.println("in add customer");
            us.insertSignupModel(sm);
			
			ModelAndView mv=new ModelAndView("signup","command",new SignupModel());
			return mv;
		}

		


	@RequestMapping("/login")
	public ModelAndView login() {

		
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	//categories
	@RequestMapping("/categories")
	public ModelAndView categories() {

		
		ModelAndView mv=new ModelAndView("category","command",new CategoryModel());
		return mv;
	}
	@RequestMapping("/addcategory")
	public ModelAndView addCategory(@ModelAttribute("CategoryModel") CategoryModel c ) {
	System.out.println("in add category");
        cs.insertCategoryModel(c);
		
		ModelAndView mv=new ModelAndView("category","command",new CategoryModel());
		return mv;
	}
	
	//suppliers
	@RequestMapping("/suppliers")
	public ModelAndView suppliers() {

		
		ModelAndView mv=new ModelAndView("supplier","command",new SupplierModel());
		return mv;
	}
	@RequestMapping("/addsupplier")
	public ModelAndView addSupplier(@ModelAttribute("SupplierModel") SupplierModel c ) {
	System.out.println("in add supplier");
        ss.insertSupplierModel(c);
		
		ModelAndView mv=new ModelAndView("supplier","command",new SupplierModel());
		return mv;
	}
	
	//view suppliers
	@RequestMapping("/viewsupplier")
	public ModelAndView viewsuppliers()
	{
		List<SupplierModel> arr=ss.getSupplierList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("supplierslist","data",gson.toJson(arr));
	}

	
	//Products
	@RequestMapping("/Products")
	public ModelAndView product() {

		return new ModelAndView("product","command",new ProductModel());
	}
	@RequestMapping("/addproduct")
	public ModelAndView addProduct(@ModelAttribute("ProductModel") ProductModel pm ) {
	System.out.println("in add product");
	    ps.insertProductModel(pm);		
		ModelAndView mv=new ModelAndView("product","command",new ProductModel());
		return mv;
	}
	
	//view Products
	
	@RequestMapping("/viewproduct")
	public ModelAndView viewproducts()
	{
		List<ProductModel> arr=ps.getProductList();
		Gson gson=new Gson();
		String json=gson.toJson(arr);
		return new ModelAndView("productslist","data",gson.toJson(arr));
	}


	
	
	@RequestMapping("/adminhome")
	public ModelAndView adminhome(){
	ModelAndView mv= new ModelAndView("adminhome");
	return mv;

}
	
}
