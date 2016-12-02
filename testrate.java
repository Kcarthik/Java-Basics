//Program to enter the name of the product and name of the product and number of quantities and the ratings given by the person


import java.util.*;

class rating
{
  String a[]=new String[2];
  int b[]=new int[2];
  int i,sum=0;
  float avg;
  Scanner s=new Scanner(System.in);

  void input()
  {
	System.out.println("...........Mobile Rating........");
	System.out.println("enter your name and rating");
	for(i=0;i<2;i++)
	{
	  a[i]=s.next();
	  b[i]=s.nextInt();
 	}
  }	   

  void display()
  {
	for(i=0;i<2;i++)
	{
	  System.out.println(" Name: "+a[i]);
	  System.out.println(" Rating: "+b[i]);
	  
	}
	for(i=0;i<2;i++)
	 {
	   sum+=b[i];
	 }
	avg=sum/2.0f;
	System.out.println(" \n Average Rating: "+ avg);
   }
}


class testrate
{
  public static void main(String args[])
   {
       rating r=new rating();
	r.input();
	r.display();
    }
}
