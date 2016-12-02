// Write a program to reverse the charcters of a string

import java.util.Scanner;

class str
{
	String name,r="";
	int n,i;
	Scanner s= new Scanner(System.in);
	void input()
	{
		System.out.println("enter the string");
		name=s.next();
		
	}
	void compute()
	{
		n=name.length();
		for(i=n-1;i>=0;i--)
		{
			r= r+name.charAt(i);
			
			
		}
		System.out.println(r);
	}
}

class reverse {

	public static void main(String args[])
	{
		str st= new str();
		st.input();
		st.compute();
	}
}
