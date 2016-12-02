//Write a program to perform multiple interface


import java.util.Scanner;

interface employee
{
  void update();
}

class manager implements employee
{ 
  float sal,usal;
  String name,uname;
  Scanner s=new Scanner(System.in);
  void input()
  {
	System.out.println("...........Manager..............");
	System.out.println("enter your name and salary");
	name=s.next();
	sal=s.nextFloat();
   }

   public void update()
    {	
        
	System.out.println("enter the new name");
	uname=s.next();
	System.out.println("enter the new salary");
	usal=s.nextFloat();
        System.out.println("updated name: "+uname);
	System.out.println("updated salary: "+ usal);

    }
}

class engineer implements employee
{
  
  float sal,usal;
  String name,uname;
  Scanner s=new Scanner(System.in);
  void input()
  {
	System.out.println("...........Engineer..............");
	System.out.println("enter your name and salary");
	name=s.next();
	sal=s.nextFloat();
   }

 public void update()
    {
	System.out.println("enter the new name");
	uname=s.next();
	System.out.println("enter the new salary");
	usal=s.nextFloat();
        System.out.println("updated name: "+uname);
	System.out.println("updated salary: "+ usal);

    }
}

class testinter
{
 public static void main(String args[])
  {
	manager m=new manager();
	engineer e=new engineer();
	m.input();
	m.update();
	e.input();
	e.update();
   }
}