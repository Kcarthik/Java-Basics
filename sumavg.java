//Write a program to perform Sum and average of the numbers given in the array


import java.util.Scanner;

class sum
{
  int n,i,sum=0;
  double avg;
  
  void calc()
  { 
        
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of elements");
	n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter the array elements");
	for(i=0;i<n;i++)
	{
	  a[i]=s.nextInt();
	  sum+=a[i];
	}
	avg=sum/n;
	System.out.println("sum="+sum+"\t"+"average="+avg);
  }

}2

class sumavg
{
 public static void main (String [] args)
 {
	sum c=new sum();
	c.calc();
 }
}