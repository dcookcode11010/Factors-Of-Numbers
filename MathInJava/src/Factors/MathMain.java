package Factors;

import java.util.Scanner;

public class MathMain 
{
	//How to factor a number in java
	public static void main(String[] args)
	{
		int n;
		
		System.out.println("Please enter a number: ");
		Scanner d = new Scanner(System.in);
		n = d.nextInt();
		
		MathPrint(n);
	}
	public static void MathPrint(int n) 
	{
		System.out.format("Factors of %d\n", n);
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				System.out.println(i + " ");
			}
		}

	}
}
