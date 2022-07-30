package com.ineuron.assignments.assignments.assignment1;

public class IneuronPatternPrintDemo
{
	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=0; i<n;i++) //I
		{
			for (int j=0;j<n;j++) 
			{
				if(i==0||j==(n-1)/2||i==n-1)
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}//for loop j
			System.out.print(" ");
			
			for (int j=0;j<n;j++) //N
			{
				if(j==0||j==(n-1)||j==i) 
					System.out.print("*");
				else
					System.out.print(" ");
			}//for loop j
			System.out.print(" ");
			
			for (int j=0;j<n;j++) //E
			{
				if(i==0||j==0||i==(n-1)/2||i==n-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}//for loop j
			System.out.print(" ");
			
			for (int j=0;j<n;j++) //U
			{
				if(j==0||i==(n-1)||j==n-1) 
					System.out.print("*");
				else
					System.out.print(" ");
			}//for loop j
			System.out.print(" ");
			
	        
	 	    for (int j=0;j<n;j++) //R
	 	    {
	 		   if(j==0||i==0||(i==(n-1)/2)||(j==n-1&&i<(n-1)/2)||(i>(n-1)/2&&i==j))
	 			   System.out.print("*");
	 		   else
	 			   System.out.print(" ");
	 		   
			}//for loop j
			System.out.print(" ");
			
			 for (int j=0;j<n;j++) //O
		 	    {
		 		   if(i==0||j==0||i==n-1||j==n-1)
		 			   System.out.print("*");
		 		   else
		 			   System.out.print(" ");
		 		   
				}//for loop j
				System.out.print(" ");
				
				for (int j=0;j<n;j++) //N
				{
					if(j==0||j==(n-1)||j==i) 
						System.out.print("*");
					else
						System.out.print(" ");
				}//for loop j
				System.out.println();
			
			

				
			}//for loop i
			
		}//main method
	}//class


