//Write a program ti print the odd number from 1 to 100

class num
{
  void display()
  {
 int i;
    for(i=1;i<=100;i+=2)
	{
	System.out.print(i+"\t");
	}
  
}
}
class odd 
{
 public static void main(String []args)
  {
	num o=new num();
        o.display();
       
     }
}