//Write a program to print the numbers from ten to 1 

class one
{
  void display()
  {
    int n=10;
    while(n>=1)
    {
	System.out.println(n);
         n--;
    }

}
}
class ten
{
 public static void main(String []args)
  {
	one o=new one();
        o.display();
       
     }
}