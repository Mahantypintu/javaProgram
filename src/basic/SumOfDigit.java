package basic;

import java.util.Scanner;

public class SumOfDigit {
 public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int sum=0;
	while(n!=0)
	{
		int r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println("The sum of digit"+sum);
}
}
