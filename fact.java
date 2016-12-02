// Write a program to find the factorial of a given number

import java.util.*;
class hi
{
	int sum=0,f=1,i;
	void cal(int n)
	{
	for(i=1;i<=n;i++)
	{
	 
         f=f*i;
	
	}
       System.out.println("factorial="+f);
}
}
class fact 
{
 public static void main(String []args)
  {
	Scanner s= new Scanner(System.in);
 
	hi o=new hi();
	System.out.println("enter a number"); 
       int n=s.nextInt();
	o.cal(n);
       
    }
}