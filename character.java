//Write a program to find the numbers of the characters in a string


package sum;
import java.util.*;
class num
{
	String  name;
	int n;
	Scanner s= new Scanner(System.in);
	void input()
	{
		System.out.println("enter the string");
		name=s.next();
		
	}
	void cal()
	{
		n= name.length();
		System.out.println("number of characters in a string "+n);
		
		
	}
}

 class character {
	 public static void main(String [] args)
	 {
		 num nu=new num();
		 nu.input();
		 nu.cal();
		 
	 }

}
