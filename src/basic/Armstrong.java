package basic;

import java.util.Scanner;

public class Armstrong {
 public static void main(String[] args) {
	 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("the number is armstrong");
		else
			System.out.println("the number is not armstrong");
}
}
