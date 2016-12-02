// Write a program to find the sum of 1^2+2^2+3^2


import java.util.*;
class sum
{
     public static void main(String args[])
     {
    	 
    	int num,sum=0,t;
    	Scanner s=new Scanner(System.in);
    		 System.out.println("enter the num");
    		 num=s.nextInt();
    		 while(num>0)
    		 {
    			 t=num%10;
    			 num=num/10;
    			 sum+=t*t;
    		 }
    	System.out.println("the value is ="+sum);
     }
     
}
