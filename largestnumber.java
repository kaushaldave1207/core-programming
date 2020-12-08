import java.io.*;
import java.util.*;

public class largestnumber
{
	public static void main(String args[])
	{
		int no,max;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of elements you want to in array-->");
		no=s.nextInt();
		int a[]=new int[no];
		System.out.print("enter the elements -->");
		for(int i=0;i<no;i++)
		{
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=0;i<no;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.print("maximum element of this array is:" +max);
		}
}