//Write a program to compute Fibonnaci series


import java.util.*;
class series
{
  int n1=0,n2=1,n3=0,t;
  void display(int l)
  {
	
	System.out.println(n1+"\t"+n2);
	while(n3<l)
	{
	 t=n2;
	 n3=n1+n2;
	 System.out.println(n3+"\t");
	 n2=n3;
	 n1=t;
	}
   }
}

class Q5
{
  public static void main(String args[])
   {
	series e=new series();
	Scanner s=new Scanner(System.in);
	System.out.println("enter the limit");
	int l=s.nextInt();
	e.display(l);
    }
}