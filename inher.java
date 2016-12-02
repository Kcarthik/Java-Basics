package sum;
// Write a program to perform Inheritance with Employee super calls and manager and engineer  as base class



import java.util.*;

class employee
{
  String name;
  int id;
  employee(String name,int id)
  {
	this.name=name;
	this.id=id;
  }

  void display()
  {
	System.out.println(" Name: "+ name);
	System.out.println(" Salary: "+ id);
  }

}




class manager extends employee
{
  float salary;
  
  manager(String name,int id,float salary)
  {

    super(name,id);
    this.salary=salary;
  }

 void display()
  {
	System.out.println(" Name: "+ name);
	System.out.println(" id: "+ id);
        System.out.println(" salary: "+salary);
  }
}

class engineer extends manager
{
    String department;
    
    manager(String name,int id,float salary,String department)
    {
        
        super(name,id,salary);
        this.department=department;
    }
    
    void display()
    {
         System.out.println("------------Engineer-----------");
        System.out.println(" Name: "+ name);
        System.out.println(" id: "+ id);
        System.out.println(" Salary: "+salary);
        ystem.out.println(" Department: "+department;
    }
}


class inher
{
  public static void main(String args[])
  {

	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your name,salary and department");
	String name=s.next();
	float salary=s.nextFloat();
    int id=s.nextInt();
      String department=s.next();
        manager m=new manager(name,id,salary);
      engineer e=new engineer(name,id,salary,department)
	m.display();
	
  }
}
}
