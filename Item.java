package hashcode;

import java.util.HashSet;

public class Item {
	 static class Product
	{
	int id;
	String pname;
	double price;
	Product(int i,String name,double p)
	{
	id=i;
	pname=name;
	price=p;
	}
	Product()
	{}
	public int getId()
	{
	return id;
	}
	public String getPname()
	{
	return pname;
	}
	public double getPrice()
	{
	return price;
	}
	public void setId(int i)
	{
	id=i;
	}
	public void setPname(String name)
	{
	pname=name;
	}
	public void setPrice(double p)
	{
	price=p;
	}
	public String toString()
	{
	return id+"  "+pname+"  "+price;
	}
	public boolean equals(Object o)
	{
	Product p=(Product)o;
	return (getId()==p.getId());
	}
	public int hashcode()
	{
	final int n=129;
	int d=1;
	int result=d*n+this.id;
	return result;
	}
	public static  void main(String a[])
	{
	Product p1=new Product(1,"fruit",20.0d);
	System.out.println(p1);
	Product p2=new Product(1,"computer",200000.0d);
	boolean t=p1.equals(p2);
	System.out.println(t);
	Product p3=p1;
	System.out.println(p1.equals(p3));
	Product p4=new Product();
	Product p5=new Product();
	p4.setId(100);
	p4.setPname("abc");
	p4.setPrice(15d);
	p5.setId(100);
	p5.setPname("xyz");
	p5.setPrice(33d);
	System.out.println(p4.equals(p5));
	System.out.println(p4.hashcode());
	System.out.println(p5.hashcode());
	HashSet hs=new HashSet();
	hs.add(p4);
	hs.add(p5);
	System.out.println(hs);
	}
	}


}
