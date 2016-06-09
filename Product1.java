class Product1
{
int id;
String pname;
double price;
Product1(int i,String name,double p)
{
id=i;
pname=name;
price=p;
}
public String toString()
{
return id+"  "+pname+"  "+price;
}
public static void main(String[] args)
{
Product1 p1=new Product1(1,"fruit",30d);
System.out.println(p1);
}
}