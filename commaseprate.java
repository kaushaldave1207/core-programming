import java.io.*;
import java.util.*;

public class commaseprate
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter the values--> ");
		String no= s.nextLine();
		String [] a=no.split(",");
		int max= Integer.parseInt(a[0]);
		for(int i=0;i<a.length;i++)
		{
			if(max<Integer.parseInt(a[i]))
			{
				max=Integer.parseInt(a[i]);
			}
		}
		System.out.print("maximum value is:" +max);
		}
}