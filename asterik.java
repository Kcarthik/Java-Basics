
//Write a program to print the output in * sequence


class perform
{
	int i,j;
	void cal()
	{
	 for(i=1;i<6;i++)
	 {
		 for(j=1;j<i;j++)
		 {
			 System.out.print("*");
		 }
	 System.out.println("");
	 }
	}
}

 class asterik {
	 public static void main(String [] args)
	 {
		 perform p=new perform();
		 p.cal();
	 }

}
