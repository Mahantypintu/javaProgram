package basic;

import java.util.Scanner;

public class Pallindrome {
 public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int temp=n;
	int rev=0;
	while(n!=0)
	{
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	if(rev==temp)
	{
		System.out.println("The number is pallindrome");
	}
	else
	{
		System.out.println("The number is not pallindrome");
	}
	
}
}
