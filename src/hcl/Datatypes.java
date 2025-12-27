package hcl;

import java.util.Scanner;

public class Datatypes {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		String str;
		float f;
		boolean bool=true;
		a=sc.nextInt();
		str=sc.next();
		f=sc.nextFloat();
		System.out.println(a+str+f+bool);
	}
}
