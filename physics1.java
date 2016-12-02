//Write a program to calculate the given formula  s=u*t+1/2*t^2

import java.util.*;
class exp
{
	float s,u,a,t;
	void cal(float u, float a, float t)
	{
	s=u*t+(0.5f*a*t*t);
        System.out.println("s="+s);
	}
 
}
class physics1 
{
 public static void main(String []args)
  {
	Scanner s= new Scanner(System.in);
 
	exp o=new exp();
	System.out.println("enter the value of  u , a ,t"); 
       
	float u=s.nextFloat();
	float a=s.nextFloat();
	float t=s.nextFloat();
	o.cal(u,a,t);
       
     }
}