package com.niit.training;

public class Test {

	public static void main(String[] args) {
        Product p=new Product();
        p.setId(101);
        p.setName("vikram");
		p.setPrice(50000d);
		System.out.println( "id:"+ p.getId());
		System.out.println( "name:"+ p.getName());
		System.out.println( "price:"+ p.getPrice());

	}

}
