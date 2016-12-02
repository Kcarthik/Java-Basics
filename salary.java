// Write a program to enter the name,number of products,and provide the percentage of the spent amount


import java.util.*;

class exp
{
  String name,pname;
  int q;
  float sal,price,total,rem,per;
  Scanner s=new Scanner(System.in);
  void input()
  {
	
	System.out.println("enter your name and salary");
	name=s.next();
	sal=s.nextFloat();
  }
 
  void product()
  {
	System.out.println("enter the name of the product");
	pname=s.next();
	System.out.println("enter the number of products");
	q=s.nextInt();
	System.out.println("enter the price of the product");
	price=s.nextFloat();
	total=q*price;
	rem=sal-total;
	per=(total*100)/sal;
	System.out.println("name of product="+pname);
	System.out.println("number of the product="+q);
	System.out.println("total price="+total);
	System.out.println("salary="+sal);
	System.out.println("remaining salary="+rem);
	System.out.println("spent percentage="+per);
 }
}

class salary
{
  public static void main(String args[])
  {
	exp e=new exp();
	e.input();
	e.product();
  }
}
		