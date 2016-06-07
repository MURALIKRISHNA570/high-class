package com.niit.training;

public class Product {
	private int id;
	private String name;
	private Double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		if (price<0)
		{
			System.out.println("price valuue not valid");
		}
		else{
		this.price = price;
	}
	}

}
