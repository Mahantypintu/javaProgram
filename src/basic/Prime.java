package basic;

import java.util.Scanner;

public class Prime {
 public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int count=0;
	for(int i=1;i<=n;i++)  // for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
			count++;
	}
	if(count==2)  //count==0
		System.out.println("This is prime number");
	else
		System.out.println("This is not prime number");
}
}
