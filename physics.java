////Write a program to calculate the given formula  V=U+as

import java.util.*;
class exp
{
	float v,u,a,s;
	void cal(float u, float a, float t)
	{
	v=u+a*s;
        System.out.println("v="+v);
	}
 
}
class physics 
{
 public static void main(String []args)
  {
	Scanner s= new Scanner(System.in);
 
	exp o=new exp();
	System.out.println("enter the value of  u , a ,s"); 
       
	float u=s.nextFloat();
	float a=s.nextFloat();
	float s=s.nextFloat();
	o.cal(u,a,t);
       
     }
}