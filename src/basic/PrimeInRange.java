package basic;

import java.util.Scanner;

public class PrimeInRange {
 public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
    int n=sc.nextInt();
    System.out.println("The prime number between 1 to "+n+":");
	for(int i=1;i<=n;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				count++;
		}
		if(count==2)
			System.out.print(i+" ");
	}
}
}
