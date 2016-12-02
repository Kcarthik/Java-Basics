// Write a program to print Even numbers from 2 to 100 using do  while 


class num
{
  void display()
  {
  int n=2;
    do
    {
	System.out.println(n);
	n+=2;
    }while(n<=100);

}
}
class even 
{
 public static void main(String []args)
  {
	num o=new num();
        o.display();
       
     }
}