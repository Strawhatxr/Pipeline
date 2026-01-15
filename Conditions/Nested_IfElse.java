
package Conditions;

import java.util.Scanner;

public class Nested_IfElse 
{

	 public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the marks (0 to 100):");
		int marks=sc.nextInt();
		
		if (marks >=90 && marks<=100) 
		{
			System.out.println("Grade:A");
		}
		else if (marks >=80 && marks<90) 
		{
			System.out.println("Grade:B");
		}
		else if (marks >=70 && marks<80) 
		{
			System.out.println("Grade:C");
		}
		else if (marks >=60 && marks<70) 
		{
			System.out.println("Grade:D");
		}
		else if (marks >=35 && marks< 60) 
		{
			System.out.println("Grade:E");
		}
		else if (marks >100) 
		{
			System.out.println("Invalid Data: Enter correct marks(0 to 100)");
		}
		else 
		{
			System.out.println("Fail");
		}
		sc.close();
	}

}
