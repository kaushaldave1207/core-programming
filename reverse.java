import java.io.*;
import java.util.*;

public class reverse
{
	static String alter(String str,int k,int len)
	{
		for(int i=0;i<str.length();)
		{
			if(i+k>len)
			break;
			str=str.substring(0,i)+new String(new StringBuilder			(str.substring(i,i+k)).reverse())+str.substring(i+k);

			i += k;
		}
		return str;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string :--> ");
		String str = input.nextLine();
		System.out.println("enter the k value :--> ");
		int k = input.nextInt();
		int len=str.length();
		System.out.println(alter(str,k,len));
	}
}