package hcl;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,n=1;
		a=sc.nextInt();
		while(a!=0 && a>0)
		{
			n=n*a;
			a--;
		}
		System.out.println(n);
	}

}
