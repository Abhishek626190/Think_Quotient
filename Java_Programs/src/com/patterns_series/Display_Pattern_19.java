package com.patterns_series;

public class Display_Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=i||j<=i)
				 {
				 if(j%2==0&&i%2==0)
					System.out.print("1");
				 
				 else if(j%2!=0&&i%2!=0)
						System.out.print("1");
			 
				 else  
						System.out.print("0");
				 
				 }
				 
 		   }
			System.out.println("");
		
	   }

 }
}
