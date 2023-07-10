package basic;

import java.util.Scanner;

public class PerfectNum {
 public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
			sum=sum+i;
	}
	if(sum==n)
		System.out.println("It is perfect number");
	else
		System.out.println("It is not perfect number");
}
}
