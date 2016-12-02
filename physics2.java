//Write a program to calculate the given formula  V^2=U^2+2*as

import java.util.*;
import java.lang.*;
class exp
{
	double v;
float u,a,s;
	void cal(float u, float a, float s)
	{
	v= Math.sqrt(u*u-(2*a*s));
        System.out.println("v="+v);
	}
 
}
class physics2 
{
 public static void main(String []args)
  {
	Scanner sc= new Scanner(System.in);
 
	exp o=new exp();
	System.out.println("enter the value of  u , a ,s"); 
       
     float u=sc.nextFloat();
	float a=sc.nextFloat();
	float s=sc.nextFloat();
	o.cal(u,a,s);
       
     }
}