package com.firstgit;


public class MinChar {
	void minChar(char[] arr) 
	{char min=arr[0];
		for(int i=0;i<arr.length;i++) 
		{
			if(min>arr[0]) 
		
		{
			min=arr[0];
			
		}
		}
		System.out.println("Minimum Character is: ");
		System.out.println((char)( min));
	}
	public static void main(String[] args) 
	{
		char arr[]={'A','D','E','x','z','R'};
		
		MinChar mc=new MinChar();
		mc.minChar(arr);
		
	}


}
