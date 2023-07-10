package basic;

import java.util.Scanner;

public class Swapping {
  public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two number:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapped");
	System.out.println(a);
	System.out.println(b);
}
}
