package basic;

import java.util.Scanner;

public class Power {
 public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int p=sc.nextInt();
	int temp=p;
	int pow=1;
	while(p>0)
	{
		pow=pow*n;
		p--;
	}
	System.out.println("The power of "+n+" raised to "+temp+" is "+pow);
}
}
